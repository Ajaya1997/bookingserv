package com.paypal.bfs.test.bookingserv.entity;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking extends com.paypal.bfs.test.bookingserv.api.model.Booking {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
