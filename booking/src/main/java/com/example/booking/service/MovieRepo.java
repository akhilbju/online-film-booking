package com.example.booking.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.booking.beans.MovieDetails;



@Repository
public interface MovieRepo extends JpaRepository<MovieDetails, Long> {

}
