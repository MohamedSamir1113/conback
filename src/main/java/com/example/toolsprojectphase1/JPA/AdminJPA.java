package com.example.toolsprojectphase1.JPA;

import com.example.toolsprojectphase1.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface AdminJPA extends JpaRepository <Admin , Long> {
}
