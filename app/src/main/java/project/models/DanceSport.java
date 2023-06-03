package project.models;

public class DanceSport extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Breakdancing is an athletic style of street dance whose roots are related to hip-hop music and the African American community in the United States. His iconic moves include head spins and acrobatic moves. Breakdancing was introduced at the 2019 Philippines SEA Games with competing athletes from the Philippines, Vietnam, Singapore, Indonesia and Thailand, quoted from The Star Malaysia. Dance-breaking will make its premiere at the 2024 Paris Summer Games.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Centre (Dinosaur Park Hall)";
        return venue;
    }
}
