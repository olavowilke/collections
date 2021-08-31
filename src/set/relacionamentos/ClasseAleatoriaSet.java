package set.relacionamentos;

import classes.ClasseAleatoriaDois;
import classes.ClasseAleatoriaTres;

public class ClasseAleatoriaSet {
    public static void main(String[] args) {

        ClasseAleatoriaDois a2 = new ClasseAleatoriaDois(12, "a2");


        System.out.println(a2.getClassesAleatorias3());

        a2.adicionaClasseAleatoriaTres(new ClasseAleatoriaTres(13, "a3"));
        a2.adicionaClasseAleatoriaTres(new ClasseAleatoriaTres(23, "b3"));
        a2.adicionaClasseAleatoriaTres(new ClasseAleatoriaTres(33, "c3"));

        System.out.println(a2.getClassesAleatorias3());

        //Manipulando equals e hashCode
        ClasseAleatoriaTres d3 = new ClasseAleatoriaTres(43, "D3");
        ClasseAleatoriaTres f3 = new ClasseAleatoriaTres(43, "F3");

        System.out.println("D3 é igual F3?");
        System.out.println(d3.equals(f3));


    }
}
