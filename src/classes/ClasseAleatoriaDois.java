package classes;

import java.util.*;

public class ClasseAleatoriaDois {

    private Integer atributoInt;
    private String atributoString;
    private List<ClasseAleatoria> classesAleatorias = new ArrayList<>();
    private Set<ClasseAleatoriaTres> classesAleatorias3 = new HashSet<>();
    private Map<Integer, ClasseAleatoriaTres> ca3paraca2 = new HashMap<>();

    public ClasseAleatoriaDois(Integer atributoInt, String atributoString) {
        this.atributoInt = atributoInt;
        this.atributoString = atributoString;
    }

    public Integer getAtributoInt() {
        return atributoInt;
    }

    public String getAtributoString() {
        return atributoString;
    }

    public List<ClasseAleatoria> getClassesAleatorias() {
        return Collections.unmodifiableList(classesAleatorias);
    }

    public Set<ClasseAleatoriaTres> getClassesAleatorias3() {
        return Collections.unmodifiableSet(classesAleatorias3);
    }

    @Override
    public String toString() {
        return "ClasseAleatoriaDois{" +
                "atributoInt=" + atributoInt +
                ", atributoString='" + atributoString + '\'' +
                ", classesAleatorias=" + classesAleatorias +
                '}';
    }

    public void adicionaClasseAleatoria(ClasseAleatoria classeAleatoria) {
        this.classesAleatorias.add(classeAleatoria);
    }

    public void adicionaClasseAleatoriaTres(ClasseAleatoriaTres classeAleatoriaTres) {
        this.classesAleatorias3.add(classeAleatoriaTres);
        this.ca3paraca2.put(classeAleatoriaTres.getAtributoInt(), classeAleatoriaTres);
    }

    public ClasseAleatoriaTres buscaCA3PorCA2(Integer atributoInt){
        return this.ca3paraca2.get(atributoInt);
    }




}
