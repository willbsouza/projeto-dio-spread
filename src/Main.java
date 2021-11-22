import br.com.dio.projetospread.dominio.Bootcamp;
import br.com.dio.projetospread.dominio.Curso;
import br.com.dio.projetospread.dominio.Dev;
import br.com.dio.projetospread.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setDescricao("descrição curso java");
        curso1.setTitulo("curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setDescricao("descrição curso js");
        curso2.setTitulo("curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("mentoria curso java");
        mentoria1.setTitulo("mentoria java");
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

        Dev dev1 = new Dev();
        dev1.setNome("Willams");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Willams: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-----------------------------\n");

        System.out.println("Conteúdos Inscritos Willams: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Willams: " + dev1.getConteudosConcluidos());
        System.out.println("TOTAL XP: " + dev1.calcularTotalXp());
        System.out.println("-----------------------------\n");
        Dev dev2 = new Dev();
        dev2.setNome("Bernardo");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bernardo: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("-----------------------------\n");
        System.out.println("Conteúdos Inscritos Bernardo: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bernardo: " + dev2.getConteudosConcluidos());
        System.out.println("TOTAL XP: " + dev2.calcularTotalXp());


    }
}
