package com.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.entities.Flight;
import com.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation , Long> {

}
