package ch.neeman.guy.cluedoapi;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cluedo")
@CrossOrigin("*")
public class Controller {

    private final Models model;
    private final Logic logic;

    public Controller(Models model, Logic logic) {
        this.model = model;
        this.logic = logic;
    }

    @GetMapping("/person")
    public List<Person> allePerson() {
        return model.getPerson();
    }

    @GetMapping("/raum")
    public List<Raum> alleRaum() {
        return model.getRaum();
    }

    @GetMapping("/waffe")
    public List<Waffe> alleWaffe() {
        return model.getWaffe();
    }

    @PostMapping("/killer")
    public Person getKiller() {
        return logic.getPerson();
    }

    @PostMapping("/room")
    public Raum getRoom() {
        return logic.getRoom();
    }

    @PostMapping("/weapon")
    public Waffe getWeapon() {
        return logic.getWeapon();
    }


}
