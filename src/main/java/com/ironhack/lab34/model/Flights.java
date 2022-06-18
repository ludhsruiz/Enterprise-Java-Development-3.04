package com.ironhack.lab34.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class Flights {
    @Id
    private String flightNumber;
    private String aircraftName;
    private Integer flightMileage;

    public Flights() {
    }

    public Flights(String flightNumber, String aircraftName, Integer flightMileage) {
        setFlightNumber(flightNumber);
        setAircraftName(aircraftName);
        setFlightMileage(flightMileage);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Integer flightMileage) {
        this.flightMileage = flightMileage;
    }
}
