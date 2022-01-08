package mk.finki.ukim.mk.lab.DataHolder;
import lombok.Getter;
import mk.finki.ukim.mk.lab.model.Balloon;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {

    public static List<Balloon> balloonList= new ArrayList<>(10);

    @PostConstruct
    public void init(){
    balloonList.add(new Balloon("Red","This balloon..."));
    balloonList.add(new Balloon("Yellow","This balloon..."));
    balloonList.add(new Balloon("Black","This balloon..."));
    balloonList.add(new Balloon("White","This balloon..."));
    balloonList.add(new Balloon("Purple","This balloon..."));
    balloonList.add(new Balloon("Pink","This balloon..."));
    balloonList.add(new Balloon("Rose","This balloon..."));
    balloonList.add(new Balloon("Orange","This balloon..."));
    balloonList.add(new Balloon("Brown","This balloon..."));
    balloonList.add(new Balloon("Green","This balloon..."));
    balloonList.add(new Balloon("Cyan","This balloon..."));
    }
}
