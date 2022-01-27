package com.paypal.bfs.test.bookingserv.service;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {

    public List<Booking> getBookingList() throws Exception;
    public Booking createTicket(com.paypal.bfs.test.bookingserv.entity.Booking booking) throws Exception;
}
