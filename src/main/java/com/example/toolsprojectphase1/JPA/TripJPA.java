package com.example.toolsprojectphase1.JPA;

import com.example.toolsprojectphase1.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripJPA extends JpaRepository<Trip, Long> {
}
