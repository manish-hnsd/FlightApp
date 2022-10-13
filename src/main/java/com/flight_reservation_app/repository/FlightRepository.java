package com.flight_reservation_app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight_reservation_app.entity.Flight_details;

public interface FlightRepository extends JpaRepository<Flight_details, Integer> {
	@Query("from Flight_details where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	List<Flight_details> findFlights(@Param("departureCity")String from,@Param("arrivalCity") String to,@Param("dateOfDeparture") Date departureDate);

}
