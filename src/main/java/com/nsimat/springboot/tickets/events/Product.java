package com.nsimat.springboot.tickets.events;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    int eventId;

    @Column(nullable = false)
    String name;

    @Column
    String description;

    @Column(nullable = false)
    BigDecimal price;
}
