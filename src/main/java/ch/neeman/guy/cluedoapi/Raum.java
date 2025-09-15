package ch.neeman.guy.cluedoapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Raum {
    private int id;
    private String name;
    private int anzahlfenster;
    private String besonderes;
}
