package project.models;

public class Wushu extends Sport {
    public String name() {
        String name = "Wushu";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "Wushu at this year's SEA Games consists of duilian, nanquan, changquan, daoshu + gunshu, jianshu + qiang shu, nandao + nangun, taijiquan + taijijian, and sanda for men and women.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Center (Hall A)";
        return venue;
    }
}
