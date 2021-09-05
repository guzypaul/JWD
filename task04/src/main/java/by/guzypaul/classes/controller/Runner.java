package by.guzypaul.classes.controller;

import by.guzypaul.classes.dao.CityDao;
import by.guzypaul.classes.dao.factory.DaoFactory;
import by.guzypaul.classes.dao.impl.CityDaoImpl;
import by.guzypaul.classes.entity.City;

public class Runner {
    public static void main(String[] args) {

        System.out.println(DaoFactory.getInstance().getDistrictDaoImpl().findDistrictById(10));
    }
}
