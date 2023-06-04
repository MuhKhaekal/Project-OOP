package project.models;

public class Teqball extends Sport {
    public String name() {
        String name = "Teqball";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "The CAMSOC Cambodia Committee agreed that one teqball sport would be included in the demonstration category at the 2023 SEA Games.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Federation of Youth Hall";
        return venue;
    }
}
