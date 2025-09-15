package ch.neeman.guy.cluedoapi;

import java.util.*;

public class Logic {

    private final List<Case> cases = new ArrayList<>();
    private final Models models = new Models();
    private final Random random = new Random();

    public Case getCase() {
        Person person = models.getPerson().get(random.nextInt(models.getPerson().size()));
        Waffe weapon = models.getWaffe().get(random.nextInt(models.getWaffe().size()));
        Raum room = models.getRaum().get(random.nextInt(models.getRaum().size()));

        Case c = new Case(person.getName(), weapon.getName(), room.getName());
        cases.add(c);

        return c;
    }
}
