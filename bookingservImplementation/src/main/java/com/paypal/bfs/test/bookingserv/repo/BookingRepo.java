package com.paypal.bfs.test.bookingserv.repo;

import com.paypal.bfs.test.bookingserv.entity.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends CrudRepository<Booking, Integer> {
}
