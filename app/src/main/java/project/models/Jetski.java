package project.models;

public class Jetski extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "This competition, which takes place in water, began to appear in Europe in standing or sitting categories in 1950. Jetski is one of the sports that is expected to become the way for the SEA Games gold medal for Indonesia based on its winning record in previous years.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Sihanoukville. Sihanoukville Boulevard";
        return venue;
    }
}
