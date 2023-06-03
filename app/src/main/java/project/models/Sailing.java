package project.models;

public class Sailing extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "This year, the SEA Games sailing sports consist of wind foil, windsurfing, mixed ILCA, and others.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Sihanoukville. Sihanoukville Boulevard";
        return venue;
    }
}
