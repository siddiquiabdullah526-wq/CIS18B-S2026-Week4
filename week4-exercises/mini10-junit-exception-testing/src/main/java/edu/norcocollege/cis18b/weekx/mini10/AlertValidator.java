package edu.norcocollege.cis18b.weekx.mini10;

public class AlertValidator {
    public void validate(Alert alert) throws InvalidAlertException {
        if (alert == null) {
            throw new InvalidAlertException("Alert cannot be null.");
        }

        if (alert.message() == null || alert.message().isBlank()) {
            throw new InvalidAlertException("Message cannot be null or blank.");
        }

        if (alert.level() == null) {
            throw new InvalidAlertException("Level cannot be null.");
        }
    }
}
