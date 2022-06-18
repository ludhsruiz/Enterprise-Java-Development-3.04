package com.ironhack.lab34.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aircraft")
public class Aircraft {
    @Id
    private String aircraftName;
    private Integer totalSeats;


    public Aircraft() {
    }


    public Aircraft(String aircraftName, Integer totalSeats) {
        setAircraftName(aircraftName);
        setTotalSeats(totalSeats);
    }



    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }
}

