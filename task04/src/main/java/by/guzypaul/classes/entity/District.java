package by.guzypaul.classes.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {
    private long id;
    private String name;
    private City districtCentre;
    private long population;
    private long area;
    private List<City> cities;

    public District() {
        this.cities = new ArrayList<>();
    }

    public District(long id, String name, City districtCentre, long population, long area, List<City> cities) {
        this.id = id;
        this.name = name;
        this.districtCentre = districtCentre;
        this.population = population;
        this.area = area;
        this.cities = cities;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getDistrictCentre() {
        return districtCentre;
    }

    public void setDistrictCentre(City districtCentre) {
        this.districtCentre = districtCentre;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof District)) return false;
        District district = (District) o;
        return getId() == district.getId() && getPopulation() == district.getPopulation() && getArea()
                == district.getArea() && Objects.equals(getName(), district.getName())
                && Objects.equals(getDistrictCentre(), district.getDistrictCentre())
                && Objects.equals(getCities(), district.getCities());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDistrictCentre(), getPopulation(), getArea(), getCities());
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", districtCentre='" + districtCentre + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", cities=" + cities +
                '}';
    }
}
