package one.digitalinnovation.parking.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Parking {

    @Id
    private String id;
    private String license;
    private String state;
    private String model;
    private String color;
    private LocalDateTime entrydate;
    private LocalDateTime exitdate;
    private Double bill;

    public Parking() {
    }

    public Parking(String id, String license, String state, String model, String color) {
        this.id = id;
        this.license = license;
        this.state = state;
        this.model = model;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(LocalDateTime entrydate) {
        this.entrydate = entrydate;
    }

    public LocalDateTime getExitdate() {
        return exitdate;
    }

    public void setExitdate(LocalDateTime exitdate) {
        this.exitdate = exitdate;
    }

    public Double getBill() {
        return bill;
    }

    public void setBill(Double bill) {
        this.bill = bill;
    }
}
