package br.com.app.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon")
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "level")
	private Integer level;
	
	@ElementCollection
	@CollectionTable(name = "evolutions")
	private List<String> evolutions;
	
	@Column(name = "evolution_stone")
	private String evolutionStone;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "photo")
	private String photo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<String> getEvolutions() {
		return evolutions;
	}

	public void setEvolutions(List<String> evolutions) {
		this.evolutions = evolutions;
	}

	public String getEvolutionStone() {
		return evolutionStone;
	}

	public void setEvolutionStone(String evolutionStone) {
		this.evolutionStone = evolutionStone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
