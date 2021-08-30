package by.guzypaul.classes.entity;

import java.util.ArrayList;
import java.util.List;

class District {
    private String district;
    private List<City> citiesList = new ArrayList<>();

    District(String district, ArrayList citiesList) {
        this.district = district;
        this.citiesList = citiesList;
    }

    String getDistrict() {
        return district;
    }

    static District addDistrict() {
        District district = new District("", null);
        System.out.println("Введите райной");
        district.district = Country.strInput();
        district.citiesList.add(City.addCity());
        return district;
    }
}
