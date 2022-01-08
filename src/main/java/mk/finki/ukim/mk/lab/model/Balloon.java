package mk.finki.ukim.mk.lab.model;

import lombok.Data;
import mk.finki.ukim.mk.lab.service.BallonServiceImpl;
@Data
public class Balloon {
    String name;
    String description;

    public Balloon(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
