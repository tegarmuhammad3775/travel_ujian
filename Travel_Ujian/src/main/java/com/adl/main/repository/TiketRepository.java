package com.adl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adl.main.model.TiketModel;

public interface TiketRepository extends JpaRepository<TiketModel, Integer>{

}
