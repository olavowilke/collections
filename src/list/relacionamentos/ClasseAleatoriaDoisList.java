package list.relacionamentos;

import classes.ClasseAleatoria;
import classes.ClasseAleatoriaDois;

public class ClasseAleatoriaDoisList {
    public static void main(String[] args) {

        ClasseAleatoriaDois a = new ClasseAleatoriaDois(1, "A");

//        a.getClassesAleatorias().add(new ClasseAleatoria(1, "A"));

        a.adicionaClasseAleatoria(new ClasseAleatoria(1, "A"));
        a.adicionaClasseAleatoria(new ClasseAleatoria(2, "B"));
        a.adicionaClasseAleatoria(new ClasseAleatoria(3, "C"));
        a.adicionaClasseAleatoria(new ClasseAleatoria(4, "D"));

        System.out.println(a.getClassesAleatorias());

        a.getClassesAleatorias().add(new ClasseAleatoria('1', "s"));

    }

}
