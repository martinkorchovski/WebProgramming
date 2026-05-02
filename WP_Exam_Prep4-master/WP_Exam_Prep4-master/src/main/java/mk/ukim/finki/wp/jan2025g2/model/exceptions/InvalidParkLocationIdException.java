package mk.ukim.finki.wp.jan2025g2.model.exceptions;

public class InvalidParkLocationIdException extends RuntimeException {
    public InvalidParkLocationIdException(Long parkLocationId) {
        super("Invalid park location id: " + parkLocationId);
    }
}
