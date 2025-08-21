package com.example.servicetickettracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ticketNumber;
    private String consultantId;
    private String assignedTo;
    private String details;
    private LocalDate assignedDate;
    private String location;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }

    public String getConsultantId() { return consultantId; }
    public void setConsultantId(String consultantId) { this.consultantId = consultantId; }

    public String getAssignedTo() { return assignedTo; }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public LocalDate getAssignedDate() { return assignedDate; }
    public void setAssignedDate(LocalDate assignedDate) { this.assignedDate = assignedDate; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
