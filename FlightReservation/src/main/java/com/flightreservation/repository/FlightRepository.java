package com.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight , Long> {

}
