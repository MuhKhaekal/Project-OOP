package project.models;

public class MartialArts extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Martial arts sports are divided into arnis, ju-jitsu, kickboxing, muay, kun bokator, and vovinam at the 2023 SEA Games.";
         return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Centre (Hall E)";
        return venue;
    }
}