package project.models;

public class Golf extends Sport {
    public String name() {
        String name = "Golf";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Golf at this year's SEA Games was held at Garden City Golf Club, Phnom Penh. Female and male golf athletes play individually or in teams.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Garden City Golf Club";
        return venue;
    }
}