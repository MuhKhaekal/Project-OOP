package project.models;

public class Hockey extends Sport {
    public String name() {
        String name = "Hockey";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "This year, the SEA Games hockey sport consists of field and indoor hockey.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (National Stadium), Chroy Changvar Convention Centre (Dinosaur Park Hall)";
        return venue;
    }
}