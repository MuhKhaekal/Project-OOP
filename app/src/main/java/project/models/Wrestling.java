package project.models;

public class Wrestling extends Sport {
    public String name() {
        String name = "Wrestling";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Wrestling at the 2023 SEA Games is divided into women's, men's freestyle and men's Greco Roman categories according to weight.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Center (Hall E)";
        return venue;
    }
}
