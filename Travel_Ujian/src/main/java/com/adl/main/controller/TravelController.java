package com.adl.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adl.main.model.TravelModel;
import com.adl.main.repository.TravelRepository;

@RestController
@RequestMapping("/travel")
public class TravelController {
	
	@Autowired
	TravelRepository travelRepo;
	
	@GetMapping("/")
	public List<TravelModel> getAllTravel(){
		List<TravelModel> listTravel = travelRepo.findAll();
		return listTravel;
	}
	
	@PostMapping("/")
	public TravelModel saveTravel(@RequestBody TravelModel data) {
		return travelRepo.save(data);
	}
	
	@DeleteMapping("/")
	public String deleteTravel(@RequestParam("id_travel") int id_travel) {
	  travelRepo.deleteById(id_travel);	
	  return "Berhasil Delete Travel";
	}
	
	@PatchMapping("/")
	public TravelModel updateTravel(@RequestBody TravelModel travel){
	  return travelRepo.save(travel);
	}

}
