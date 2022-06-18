package com.ironhack.lab34.repository;

import com.ironhack.lab34.model.Aircraft;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AircraftRepositoryTest {
    Aircraft aircrafts;

    @Autowired
    private AircraftRepository aircraftRepository;

    @BeforeEach
    public void setUp() {
        aircrafts = new Aircraft("Boeing-737", 300);
        aircraftRepository.save(aircrafts);
    }

    @AfterEach
    public void tearDown() {
        aircraftRepository.deleteAll();
    }

    @Test
    public void findAll_AircraftExist_Aircraft() {
        List<Aircraft> aircraftsList = aircraftRepository.findAll();
        assertEquals(1, aircraftsList.size());
    }

    @Test
    public void findAircraftsByAircraftName_AircraftsExist_Aircraft() {
        Aircraft aircraft = aircraftRepository.findAircraftByAircraftName("Boeing-737");
        assertEquals("Boeing-737", aircrafts.getAircraftName());
    }

    @Test
    public void findAircraftsByAircraftNameContaining_AircraftsExist_Aircraft() {
        List<Aircraft> aircraftList = aircraftRepository.findAircraftByAircraftNameContaining("Boeing");
        assertEquals("Boeing-737", aircraftList.get(0).getAircraftName());
    }
}

