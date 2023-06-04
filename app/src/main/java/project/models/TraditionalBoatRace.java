package project.models;

public class TraditionalBoatRace extends Sport {
    public String name() {
        String name = "Traditional Boat Race";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "The dragon boat competition is divided into teams of 3, 5 and 12 team members to race distances of 250, 500 and 800 m. The teams are divided into male, female and mixed at the SEA Games Cambodia";
         return text;
    }
    @Override
    public String venue() {
        String venue = "Kampot. Prek Kampot";
        return venue;
    }
}
