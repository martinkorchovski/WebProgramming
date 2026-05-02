package mk.ukim.finki.wp.jan2025g2.model.exceptions;

public class InvalidNationalParkIdException extends RuntimeException {
    public InvalidNationalParkIdException(Long nationalParkId) {
        super("Invalid National Park Id: " + nationalParkId);
    }
}