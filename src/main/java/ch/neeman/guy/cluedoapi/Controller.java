package ch.neeman.guy.cluedoapi;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cluedo")
@CrossOrigin("*")
public class Controller {

    private final Models model;

    public Controller(Models model) {
        this.model = model;
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

}
