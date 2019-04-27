package br.edu.ifsp.spo.lp1a3.projeto.war.classes;

import java.util.Collection;
import java.util.HashSet;

import br.edu.ifsp.spo.lp1a3.projeto.war.classes.*;

@SuppressWarnings("unused")
public class Continente {
	
	private String nome;
	private Collection<Pais> paises = new HashSet<>();
	private Collection<Continente> conexoes = new HashSet<>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Collection<Pais> getPaises() {
		return paises;
	}
	
	public void setPaises(Collection<Pais> paises) {
		this.paises = paises;
	}
	
	public Collection<Continente> getConexoes() {
		return conexoes;
	}
	
	public void setConexoes(Collection<Continente> conexoes) {
		this.conexoes = conexoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((paises == null) ? 0 : paises.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Continente other = (Continente) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (paises == null) {
			if (other.paises != null)
				return false;
		} else if (!paises.equals(other.paises))
			return false;
		return true;
	}
	
}