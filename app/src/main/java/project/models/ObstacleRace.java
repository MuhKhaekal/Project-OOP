package project.models;

public class ObstacleRace extends Sport {
    public String name() {
        String name = "Obstacle Race";
        return name;
    }
    @Override
    public String showDescription() {
        String text = "The obstacle race at this year's SEA Games contains 12 hurdles with a distance of 100 meters. Obstacle race participants must go through uneven surfaces, trampolines to the monkey bar, jump the 1.2 meter wall, balance beam, pedal with their hands on the hanging wheels, swing on the hanging rings, and commando roll under the net, then swing the rope, climb the incline steep, and pressing the finish button, as quoted from The Star Malaysia. This unique sport was introduced at the 2019 Philippines SEA Games. This year, the obstacle race gold medals were won by athletes from that country.";
        return text;
    }
    @Override
    public String venue() {
        String venue = "Phnom Penh. Chroy Changvar Convention Centre (Car Park)";
        return venue;
    }
}