package by.guzypaul.classes.dao.factory;

import by.guzypaul.classes.dao.CityDao;
import by.guzypaul.classes.dao.DistrictDao;
import by.guzypaul.classes.dao.RegionDao;
import by.guzypaul.classes.dao.impl.CityDaoImpl;
import by.guzypaul.classes.dao.impl.DistrictDaoImpl;
import by.guzypaul.classes.dao.impl.RegionDaoImpl;

public class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();
    private CityDao cityDaoImpl;
    private DistrictDao districtDaoImpl;
    private RegionDao regionDaoImpl;
    private boolean isCityDaoInitialized;
    private boolean isDistrictDaoInitialized;
    private boolean isRegionDaoInitialized;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return instance;
    }

    public CityDao getCityDaoImpl() {
        if (!isCityDaoInitialized) {
            cityDaoImpl = new CityDaoImpl();
            isCityDaoInitialized = true;
        }

        return cityDaoImpl;
    }

    public DistrictDao getDistrictDaoImpl() {
        if (!isDistrictDaoInitialized) {
            districtDaoImpl = new DistrictDaoImpl();
            isDistrictDaoInitialized = true;
        }

        return districtDaoImpl;
    }

    public RegionDao getRegionDaoImpl() {
        if(!isRegionDaoInitialized){
            regionDaoImpl = new RegionDaoImpl();
            isRegionDaoInitialized = true;
        }

        return regionDaoImpl;
    }
}
