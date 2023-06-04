package project.models;

public class Petanque extends Sport {
    public String name() {
        String name = "Petanque";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "This match with small metal balls was played at the Petanque Arena at the Morodok Techo National Stadium, Cambodia at the 2023 SEA Games. The categories that were played included men's singles, doubles and mixed.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Petanque Arena)";
        return venue;
    }
}
