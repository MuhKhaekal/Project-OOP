package project.models;

public class Billiard extends Sport{
    private String name;
    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Billiards at the 2023 SEA Games will be competed at Nagaworld Aeon 2 Sen Sok, Phnom Penh. Athletes compete for carom, pool and snooker medals.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. AEON Mall Sen Sok City";
        return venue;
    }
}
