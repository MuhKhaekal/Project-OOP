package project.models;

public class TableTennis extends Sport {
    public String name() {
        String name = "Table Tennis";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "This sport consists of doubles, singles, team and mixed doubles categories for men and women at the Cambodian SEA Games.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Table Tennis Hall)";
        return venue;
    }
}
