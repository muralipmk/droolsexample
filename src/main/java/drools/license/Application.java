package drools.license;

import java.util.Date;

public class Application {
    private Date dateApplied;
    private boolean valid;
    // getter and setter methods here

    public Date getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(Date dateApplied) {
        this.dateApplied = dateApplied;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}