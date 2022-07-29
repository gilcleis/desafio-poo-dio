package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp();

	public final String getTitulo() {
		return titulo;
	}

	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public final String getDescricao() {
		return descricao;
	}

	public final void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
