package one.digitalinnovation.parking.model;

import java.time.LocalDateTime;

public class Parking {

    private String id;
    private String lincense;
    private String state;
    private String model;
    private String color;
    private LocalDateTime entrydate;
    private LocalDateTime exitdate;
    private Double bill;

    public Parking() {
    }

    public Parking(String id, String lincense, String state, String model, String color) {
        this.id = id;
        this.lincense = lincense;
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

    public String getLincense() {
        return lincense;
    }

    public void setLincense(String lincense) {
        this.lincense = lincense;
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
