package com.paypal.bfs.test.bookingserv.controllerImpl;

import com.paypal.bfs.test.bookingserv.api.BookingResource;
import com.paypal.bfs.test.bookingserv.api.model.Address;
import com.paypal.bfs.test.bookingserv.entity.Booking;
import com.paypal.bfs.test.bookingserv.impl.BookingResourceImpl;
import com.paypal.bfs.test.bookingserv.repo.BookingRepo;
import com.paypal.bfs.test.bookingserv.service.BookingService;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.Duration;
import java.util.Timer;

/*@ExtendWith(MockitoExtension.class)
@WebMvcTest({BookingResource.class})*/
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerImplTest {

    @MockBean
    BookingService service;

    @MockBean
    BookingResourceImpl resource;

    @MockBean
    BookingRepo repo;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testBookTicket() throws Exception{

        Booking booking = new Booking();
        booking.setId(1);
        booking.setFirstName("Ajaya");
        booking.setLastName("Panda");
        booking.setDateOfBirth("30/05/1997");
        booking.setCheckinDatetime(System.currentTimeMillis());
        booking.setCheckinDatetime(Duration.ofHours(24));
        Address address = new Address();
        booking.setAddress(address);

        mockMvc.perform(MockMvcRequestBuilders.post("/v1/bfs/booking")).andExpect(MockMvcResultMatchers.status().is(200));
    }

    @Test
    public void testGetAllBooking() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get("/v1/bfs/bookings")).andExpect(MockMvcResultMatchers.status().is(200));
    }
}
