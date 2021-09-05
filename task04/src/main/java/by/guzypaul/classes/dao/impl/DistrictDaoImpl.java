package by.guzypaul.classes.dao.impl;

import by.guzypaul.classes.dao.DistrictDao;
import by.guzypaul.classes.dao.TextFileReader;
import by.guzypaul.classes.dao.exception.DaoException;
import by.guzypaul.classes.dao.factory.DaoFactory;
import by.guzypaul.classes.entity.City;
import by.guzypaul.classes.entity.District;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DistrictDaoImpl implements DistrictDao {
    private List<District> districts;

    public DistrictDaoImpl() {
        districts = readDistrictData();
    }

    @Override
    public List<District> findAllDistrict() {
        return districts;
    }

    @Override
    public District findDistrictById(long id) {
        return districts.stream()
                .filter(district -> district.getId() == id)
                .findFirst()
                .orElseThrow(() -> new DaoException("invalid ID"));
    }

    private List<District> readDistrictData() throws DaoException {
        TextFileReader textFileReader = new TextFileReader();
        List<String> districtsData = textFileReader.readStringsFromFile("districtsInfo.txt");
        List<District> districtList = new ArrayList<>();

        Iterator<String> districtIterator = districtsData.iterator();
        while (districtIterator.hasNext()) {
            if (districtIterator.next().equals("DistrictInfo")) {
                District district = new District();
                List<City> cities = new ArrayList<>();
                district.setId(Long.parseLong(districtIterator.next()));
                district.setName(districtIterator.next());
                district.setDistrictCentre(DaoFactory.getInstance().getCityDaoImpl()
                        .findCityById(Long.parseLong(districtIterator.next())));
                district.setPopulation(Long.parseLong(districtIterator.next()));
                district.setArea(Long.parseLong(districtIterator.next()));

                if (districtIterator.next().equals("citiesInfo")) {
                    while (!districtIterator.next().equals("")) { //TODO skip one - WTF!!!
                        cities.add(DaoFactory.getInstance().getCityDaoImpl()
                                .findCityById(Long.parseLong(districtIterator.next())));
                    }
                }

                district.setCities(cities);
                districtList.add(district);
            }
        }

        return districtList;
    }
}
