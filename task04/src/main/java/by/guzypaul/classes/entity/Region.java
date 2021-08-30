package by.guzypaul.classes.entity;

import java.util.ArrayList;
import java.util.List;

class Region {
    private String region;
    private double square;
    private District district;
    private List<District> districtsList = new ArrayList<>();


    Region(String region, double square, List districtsList) {
        this.region = region;
        this.square = square;
        this.districtsList = districtsList;
    }

    String getRegion() {
        return region;
    }

    double getSquare() {
        return square;
    }

    static Region addRegion() {
        Region region = new Region("", 0, null);
        System.out.println("Введите область");
        region.region = Country.strInput();
        System.out.println("Введите площадь в км2");
        region.square = Country.doublInput();
        region.districtsList.add(District.addDistrict());
        return region;
    }
}
