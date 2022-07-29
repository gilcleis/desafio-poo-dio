package br.com.dio.desafio.dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conteudosConcluidos= new LinkedHashSet<Conteudo>();
	
	public void inscrever(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}
		else {
			System.err.println("voce não esta matriculado em nenhum conteudo");
		}
	}
	
	  public double calcularTotalXp() {
	        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
	        double soma = 0;
	        while(iterator.hasNext()){
	            double next = iterator.next().calcularXp();
	            soma += next;
	        }
	        return soma;

	        /*return this.conteudosConcluidos
	                .stream()
	                .mapToDouble(Conteudo::calcularXp)
	                .sum();*/
	    }

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public final void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public final Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public final void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
		

}
