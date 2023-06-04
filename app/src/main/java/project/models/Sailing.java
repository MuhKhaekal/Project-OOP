package project.models;

public class Sailing extends Sport {
    public String name() {
        String name = "Sailing";
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
