package project.models;

public class Floorball extends Sport {
    public String name() {
        String name = "Floorball";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "This Swedish sport was originally introduced at The World Games Finland in 1997, as quoted from the International Floorball Federation (IFF) website. Floorball or floorball is divided into women's and men's championships at the 2023 SEA Games.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Centre (Dinosaur Park Hall)";
        return venue;
    }
}

