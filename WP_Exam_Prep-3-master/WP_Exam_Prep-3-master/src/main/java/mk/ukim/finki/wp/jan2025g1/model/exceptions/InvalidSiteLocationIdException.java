package mk.ukim.finki.wp.jan2025g1.model.exceptions;

public class InvalidSiteLocationIdException extends RuntimeException {
    public InvalidSiteLocationIdException(Long siteLocationId) {
        super("Invalid site location id: " + siteLocationId);
    }
}
