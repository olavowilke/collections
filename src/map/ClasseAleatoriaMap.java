package map;

import classes.ClasseAleatoriaDois;
import classes.ClasseAleatoriaTres;

public class ClasseAleatoriaMap {
    public static void main(String[] args) {

        ClasseAleatoriaDois a2 = new ClasseAleatoriaDois(12, "a2");


        System.out.println(a2.getClassesAleatorias3());

        a2.adicionaClasseAleatoriaTres(new ClasseAleatoriaTres(13, "a3"));
        a2.adicionaClasseAleatoriaTres(new ClasseAleatoriaTres(23, "b3"));
        a2.adicionaClasseAleatoriaTres(new ClasseAleatoriaTres(33, "c3"));

        System.out.println(a2.getClassesAleatorias3());

        ClasseAleatoriaTres d3 = new ClasseAleatoriaTres(13, "d3");
        a2.adicionaClasseAleatoriaTres(d3);


        System.out.println(a2.buscaCA3PorCA2(d3.getAtributoInt()));

    }
}
