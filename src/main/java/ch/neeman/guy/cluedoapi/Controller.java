package ch.neeman.guy.cluedoapi;

import ch.neeman.guy.cluedoapi.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
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

    @GetMapping("/results")
    public List<Result> alleResults() {
        return logic.GetCase();
    }

}