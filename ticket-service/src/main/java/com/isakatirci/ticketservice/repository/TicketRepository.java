package com.isakatirci.ticketservice.repository;

import com.isakatirci.ticketservice.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, String> {
}
