package com.adl.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="tiket")
public class TiketModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name="id_penumpang", referencedColumnName = "id_penumpang")
	private PenumpangModel id_penumpang;
	
	@OneToOne
	@JoinColumn(name="id_travel", referencedColumnName = "id_travel")
	private TravelModel id_travel;
	
	private String jadwal;
	
	
}
