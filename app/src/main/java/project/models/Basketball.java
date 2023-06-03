package project.models;

public class Basketball extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Basketball matches at the 2023 SEA Games do not follow the international basketball federation (FIBA) eligibility criteria. This means, by giving citizenship to foreign players, a country can enter naturalized players into the national team (timnas) without having to have a passport of the country concerned before the age of 16.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Elephant Hall 2)";
        return venue;
    }
}