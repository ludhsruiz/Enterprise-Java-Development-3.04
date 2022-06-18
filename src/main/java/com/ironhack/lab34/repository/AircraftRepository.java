package com.ironhack.lab34.repository;

import com.ironhack.lab34.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AircraftRepository extends JpaRepository<Aircraft, String> {
    public Aircraft findAircraftByAircraftName (String aircraftName);
    public List<Aircraft> findAircraftByAircraftNameContaining (String aircraftName);
}
