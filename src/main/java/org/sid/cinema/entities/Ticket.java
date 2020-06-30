package org.sid.cinema.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Ticket implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String nomCllient;
	private double prix;
	@Column(unique = true, nullable = true)
	private Integer codePayment;
	private boolean reserve;
	@ManyToOne
	private Place place;
	@ManyToOne
	private Projection projection;

}
