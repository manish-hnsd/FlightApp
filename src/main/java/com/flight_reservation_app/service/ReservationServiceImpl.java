package com.flight_reservation_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_reservation_app.dto.ReservationRequest;
import com.flight_reservation_app.entity.Flight_details;
import com.flight_reservation_app.entity.Passenger_details;
import com.flight_reservation_app.entity.Reservation_details;
import com.flight_reservation_app.repository.FlightRepository;
import com.flight_reservation_app.repository.PassengerRepository;
import com.flight_reservation_app.repository.ReservationRepository;
import com.flight_reservation_app.utility.PDFgenerator;


@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private PassengerRepository passengerRepo;

	@Autowired
	private FlightRepository flightRepo;

	@Autowired
	private ReservationRepository reservationRepo;

	@Autowired
	private PDFgenerator pdfGenerator;
	
	@Override
	public Reservation_details bookFlight(ReservationRequest request) {
		
		Passenger_details passenger = new Passenger_details();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		int flightId = request.getFlightId();
		Optional<Flight_details> findById = flightRepo.findById(flightId);
		Flight_details flight = findById.get();
		
		Reservation_details reservation = new Reservation_details();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		String filePath = "C:\\Users\\hansd\\OneDrive\\Desktop\\WorkSpace\\STS\\flight_reservation_app\\Tickets"+reservation.getId()+".pdf";
		reservationRepo.save(reservation);
		
		
		pdfGenerator.generateItenary(reservation, filePath);
		
		return reservation;
	}

}
