package com.ironhack.lab34.repository;

import com.ironhack.lab34.model.Flights;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FlightsRepositoryTest {

    Flights flights;

    @Autowired
    private FlightsRepository flightsRepository;

    @BeforeEach
    public void setUp() {
        flights = new Flights("IB737", "Boeing-737", 1500);
        flightsRepository.save(flights);
    }

    @AfterEach
    public void tearDown() {
        flightsRepository.deleteAll();
    }


    @Test
    public void findFlightsByFlightNumber_FlightNumberExist_Flight() {
        Flights flights = flightsRepository.findFlightsByFlightNumber("IB737");
        assertEquals("IB737", flights.getFlightNumber());
    }

    @Test
    public void findByFlightMileageGreaterThan_MoreThan500MilesFlights_Flights() {
        List<Flights> flightsList = flightsRepository.findByFlightMileageGreaterThan(500);
        assertEquals(1, flightsList.size());
    }
}