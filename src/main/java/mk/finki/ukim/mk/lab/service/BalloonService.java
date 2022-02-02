package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Manufacturer;

import java.util.List;
import java.util.Optional;

public interface BalloonService{
    List<Balloon> listAll();
    Optional<Balloon> findById(Long id);
    Optional<Balloon>save(String name, String description, Long manufacturerId);
    void deleteById(Long id);
    List<Balloon> searchByNameOrDescription(String text);
}