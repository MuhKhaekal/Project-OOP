package project.models;

public class Boxing extends Sport{
    public String name() {
        String name = "Boxing";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Southeast Asian boxers at this year's SEA Games competed at mini-flyweight, flyweight, bantamweight, featherweight, lightweight, light welterweight, welterweight, light middleweight, light heavyweight, cruiserweight and heavyweight."; 
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Badminton Hall, Elephant Hall 1)\nChroy Changvar Convention Centre (Hall G)";
        return venue;
    }
}
