package br.com.dominio;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de java 1.8");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLipe = new Dev();
        devLipe.setNome("Lipe");
        devLipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Lipe" + devLipe.getConteudosInscritos());
        devLipe.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Lipe" + devLipe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Lipe" + devLipe.getConteudosConcluidos());
        System.out.println("XP " + devLipe.calcularTotalXp());

        System.out.println("-------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP " + devJoao.calcularTotalXp());
    }
}