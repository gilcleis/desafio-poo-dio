import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setDescricao("descricao curso java");
		curso1.setTitulo("curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setDescricao("descricao curso js");
		curso2.setTitulo("curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria java");
		mentoria1.setDescricao("descricao mentoria java");
		mentoria1.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscrever(bootcamp);
		System.out.println("Conteudos Inscritos Camila"+ devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Camila"+ devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Camila"+ devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		System.out.println("------------------------");
		
		Dev devGil = new Dev();
		devGil.setNome("Gil");
		devGil.inscrever(bootcamp);
		System.out.println("Conteudos Inscritos Gil"+ devGil.getConteudosInscritos());
		devGil.progredir();
		devGil.progredir();
		devGil.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Gil"+ devGil.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Gil"+ devGil.getConteudosConcluidos());
		System.out.println("XP: " + devGil.calcularTotalXp());
		
		


	}

}
