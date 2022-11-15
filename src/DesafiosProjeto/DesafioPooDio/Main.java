package DesafiosProjeto.DesafioPooDio;
import DesafiosProjeto.DesafioPooDio.dominio.Bootcamp;
import DesafiosProjeto.DesafioPooDio.dominio.Curso;
import DesafiosProjeto.DesafioPooDio.dominio.Dev;
import DesafiosProjeto.DesafioPooDio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Spring");
        curso2.setDescricao("Descrição curso Spring");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKhatlyn = new Dev();
        devKhatlyn.setNome("Khatlyn");
        devKhatlyn.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Khatlyn: " + devKhatlyn.getConteudosInscritos());
        devKhatlyn.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Khatlyn: " + devKhatlyn.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Khatlyn: " + devKhatlyn.getConteudosConcluidos());
        System.out.println("Xp:" + devKhatlyn.calcularTotalXp());

        System.out.println("------------");

        Dev devCaroline = new Dev();
        devCaroline.setNome("Caroline");
        devCaroline.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Caroline: " + devCaroline.getConteudosInscritos());
        devCaroline.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Caroline: " + devCaroline.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Caroline: " + devCaroline.getConteudosConcluidos());
        System.out.println("Xp:" + devCaroline.calcularTotalXp());

    }
}
