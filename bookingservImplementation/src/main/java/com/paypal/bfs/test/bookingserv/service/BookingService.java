package com.paypal.bfs.test.bookingserv.service;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {

    public List<Booking> getBookingList() throws Exception;
    public List<Booking> createTicket(Booking booking) throws Exception;
}
