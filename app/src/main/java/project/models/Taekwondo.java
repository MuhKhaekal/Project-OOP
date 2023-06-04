package project.models;

public class Taekwondo extends Sport {
    public String name() {
        String name = "Taekwondo";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Taekwondo athletes at the 2023 SEA Games compete in the freestyle, poomsae, and weight-based categories, both singles, pairs, and the men's and women's team.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Centre (Hall F)";
        return venue;
    }
}