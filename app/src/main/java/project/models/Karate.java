package project.models;

public class Karate extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "The karate competition at the Cambodian SEA Games provided medals in the male and female kata and kumite categories.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Centre (Hall A)";
        return venue;
    }
}