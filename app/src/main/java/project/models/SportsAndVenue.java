package project.models;

public class SportsAndVenue {
    private String city;
    private String venue;
    private String event;
    
    public SportsAndVenue(){
    }
    
    public SportsAndVenue(String city, String venue, String event) {
        this.city = city;
        this.venue = venue;
        this.event = event;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

}
