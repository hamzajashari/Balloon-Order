package mk.finki.ukim.mk.lab.DataHolder;
import lombok.Getter;
import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Manufacturer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {

    public static List<Balloon> balloonList= new ArrayList<>(10);
    public static List<Manufacturer> manufacturerList= new ArrayList<>(5);

    @PostConstruct
    public void init(){
        Manufacturer manufacturer1=new Manufacturer("manufacturer-numberOne","MK","mkroad");

        Manufacturer manufacturer2=new Manufacturer("manufacturer-numberTwo","MK5","mkroad");

        Manufacturer manufacturer3=new Manufacturer("manufacturer-numberThree","MK4","mkroad");
    balloonList.add(new Balloon("Red","This balloon...",manufacturer1));
    balloonList.add(new Balloon("Yellow","This balloon...",manufacturer2));
    balloonList.add(new Balloon("Black","This balloon...",manufacturer1));
    balloonList.add(new Balloon("White","This balloon...",manufacturer2));
    balloonList.add(new Balloon("Purple","This balloon...",manufacturer3));
    balloonList.add(new Balloon("Pink","This balloon...",manufacturer3));
    balloonList.add(new Balloon("Rose","This balloon...",manufacturer2));
    balloonList.add(new Balloon("Orange","This balloon...",manufacturer1));
    balloonList.add(new Balloon("Brown","This balloon...",manufacturer2));
    balloonList.add(new Balloon("Green","This balloon...",manufacturer3));
    balloonList.add(new Balloon("Cyan","This balloon...",manufacturer3));


    manufacturerList.add(manufacturer1);
    manufacturerList.add(manufacturer2);
    manufacturerList.add(manufacturer3);
    }
}
