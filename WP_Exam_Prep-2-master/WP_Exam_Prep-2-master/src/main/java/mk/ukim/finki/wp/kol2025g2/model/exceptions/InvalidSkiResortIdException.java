package mk.ukim.finki.wp.kol2025g2.model.exceptions;

public class InvalidSkiResortIdException extends RuntimeException {
    public InvalidSkiResortIdException(Long skiResortId) {
        super("Invalid ski resort id " + skiResortId);
    }
}
