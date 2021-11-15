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

import com.adl.main.model.PenumpangModel;
import com.adl.main.repository.PenumpangRepository;


@RestController
@RequestMapping("/penumpang")
public class PenumpangController {
	
	@Autowired
	PenumpangRepository penumpangRepo;
	
	@GetMapping("/")
	public List<PenumpangModel> getAllPenumpang(){
		List<PenumpangModel> listPenumpang = penumpangRepo.findAll();
		return listPenumpang;
	}
	
	@PostMapping("/")
	public PenumpangModel savePenumpang(@RequestBody PenumpangModel data) {
		return penumpangRepo.save(data);
	}
	
	@DeleteMapping("/")
	public String deletePenumpang(@RequestParam("id_penumpang") int id_penumpang) {
	  penumpangRepo.deleteById(id_penumpang);	
	  return "Berhasil Delete Penumpang";
	}
	
	@PatchMapping("/")
	public PenumpangModel updatePenumpang(@RequestBody PenumpangModel penumpang){
	  return penumpangRepo.save(penumpang);
	}
	

}
