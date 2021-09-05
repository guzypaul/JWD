package by.guzypaul.classes.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
    private long id;
    private String name;
    private City regionCentre;
    private long population;
    private long area;
    private List<District> districts;

    public Region() {
        this.districts = new ArrayList<>();
    }

    public Region(long id, String name, City regionCentre, long population, long area, List<District> districts) {
        this.id = id;
        this.name = name;
        this.regionCentre = regionCentre;
        this.population = population;
        this.area = area;
        this.districts = districts;
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

    public City getRegionCentre() {
        return regionCentre;
    }

    public void setRegionCentre(City regionCentre) {
        this.regionCentre = regionCentre;
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

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;
        Region region = (Region) o;
        return getId() == region.getId() && getPopulation() == region.getPopulation() && getArea() == region.getArea() && Objects.equals(getName(), region.getName()) && Objects.equals(getRegionCentre(), region.getRegionCentre()) && Objects.equals(getDistricts(), region.getDistricts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getRegionCentre(), getPopulation(), getArea(), getDistricts());
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", regionCentre='" + regionCentre + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", districts=" + districts +
                '}';
    }
}
