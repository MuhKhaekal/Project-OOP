package project.models;

public class PencakSilat extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Martial arts athletes from across Southeast Asia are fighting for 22 gold medals in silat at the 2023 SEA Games. This sport is divided into the categories of arts, men's competition and women's competition.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Centre (Hall E)";
        return venue;
    }
}
