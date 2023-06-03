package project.models;

public class Aquatics extends Sport{
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "The aquatic sports at the 2023 SEA Games consist of diving (aquatics diving), swimming (aquatics swimming), diving, and water polo (aquatics water polo).";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Olympic Swimming Pool)";
        return venue;
    }
}
