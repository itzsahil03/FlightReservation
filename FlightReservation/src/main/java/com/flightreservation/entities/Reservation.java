package com.flightreservation.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Reservation {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private boolean checkedIn;
	private int numberOfBags;
	
	@OneToOne
	private Passengers passengers;
	
	@OneToOne
	private Flight flight;
}
