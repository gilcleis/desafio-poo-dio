package br.com.dio.desafio.dominio;

public class Curso {
	private String titulo;
	private String descricao;
    private int cargaHoraria;
    
       
    public Curso() {
	}
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
	public final int getCargaHoraria() {
		return cargaHoraria;
	}
	public final void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
    
    
    
    
    
}
