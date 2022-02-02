package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.exceptions.ManufacturerNotFoundException;
import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Manufacturer;
import mk.finki.ukim.mk.lab.repository.BalloonRepository;
import mk.finki.ukim.mk.lab.repository.ManufacturerRepository;
import mk.finki.ukim.mk.lab.service.BalloonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BallonServiceImpl implements BalloonService {

    private final ManufacturerRepository manufacturerRepository;
    private final BalloonRepository balloonRepository;
    public BallonServiceImpl(ManufacturerRepository manufacturerRepository, BalloonRepository balloonRepository) {
        this.manufacturerRepository = manufacturerRepository;
        this.balloonRepository = balloonRepository;
    }


    @Override
    public List<Balloon> listAll() {
        return balloonRepository.findAllBalloons();
    }

    @Override
    public Optional<Balloon> findById(Long id) {
        return balloonRepository.findById(id);
    }

    @Override
    public Optional<Balloon> save(String name, String description, Long manufacturerId){
        Manufacturer manufacturer = this.manufacturerRepository
                        .findById(manufacturerId)
                        .orElseThrow(() -> new ManufacturerNotFoundException(manufacturerId));

        return balloonRepository.save(name,description,manufacturer);
    }
    public void deleteById(Long id){
        balloonRepository.deleteById(id);
    }

    @Override
    public List<Balloon> searchByNameOrDescription(String text) {
        return balloonRepository.searchByNameOrDescription(text);
    }
}
