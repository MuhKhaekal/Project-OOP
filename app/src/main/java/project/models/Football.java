package project.models;

public class Football extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "This sport has been competed since the first SEA Games in 1957 for the men's team. Meanwhile, women's soccer at the SEA Games has been held since the 1985 SEA Games in Thailand.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Army Stadium, Prince Stadium, Smart RSN Stadium, Morodok Techo Sports Complex (National Stadium)";
        return venue;
    }
}

