package com.adl.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.adl.main.model.PenumpangModel;
import com.adl.main.model.TiketModel;
import com.adl.main.model.TravelModel;
import com.adl.main.repository.PenumpangRepository;
import com.adl.main.repository.TiketRepository;
import com.adl.main.repository.TravelRepository;

@Controller
public class MainController {
	
	@Autowired
	PenumpangRepository penumpangRepo;
	
	@Autowired
	TravelRepository travelRepo;
	
	@Autowired
	TiketRepository tiketRepo;
	
	
	@GetMapping("/")
	public String getAllData(Model model){
		
		List<PenumpangModel> listPenumpang = penumpangRepo.findAll();
		model.addAttribute("listPenumpang", listPenumpang);
		
		List<TravelModel> listTravel = travelRepo.findAll();
		model.addAttribute("listTravel", listTravel);
		
		List<TiketModel> listTiket = tiketRepo.findAll();
		model.addAttribute("listTiket", listTiket);
		
		return "index.html";
	}

}
