package com.ab.spring.finalex.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ab.spring.finalex.model.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, String> {}
