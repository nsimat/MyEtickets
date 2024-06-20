package com.nsimat.springboot.tickets.events;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "organizer_id", referencedColumnName = "id", nullable = false)
    private Organizer organizer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "venue_id", referencedColumnName = "id", nullable = false)
    private Venue venue;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;
}
