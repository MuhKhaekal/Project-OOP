package project.models;

public class Fencing extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "This martial sport originated when civilians or common people started carrying swords in the late 15th century. Quoted from the British Fencing website, a long piercing sword called a rapier was originally used for fencing in Spain and Italy, then throughout Europe But in the 17th century, the rapier was replaced in France by a lighter small sword. In order not to get hurt, the players must be specially dressed with the mask.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Centre (Hall B)";
        return venue;
    }
}
