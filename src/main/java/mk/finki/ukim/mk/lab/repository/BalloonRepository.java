package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.DataHolder.DataHolder;
import mk.finki.ukim.mk.lab.model.Balloon;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository
public class BalloonRepository {



    public List<Balloon> findAllBalloons() {
       return DataHolder.balloonList;
    }
    public List<Balloon> findAllByNameOrDescription(String text){
        List<Balloon> result=new ArrayList<>();
        for(int i=0;i<DataHolder.balloonList.size();i++){
            if(DataHolder.balloonList.get(i).getName().contains(text) || DataHolder.balloonList.get(i).getDescription().contains(text)){
                result.add(DataHolder.balloonList.get(i));
            }
        }

        return result;
    }
}
