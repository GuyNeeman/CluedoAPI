package ch.neeman.guy.cluedoapi;

public class Person {
    private int Id;
    private String Name;
    private int Alter;
    private String Haarfarbe;
    private String Geschlecht;

    public Person(int id, String name, int alter, String haarfarbe, String geschlecht) {
        Id = id;
        Name = name;
        Alter = alter;
        Haarfarbe = haarfarbe;
        Geschlecht = geschlecht;
    }

    public int getId() { return Id;}

    public void setId(int id) { Id = id;}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int alter) {
        Alter = alter;
    }

    public String getHaarfarbe() {
        return Haarfarbe;
    }

    public void setHaarfarbe(String haarfarbe) {
        Haarfarbe = haarfarbe;
    }

    public String getGeschlecht() {
        return Geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        Geschlecht = geschlecht;
    }

}