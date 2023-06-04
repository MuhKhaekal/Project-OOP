package project.models;

public class SoftTennis extends Sport {
    public String name() {
        String name = "Soft Tennis";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Similar to regular tennis, this sport uses a light rubber ball rather than a hard yellow ball.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Tennis Sport Center)";
        return venue;
    }
}
