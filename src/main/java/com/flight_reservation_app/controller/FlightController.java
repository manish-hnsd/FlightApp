package com.flight_reservation_app.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app.entity.Flight_details;
import com.flight_reservation_app.repository.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	private FlightRepository flightrepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap model){
		List<Flight_details> findFlights = flightrepo.findFlights(from,to,departureDate);
		//System.out.println(findFlights);
		model.addAttribute("findFlights", findFlights);
		return "displayFlights";
	}
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Integer flightId, ModelMap modelMap) {
		//System.out.println(flightId);
		Optional<Flight_details> findById = flightrepo.findById(flightId);
		Flight_details flight = findById.get();
		modelMap.addAttribute("flight",flight);
		return "showReservation";
	}
	
}
