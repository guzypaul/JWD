package by.guzypaul.classes.dao.impl;

import by.guzypaul.classes.dao.RegionDao;
import by.guzypaul.classes.dao.TextFileReader;
import by.guzypaul.classes.dao.exception.DaoException;
import by.guzypaul.classes.dao.factory.DaoFactory;
import by.guzypaul.classes.entity.District;
import by.guzypaul.classes.entity.Region;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegionDaoImpl implements RegionDao {
    private List<Region> regions;

    public RegionDaoImpl() {
        regions = readRegionData();
    }

    @Override
    public Region findRegionById(long id) {
        return regions.stream()
                .filter(region -> region.getId() == id)
                .findFirst()
                .orElseThrow(() -> new DaoException("invalid ID"));
    }

    private List<Region> readRegionData() throws DaoException {
        TextFileReader textFileReader = new TextFileReader();
        List<String> regionsData = textFileReader.readStringsFromFile("regionsInfo.txt");
        List<Region> regionList = new ArrayList<>();

        Iterator<String> regionIterator = regionsData.iterator();
        while (regionIterator.hasNext()) {
            if (regionIterator.next().equals("RegionInfo")) {
                Region region = new Region();
                List<District> districts = new ArrayList<>();
                region.setId(Long.parseLong(regionIterator.next()));
                region.setName(regionIterator.next());
                region.setRegionCentre(DaoFactory.getInstance().getCityDaoImpl()
                        .findCityById(Long.parseLong(regionIterator.next())));
                region.setPopulation(Long.parseLong(regionIterator.next()));
                region.setArea(Long.parseLong(regionIterator.next()));

                if (regionIterator.next().equals("districtInfo")) {
                    while (!regionIterator.next().equals("")) {
                        districts.add(DaoFactory.getInstance().getDistrictDaoImpl()
                                .findDistrictById(Long.parseLong(regionIterator.next())));
                    }
                }

                region.setDistricts(districts);
                regionList.add(region);
            }
        }

        return regionList;
    }
}
