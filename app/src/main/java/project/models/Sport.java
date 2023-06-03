package project.models;

public abstract class Sport{
    public abstract String name(String name);
    public abstract String showDescription();
    public abstract String venue();
}


class Badminton extends Sport{
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Athletics for the marathon and 20 km walk at the 2023 SEA Games will be held at Angkor Wat. Meanwhile, track & field was held at Morodok Techo National Stadium, Cambodia";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Morodok Techo Sports Complex (National Stadium)";
        return venue;
    }
}