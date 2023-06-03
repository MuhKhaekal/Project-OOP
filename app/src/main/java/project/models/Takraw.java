package project.models;

public class Takraw extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Takraw is contested in the team team, doubles, doubles and hoop categories at the 2023 SEA Games";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Basketball Hall)";
        return venue;
    }
}
