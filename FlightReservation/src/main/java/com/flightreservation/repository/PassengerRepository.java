package com.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.entities.Passengers;

public interface PassengerRepository extends JpaRepository<Passengers , Long>{

}
