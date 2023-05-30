package project.models;

public class Country {
    private String name;
    private String sport;
    private int atlet;
    
    public Country(){
    }

    public Country(String name, String sport, int atlet) {
        this.name = name;
        this.sport = sport;
        this.atlet = atlet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getAtlet() {
        return atlet;
    }

    public void setAtlet(int atlet) {
        this.atlet = atlet;
    }
    

}