package com.example.flightMate.entity;


import jakarta.persistence.*;

@Entity
public class Ticket {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seatNumber ;
    private double price;
 @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;



}
