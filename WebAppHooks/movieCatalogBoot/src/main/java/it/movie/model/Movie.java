package it.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Table(name = "movie")
@Entity
public class Movie {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome_film")
	private String nome_film;
	
	@Column(name = "nome_utente")
	private String nome_utente;
	
	@Column(name = "valutazione")
	private Integer valutazione;	//valutazione in decimi data al film dall'utente

	public Movie(Integer id, String nome_film, String nome_utente, Integer valutazione) {
		super();
		this.id = id;
		this.nome_film = nome_film;
		this.nome_utente = nome_utente;
		this.valutazione = valutazione;
	}

	public Movie() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome_film() {
		return nome_film;
	}

	public void setNome_film(String nome_film) {
		this.nome_film = nome_film;
	}

	public String getNome_utente() {
		return nome_utente;
	}

	public void setNome_utente(String nome_utente) {
		this.nome_utente = nome_utente;
	}

	public Integer getValutazione() {
		return valutazione;
	}

	public void setValutazione(Integer valutazione) {
		this.valutazione = valutazione;
	}

	
	
	
}
