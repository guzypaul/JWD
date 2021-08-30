package by.guzypaul.classes.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    static int numInput;
    static double doublInput;
    static String strInput;
    String country, capital;
    private List<Region> regionsList = new ArrayList<>();
    private List<District> districtsList = new ArrayList<>();
    private List<City> citiesList = new ArrayList<>();

    Country(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    Country(List regionsList, List districtsList, List citiesList) {
        this.regionsList = regionsList;
        this.districtsList = districtsList;
        this.citiesList = citiesList;
    }

    String getCountry() {
        return country;
    }

    String getCapital() {
        return capital;
    }

    public List getRegionList() {
        return regionsList;
    }

    static String strInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            strInput = sc.nextLine();
        } else {
            System.out.println("Недопустимый ввод");
            strInput();
        }
        return strInput;
    }

    static int numInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            numInput = sc.nextInt();
        } else {
            System.out.println("Недопустимый ввод");
            numInput();
        }
        return numInput;
    }

    static double doublInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            doublInput = sc.nextDouble();
        } else {
            System.out.println("Недопустимый ввод");
            doublInput();
        }
        return doublInput;
    }

    static Country addCountry() {
        Country country = new Country(null,null,null);
        country.regionsList.add(Region.addRegion());
        return country;
    }

}







/*class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Country country = new Country(Country.strInput(), Country.strInput());
        while (true) {
            System.out.println("Выберите команду:\n" +
                    "0 - выход\n" +
                    "1 - добавить область\n" +
                    "2 - вывести на консоль столицу\n" +
                    "3 - количество областей\n" +
                    "4 - площадь\n" +
                    "5 - областные центры");

            int choice = Country.numInput();
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > 5) {
                System.out.println("Повторите ввод");
                continue;
            }
            switch (choice) {
                case 1:
                    country.addCountry();
                    break;
                case 2:
                    System.out.println("Страна: " + country.getCountry());
                    System.out.println("Столица: " + country.getCapital());
                    break;
                case 3:
                    System.out.println("Кол - во областей: " + country.getRegionList().size());
                    break;
                case 4:
                    //System.out.println("Площадь всех областей: " + country.squareRegions());
            }
        }
    }
}*/
