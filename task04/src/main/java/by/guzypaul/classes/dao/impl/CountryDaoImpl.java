package by.guzypaul.classes.dao.impl;

import by.guzypaul.classes.dao.CountryDao;
import by.guzypaul.classes.dao.reader.TextFileReader;
import by.guzypaul.classes.dao.exception.DaoException;
import by.guzypaul.classes.dao.factory.DaoFactory;
import by.guzypaul.classes.entity.Country;
import by.guzypaul.classes.entity.Region;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountryDaoImpl implements CountryDao {
    private List<Country> countries;

    public CountryDaoImpl() {
        countries = readCountryData();
    }

    @Override
    public Country findCountryById(long id) {
        return countries.stream()
                .filter(country -> country.getId() == id)
                .findFirst()
                .orElseThrow(() -> new DaoException("invalid ID"));
    }

    private List<Country> readCountryData() throws DaoException {
        TextFileReader textFileReader = new TextFileReader();
        List<String> countriesData = textFileReader.readStringsFromFile("countriesInfo.txt");
        List<Country> countryList = new ArrayList<>();

        Iterator<String> countryIterator = countriesData.iterator();
        while (countryIterator.hasNext()) {
            if (countryIterator.next().equals("CountryInfo")) {
                Country country = new Country();
                List<Region> regions = new ArrayList<>();
                country.setId(Long.parseLong(countryIterator.next()));
                country.setName(countryIterator.next());
                country.setCapital(DaoFactory.getInstance().getCityDaoImpl()
                        .findCityById(Long.parseLong(countryIterator.next())));
                country.setPopulation(Long.parseLong(countryIterator.next()));
                country.setArea(Long.parseLong(countryIterator.next()));

                if (countryIterator.next().equals("regionInfo")) {
                    while (!countryIterator.next().equals("")) { //TODO
                        regions.add(DaoFactory.getInstance().getRegionDaoImpl()
                                .findRegionById(Long.parseLong(countryIterator.next())));
                    }
                }

                country.setRegions(regions);
                countryList.add(country);
            }
        }

        return countryList;
    }
}
