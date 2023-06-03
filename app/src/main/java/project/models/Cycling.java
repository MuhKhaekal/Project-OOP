package project.models;

public class Cycling extends Sport {
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Bicycle racing at the SEA Games Cambodia was held in two branches, namely road race (road racing) and mountain bike (MTB). The road race was held near the UNESCO world heritage site Angkor Wat. Meanwhile, mountain bike races were held in the Kulen Mountains";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Siem Reap. Mount Kulen";
        return venue;
    }
}
