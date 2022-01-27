package com.paypal.bfs.test.bookingserv.impl;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.repo.BookingRepo;
import com.paypal.bfs.test.bookingserv.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepo repo;

    @Override
    public List<Booking> getBookingList() throws Exception {
        try {
            List<Booking> result = new ArrayList<>();
            Iterable<com.paypal.bfs.test.bookingserv.entity.Booking> iterator = repo.findAll();
            while (iterator.iterator().hasNext()){
                result.add(iterator.iterator().next());
            }

            return result;
        }

        catch (Exception exception){
            throw new Exception("Failed to fetch the list of booking");
        }
    }

    @Override
    public List<Booking> createTicket(Booking booking) throws Exception {
        try {
            com.paypal.bfs.test.bookingserv.entity.Booking booking1 = (com.paypal.bfs.test.bookingserv.entity.Booking) booking;
            com.paypal.bfs.test.bookingserv.entity.Booking result = repo.save(booking1);
            List<Booking> resultList = new ArrayList<>();
            resultList.add(result);
            return resultList;
        }

        catch (Exception exception){
            throw new Exception("Failed to book ticket");
        }
    }
}
