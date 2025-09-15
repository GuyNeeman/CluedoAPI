package ch.neeman.guy.cluedoapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Waffe {
    private int id;
    private String name;
    private String material;
    private String art;
    private Boolean wiederverwendbar;
}