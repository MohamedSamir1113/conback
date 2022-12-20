package com.example.toolsprojectphase1.JPA;

import com.example.toolsprojectphase1.entities.Station;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StationJPA extends JpaRepository<Station , Long> {
}
