package com.ab.spring.finalex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import com.ab.spring.finalex.model.Reservation;
import com.ab.spring.finalex.repository.ReservationRepository;

@Controller
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation_form";
    }
    
    @PostMapping("/process-form")
    public String processForm(@ModelAttribute Reservation reservation, Model model) throws Exception {
        // Convert to JSON using Jackson
        ObjectMapper mapper = new ObjectMapper();
        String jsonReservation = mapper.writeValueAsString(reservation);

        // Use RestTemplate to POST JSON internally
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(jsonReservation, headers);

        ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/submit", entity, String.class);

        // Show success/failure message
        model.addAttribute("message", response.getBody());
        model.addAttribute("reservation", new Reservation());
        return "reservation_form";
    }

    @PostMapping("/submit")
    @ResponseBody
    public String submitJsonReservation(@RequestBody Reservation reservation) {
        reservationRepository.save(reservation);
        return "Reservation saved successfully!";
    }
}
