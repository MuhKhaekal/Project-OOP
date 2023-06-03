package project.models;

public class Teqball extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
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
