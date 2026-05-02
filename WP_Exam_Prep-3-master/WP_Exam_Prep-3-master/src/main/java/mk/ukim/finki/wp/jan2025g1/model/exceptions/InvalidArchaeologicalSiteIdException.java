package mk.ukim.finki.wp.jan2025g1.model.exceptions;

public class InvalidArchaeologicalSiteIdException extends RuntimeException {
    public InvalidArchaeologicalSiteIdException(Long archeologicalSiteId) {
        super("Invalid archeological site id: " + archeologicalSiteId);
    }
}