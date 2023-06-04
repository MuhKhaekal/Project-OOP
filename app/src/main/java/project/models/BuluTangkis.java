package project.models;

public class BuluTangkis extends Sport {
    public String name() {
        String name = "Bulu Tangkis";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "One of the popular sports in Indonesia, it was played in the first SEA Games in 1959 in Bangkok, Thailand. Badminton is a sport that many Indonesian athletes have won in this competition since 1977";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Morodok Techo Sports Complex (Badminton Hall)";
        return venue;
    }
}
