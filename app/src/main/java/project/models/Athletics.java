package project.models;

public class Athletics extends Sport{
    @Override
    public String name() {
        String name = "Athletics";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Athletics for the marathon and 20 km walk at the 2023 SEA Games will be held at Angkor Wat. Meanwhile, track & field was held at Morodok Techo National Stadium, Cambodia";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (National Stadium)";
        return venue;
    }
}
