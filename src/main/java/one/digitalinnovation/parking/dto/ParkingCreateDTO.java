package one.digitalinnovation.parking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

public class ParkingCreateDTO {

    private String lincense;
    private String state;
    private String model;
    private String color;

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
}
