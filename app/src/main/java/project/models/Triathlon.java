package project.models;

public class Triathlon extends Sport {
    public String name() {
        String name = "Triathlon";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "The sports at the 2023 SEA Games are attended by men's singles, women's, and mixed athletes with 4 team relays.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Siem Reap. Angkor Wat";
        return venue;
    }
}
