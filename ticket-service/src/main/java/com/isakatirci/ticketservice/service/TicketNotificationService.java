package com.isakatirci.ticketservice.service;

import com.isakatirci.ticketservice.model.Ticket;

public interface TicketNotificationService {

    void sendToQueue(Ticket ticket);
}
