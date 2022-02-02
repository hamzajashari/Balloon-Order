package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.DataHolder.DataHolder;
import mk.finki.ukim.mk.lab.exceptions.BalloonCannotBeDeleted;
import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Manufacturer;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BalloonRepository {

    public List<Balloon> findAllBalloons() {
       return DataHolder.balloonList;
    }
    public Optional<Balloon> save(String name, String description,Manufacturer manufacturer) {
            DataHolder.balloonList.removeIf(i -> i.getName().equals(name));
            Balloon balloon = new Balloon(name, description,manufacturer);
            DataHolder.balloonList.add(balloon);
            return Optional.of(balloon);
    }
    public Optional<Balloon> findById(Long id){
        return DataHolder.balloonList.stream().filter(i -> i.getId().equals(id)).findFirst();
    }
    public void deleteById(Long id){
        DataHolder.balloonList.removeIf(i->i.getId().equals(id));
    }
    public List<Balloon> searchByNameOrDescription(String text) {
        return DataHolder.balloonList.stream()
                .filter(r -> r.getName().contains(text) || r.getManufacturer().getCountry().contains(text))
                .collect(Collectors.toList());
    }
}
