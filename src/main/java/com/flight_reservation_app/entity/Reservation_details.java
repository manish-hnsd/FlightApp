package com.flight_reservation_app.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation_details extends AbstractEntity{
	
	private boolean checkedIn;
	private int numberOfBags;
	@OneToOne
	private Passenger_details passenger;
	@OneToOne
	private Flight_details flight;
	
	private boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger_details getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger_details passenger) {
		this.passenger = passenger;
	}
	public Flight_details getFlight() {
		return flight;
	}
	public void setFlight(Flight_details flight) {
		this.flight = flight;
	}
}
