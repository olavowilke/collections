package list.relacionamentos;

import classes.ClasseAleatoria;

import java.util.ArrayList;
import java.util.Comparator;

public class ClasseAleatoriaList {
    public static void main(String[] args) {

        ClasseAleatoria ca1 = new ClasseAleatoria(04, "A");
        ClasseAleatoria ca2 = new ClasseAleatoria(03, "B");
        ClasseAleatoria ca3 = new ClasseAleatoria(02, "C");
        ClasseAleatoria ca4 = new ClasseAleatoria(01, "D");

        ArrayList<ClasseAleatoria> classes = new ArrayList<>();
        classes.add(ca1);
        classes.add(ca2);
        classes.add(ca3);
        classes.add(ca4);

        System.out.println(classes);

//        Collections.sort(classes);
//
//        System.out.println(classes);

        classes.sort(Comparator.comparing(ClasseAleatoria::getAtributoInt));

        System.out.println(classes);

    }

}
