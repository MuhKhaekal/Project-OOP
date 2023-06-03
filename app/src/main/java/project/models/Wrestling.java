package project.models;

public class Wrestling extends Sport {
    private String name;

    @Override
    public String name(String name) {
        this.name = name;
        return name;
    }

    @Override
    public String showDescription() {
        String text = "The Cambodia SEA Games weightlifting competition consists of 55 kg, 61 kg, 67 kg, 73 kg, 81 kg, 89 kg and 89+ kg categories for men. Meanwhile, the women's category consists of 45 kg, 49 kg, 55 kg, 59 kg, 64 kg, 71 kg and +71 kg.";
        return text;
    }

    @Override
    public String venue() {
        String venue = "Wrestling at the 2023 SEA Games is divided into women's, men's freestyle and men's Greco Roman categories according to weight.";
        return venue;
    }
}