package project.models;

public class ESport extends Sport {
    public String name() {
        String name = "E-Sports";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Esports competitions at the 2023 SEA Games include games AK2, PUBG Mobile, Mobile Legends: Bang Bang (MLBB), League of Legends, Wild Rift, and Cross Fire.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Nagaworld 2, Olympia Mall";
        return venue;
    }
}
