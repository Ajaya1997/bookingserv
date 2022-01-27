package com.paypal.bfs.test.bookingserv.impl;

import com.paypal.bfs.test.bookingserv.api.BookingResource;
import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingResourceImpl implements BookingResource {

    @Autowired
    BookingService service;

    @Override
    public ResponseEntity<Booking> create(Booking booking) {
        try {
            com.paypal.bfs.test.bookingserv.entity.Booking booking1 = (com.paypal.bfs.test.bookingserv.entity.Booking) booking;
            List<Booking> result = service.createTicket(booking1);
            return ResponseEntity.ok().body(result.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body(null);
    }

    @Override
    public ResponseEntity<List<Booking>> getAllBookings() {
        try {
            List<Booking> result = service.getBookingList();

            return ResponseEntity.ok().body(result);

        }
        catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
}
