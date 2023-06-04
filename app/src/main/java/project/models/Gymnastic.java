package project.models;

public class Gymnastic extends Sport {
    public String name() {
        String name = "Gymnastic";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "The gymnastic sports at the 2023 SEA Games consist of artistic and aerobics.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Olympic Center Marquee)";
        return venue;
    }
}

