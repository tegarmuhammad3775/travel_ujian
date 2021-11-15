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

import com.adl.main.model.TiketModel;
import com.adl.main.repository.TiketRepository;


@RestController
@RequestMapping("/tiket")
public class TiketController {
	
	@Autowired
	TiketRepository tiketRepo;
	
	@GetMapping("/")
	public List<TiketModel> getAllTiket(){
		List<TiketModel> listTiket = tiketRepo.findAll();
		return listTiket;
	}
	
	@PostMapping("/")
	public TiketModel saveTiket(@RequestBody TiketModel data) {
		return tiketRepo.save(data);
	}
	
	@DeleteMapping("/")
	public String deleteTiket(@RequestParam("id") int id) {
	  tiketRepo.deleteById(id);	
	  return "Berhasil Delete Tiket";
	}
	
	@PatchMapping("/")
	public TiketModel updateTiket(@RequestBody TiketModel tiket){
	  return tiketRepo.save(tiket);
	}

}
