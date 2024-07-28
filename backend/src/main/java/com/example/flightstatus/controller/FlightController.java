
package com.example.flightstatus.controller;

import com.example.flightstatus.model.Flight;
import com.example.flightstatus.repository.FlightRepository;
import com.example.flightstatus.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable String id) {
        return flightRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        Flight savedFlight = flightRepository.save(flight);
        messagingTemplate.convertAndSend("/topic/flightStatus", flightRepository.findAll());
        notificationService.sendNotification("flightUpdates", "New Flight Added", "Flight " + savedFlight.getFlightNumber() + " has been added.");
        return savedFlight;
    }

    @PutMapping("/{id}")
    public Flight updateFlight(@PathVariable String id, @RequestBody Flight flightDetails) {
        Flight flight = flightRepository.findById(id).orElse(null);
        if (flight != null) {
            flight.setStatus(flightDetails.getStatus());
            flight.setGate(flightDetails.getGate());
            flight.setDepartureTime(flightDetails.getDepartureTime());
            flight.setArrivalTime(flightDetails.getArrivalTime());
            Flight updatedFlight = flightRepository.save(flight);
            messagingTemplate.convertAndSend("/topic/flightStatus", flightRepository.findAll());
            notificationService.sendNotification("flightUpdates", "Flight Updated", "Flight " + updatedFlight.getFlightNumber() + " status has been updated.");
            return updatedFlight;
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable String id) {
        flightRepository.deleteById(id);
        messagingTemplate.convertAndSend("/topic/flightStatus", flightRepository.findAll());
        notificationService.sendNotification("flightUpdates", "Flight Deleted", "Flight " + id + " has been deleted.");
    }
}
