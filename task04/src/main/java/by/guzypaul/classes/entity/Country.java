package by.guzypaul.classes.entity;

import java.util.List;
import java.util.Objects;

public class Country {
    private long id;
    private String name;
    private City capital;
    private long population;
    private long area;
    private List<Region> regions;

    public Country(long id, String name, City capital, long population, long area, List<Region> regions) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.regions = regions;
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

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
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

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return getId() == country.getId() && getPopulation() == country.getPopulation() && getArea() == country.getArea() && Objects.equals(getName(), country.getName()) && Objects.equals(getCapital(), country.getCapital()) && Objects.equals(getRegions(), country.getRegions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCapital(), getPopulation(), getArea(), getRegions());
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", regions=" + regions +
                '}';
    }
}
