package project.datasource;

import java.util.ArrayList;
import java.util.List;
import project.models.SportsAndVenue;

public class SportDataSource {
    private static String[] city = {"Brunei Darussalam", "Cambodia (Host)", 
    "East Timor", "Indonesian","Laos","Malaysia","Myanmar",
    "Philippines","Singapore","Thailand", "Vietnam"};
    
    private static String[] venue = {"Wushu", "Kun Bokator",
    "Boxing", "Pencak Silat", "Petanque", "Athletics", "Vovinam",
    "Wrestling", "Swimming", "Taekwondo", "Finswimming"};
    
    private static String[] event = {"Wushu", "Kun Bokator",
    "Boxing", "Pencak Silat", "Petanque", "Athletics", "Vovinam",
    "Wrestling", "Swimming", "Taekwondo", "Finswimming"};
    
    public static List<SportsAndVenue> getSportsAndVenuesData(){
        List<SportsAndVenue> listSportsAndVenue = new ArrayList<>();
        for (int i = 0; i < city.length; i++) {
            listSportsAndVenue.add(new SportsAndVenue(city[i], venue[i], event[i]));
        }
        return listSportsAndVenue;

    }
}
