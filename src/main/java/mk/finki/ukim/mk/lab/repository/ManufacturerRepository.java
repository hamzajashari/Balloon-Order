package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.DataHolder.DataHolder;
import mk.finki.ukim.mk.lab.model.Manufacturer;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Optional;

@Repository
public class ManufacturerRepository {
    public List<Manufacturer> findAll() {
        return DataHolder.manufacturerList;
    }
    public Optional<Manufacturer> findById(Long id){
        return DataHolder.manufacturerList
                .stream()
                .filter(i -> i.getId().equals(id)).findFirst();
    }
}
