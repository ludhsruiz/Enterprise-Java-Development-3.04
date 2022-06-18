package com.ironhack.lab34.repository;

import com.ironhack.lab34.model.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightsRepository extends JpaRepository<Flights, String> {
    public Flights findFlightsByFlightNumber (String flightNumber);
    public List<Flights> findByFlightMileageGreaterThan(Integer flightMileage);
}