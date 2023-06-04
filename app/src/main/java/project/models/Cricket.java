package project.models;

public class Cricket extends Sport {
    public String name() {
        String name = "Cricket";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Cricket is not considered popular in Cambodia, but in Commonwealth countries. Nevertheless, the Cambodia Cricket Federation (CFC) and the Asia Cricket Council finally succeeded in pushing the 2023 host nation to enter cricket in this year's SEA Games, quoted by the Khmer Times.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. AZ Group Cricket Oval";
        return venue;
    }
}

