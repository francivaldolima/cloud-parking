package one.digitalinnovation.parking.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParkingDTO {
    private String id;
    private String lincense;
    private String state;
    private String model;
    private String color;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime entrydate;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime exitdate;
    private Double bill;

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
