package mk.ukim.finki.wp.kol2025g3.model.exceptions;

public class InvalidVendorIdException extends RuntimeException {
    public InvalidVendorIdException(Long vendorId) {
        super("Invalid vendor ID: " + vendorId);
    }
}
