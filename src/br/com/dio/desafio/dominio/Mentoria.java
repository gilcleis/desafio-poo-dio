package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
	private String titulo;
    private String descricao;
    private LocalDate data;
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
	public final LocalDate getData() {
		return data;
	}
	public final void setData(LocalDate data) {
		this.data = data;
	}
    
	@Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
