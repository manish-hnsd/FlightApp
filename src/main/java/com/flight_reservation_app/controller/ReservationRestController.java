package com.flight_reservation_app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight_reservation_app.dto.ReservationUpdateRequest;
import com.flight_reservation_app.entity.Reservation_details;
import com.flight_reservation_app.repository.ReservationRepository;


@RestController
public class ReservationRestController {
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	
	@RequestMapping("/reservation/{id}")
	public Reservation_details findReservation(@PathVariable("id") Integer id) {
		Optional<Reservation_details> findById = reservationRepo.findById(id);
		Reservation_details reservation = findById.get();
		return reservation;
	}
	@RequestMapping("/reservation")
	public Reservation_details updateReservation(@RequestBody ReservationUpdateRequest request) {
		Optional<Reservation_details> findById = reservationRepo.findById(request.getId());
		Reservation_details reservation = findById.get();
		reservation.setCheckedIn(request.isCheckedIn());
		reservation.setNumberOfBags(request.getNumberOfBags());
		return reservationRepo.save(reservation);
	}
}
