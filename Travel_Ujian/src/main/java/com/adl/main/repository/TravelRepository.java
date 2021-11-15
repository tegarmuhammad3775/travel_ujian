package com.adl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adl.main.model.TravelModel;

public interface TravelRepository extends JpaRepository<TravelModel, Integer> {

}
