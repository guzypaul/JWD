package by.guzypaul.classes.dao.impl;

import by.guzypaul.classes.dao.CityDao;
import by.guzypaul.classes.dao.TextFileReader;
import by.guzypaul.classes.dao.exception.DaoException;
import by.guzypaul.classes.entity.City;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityDaoImpl implements CityDao {
    private List<City> cities;

    public CityDaoImpl() {
        cities = readCityData();
    }

    @Override
    public City findCityById(long id) {
        return cities.stream()
                .filter(city -> city.getId() == id)
                .findFirst()
                .orElseThrow(() -> new DaoException("invalid ID"));
    }

    private List<City> readCityData() throws DaoException {
        TextFileReader textFileReader = new TextFileReader();
        List<String> citiesData = textFileReader.readStringsFromFile("citiesInfo.txt");
        List<City> cities = new ArrayList<>();

        Iterator<String> cityIterator = citiesData.iterator();
        while(cityIterator.hasNext()){
            if(cityIterator.next().equals("CityInfo")){
                City city = new City();
                city.setId(Long.parseLong(cityIterator.next()));
                city.setName(cityIterator.next());
                city.setPopulation(Long.parseLong(cityIterator.next()));
                cities.add(city);
            }
        }

        return cities;
    }
}
