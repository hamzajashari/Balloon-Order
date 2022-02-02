package mk.finki.ukim.mk.lab.exceptions;

import java.util.function.Supplier;

public class BalloonCannotBeDeleted extends RuntimeException{
    public BalloonCannotBeDeleted(Long id){
        super(String.format("Balloon with id=%d cannot be deleted",id));
    }
}
