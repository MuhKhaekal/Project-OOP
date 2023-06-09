package project.models;

public class Judo extends Sport {
    public String name() {
        String name = "Judo";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "The judo competition at the 2023 SEA Games consists of kata, men's combat and women's combat.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Centre (Hall C)";
        return venue;
    }
}