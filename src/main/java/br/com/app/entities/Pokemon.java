package br.com.app.entities;

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
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "level")
	private Integer level;
	
	@ElementCollection
	@CollectionTable(name = "evolucoes")
	private List<String> evolucoes;
	
	@Column(name = "pedra_evolucao")
	private String pedraEvolucao;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "foto")
	private String foto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<String> getEvolucoes() {
		return evolucoes;
	}

	public void setEvolucoes(List<String> evolucoes) {
		this.evolucoes = evolucoes;
	}

	public String getPedraEvolucao() {
		return pedraEvolucao;
	}

	public void setPedraEvolucao(String pedraEvolucao) {
		this.pedraEvolucao = pedraEvolucao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	
	
	

}
