package by.guzypaul.classes.controller;

import by.guzypaul.classes.dao.factory.DaoFactory;

public class Runner {
    public static void main(String[] args) {

//          System.out.println(DaoFactory.getInstance().getCityDaoImpl().findCityById(11));
//        System.out.println(DaoFactory.getInstance().getDistrictDaoImpl().findDistrictById(1));
//        System.out.println(DaoFactory.getInstance().getRegionDaoImpl().findRegionById(5));
        System.out.println(DaoFactory.getInstance().getCountryDaoImpl().findCountryById(1));
    }
}
