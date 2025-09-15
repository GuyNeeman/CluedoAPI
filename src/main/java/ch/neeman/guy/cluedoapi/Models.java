package ch.neeman.guy.cluedoapi;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class Models {

    public final List<Person> person = new ArrayList<>();
    public final List<Raum> raum = new ArrayList<>();
    public final List<Waffe> waffe = new ArrayList<>();

    public Models() {
        // Personen
        person.add(new Person(1, "Albert", 50, "Schwarz", "Mann"));
        person.add(new Person(2, "Bob", 50, "Schwarz", "Mann"));
        person.add(new Person(3, "Clara", 32, "Braun", "Frau"));
        person.add(new Person(4, "David", 28, "Blond", "Mann"));
        person.add(new Person(5, "Eva", 45, "Rot", "Frau"));
        person.add(new Person(6, "Felix", 19, "Blond", "Mann"));
        person.add(new Person(7, "Greta", 60, "Grau", "Frau"));

        // Räume
        raum.add(new Raum(1, "Wohnzimmer", 4, "Sehr Gross"));
        raum.add(new Raum(2, "Küche", 2, "Modern und hell"));
        raum.add(new Raum(3, "Schlafzimmer", 3, "Gemütlich und klein"));
        raum.add(new Raum(4, "Keller", 1, "Dunkel und feucht"));
        raum.add(new Raum(5, "Bibliothek", 5, "Riesig mit vielen Büchern"));
        raum.add(new Raum(6, "Garten", 6, "Grün und weitläufig"));

        // Waffen
        waffe.add(new Waffe(1, "Dolch", "Eisen", "Messer", true));
        waffe.add(new Waffe(2, "Schwert", "Stahl", "Klinge", true));
        waffe.add(new Waffe(3, "Bogen", "Holz", "Fernkampf", false));
        waffe.add(new Waffe(4, "Armbrust", "Eisen/Holz", "Fernkampf", false));
        waffe.add(new Waffe(5, "Axt", "Stahl", "Nahkampf", true));
        waffe.add(new Waffe(6, "Speer", "Eisen/Holz", "Stoßwaffe", true));
        waffe.add(new Waffe(7, "Keule", "Holz", "Schlagwaffe", true));
        waffe.add(new Waffe(8, "Peitsche", "Leder", "Sonderwaffe", false));
    }

    public List<Person> getPerson() {
        return Collections.unmodifiableList(person);
    }

    public List<Raum> getRaum() {
        return Collections.unmodifiableList(raum);
    }

    public List<Waffe> getWaffe() {
        return Collections.unmodifiableList(waffe);
    }
}
