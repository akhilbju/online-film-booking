package com.example.booking.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.booking.beans.CurrentDateOperation;



@Repository
public interface OpeningDate extends JpaRepository<CurrentDateOperation, Long> {

}
