package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.repository.BalloonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BallonServiceImpl implements BalloonService {


    private final BalloonRepository balloonRepository;
    public BallonServiceImpl(BalloonRepository balloonRepository) {
        this.balloonRepository = balloonRepository;
    }


    @Override
    public List<Balloon> listAll() {
        return balloonRepository.findAllBalloons();
    }

    @Override
    public List<Balloon> searchByNameOrDescription(String text) {
        return balloonRepository.findAllByNameOrDescription(text);
    }
}
