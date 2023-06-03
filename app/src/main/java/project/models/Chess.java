package project.models;

public class Chess extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Chess at the 2023 SEA Games is divided into Cambodian special ouk chaktrang chess and Chinese xiangqi chess, quoted from Cambodia 2023. Uniquely, this Southeast Asian level chess match was held on the Phnom Penh University campus.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Royal University of Phnom Penh";
        return venue;
    }
}

