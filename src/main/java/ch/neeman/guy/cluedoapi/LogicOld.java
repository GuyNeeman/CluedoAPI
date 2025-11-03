package ch.neeman.guy.cluedoapi;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class LogicOld {

    private final Models models = new Models();
    private final Random random = new Random();

    public Person getPerson() {
        Person person = models.getPerson().get(random.nextInt(models.getPerson().size()));
        return person;
    }

    public Waffe getWeapon() {
        Waffe weapon = models.getWaffe().get(random.nextInt(models.getWaffe().size()));
        return weapon;
    }

    public Raum getRoom() {
        Raum room = models.getRaum().get(random.nextInt(models.getRaum().size()));
        return room;
    }
}
