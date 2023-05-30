package project.datasource;

import java.util.ArrayList;
import java.util.List;

import project.models.Country;

public class CountryDataSource {
    private static String[] countries = {"Brunei Darussalam", "Cambodia (Host)", 
    "East Timor", "Indonesian","Laos","Malaysia","Myanmar",
    "Philippines","Singapore","Thailand", "Vietnam"};
    
    private static String[] sports = {"Wushu", "Kun Bokator",
    "Boxing", "Pencak Silat", "Petanque", "Athletics", "Vovinam",
    "Wrestling", "Swimming", "Taekwondo", "Finswimming"};
    
    private static Integer[] athletes = {65, 896,
    90, 599, 576, 677, 341,
    860, 558, 846,702};
    
    public static List<Country> getCountryData(){
        List<Country> listCountry = new ArrayList<>();
        for (int i = 0; i < countries.length; i++) {
            listCountry.add(new Country(countries[i],sports[i],athletes[i]));
        }
        return listCountry;

    }
}
