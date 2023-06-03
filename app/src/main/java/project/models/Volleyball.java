package project.models;

public class Volleyball extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Volleyball at the Cambodian SEA Games is divided into beach volleyball teams and indoor volleyball for boys and girls.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Indoor Hall).\nSihanoukville. Otres Beach ()";
        return venue;
    }
}