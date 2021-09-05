package by.guzypaul.classes.dao;

import by.guzypaul.classes.entity.District;

import java.util.List;

public interface DistrictDao {
    District findDistrictById(long id);
    List<District> findAllDistrict();
}

