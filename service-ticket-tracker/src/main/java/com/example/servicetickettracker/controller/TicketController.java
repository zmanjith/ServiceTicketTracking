package com.example.servicetickettracker.controller;

import com.example.servicetickettracker.model.Ticket;
import com.example.servicetickettracker.repository.TicketRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketRepository repository;

    public TicketController(TicketRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return repository.save(ticket);
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return repository.findAll();
    }

    @GetMapping("/{ticketNumber}")
    public Optional<Ticket> getTicketByNumber(@PathVariable String ticketNumber) {
        return repository.findByTicketNumber(ticketNumber);
    }
    
}
