package project.models;

public class Tennis extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "The tennis categories contested at this year's SEA Games are singles, doubles, and men's, women's and mixed teams.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Tennis Sports Center)";
        return venue;
    }
}
