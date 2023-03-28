package desafio_dio_poo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso JS");
		curso2.setDescricao("Descrição curso JavaScript");
		curso2.setCargaHoraria(4);
		
		
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev desenvolvedor1 = new Dev();
		desenvolvedor1.setNome("Matheus");
		desenvolvedor1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Incritos" + desenvolvedor1.getConteudosInscritos());
		desenvolvedor1.progredir();
		System.out.println("Conteudos Incritos" + desenvolvedor1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + desenvolvedor1.getConteudosConcluidos());
		System.out.println("XP:" + desenvolvedor1.calcularXp());
		
		
		System.out.println("---------");
		
		Dev desenvolvedor2 = new Dev();
		desenvolvedor2.setNome("Kamilly");
		desenvolvedor2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Incritos" + desenvolvedor2.getConteudosInscritos());
		desenvolvedor2.progredir();
		desenvolvedor2.progredir();
		System.out.println("Conteudos Incritos" + desenvolvedor2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + desenvolvedor2.getConteudosConcluidos());
		System.out.println("XP:" + desenvolvedor2.calcularXp());
		
		

	}

}
