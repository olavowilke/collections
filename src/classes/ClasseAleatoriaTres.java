package classes;

import java.util.Objects;

public class ClasseAleatoriaTres {

    private Integer atributoInt;
    private String atributoString;

    public ClasseAleatoriaTres(Integer atributoInt, String atributoString) {
        this.atributoInt = atributoInt;
        this.atributoString = atributoString;
    }

    public Integer getAtributoInt() {
        return atributoInt;
    }

    public String getAtributoString() {
        return atributoString;
    }

    @Override
    public String toString() {
        return "ClasseAleatoriaTres{" +
                "atributoInt=" + atributoInt +
                ", atributoString='" + atributoString + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        ClasseAleatoriaTres outraClasse = (ClasseAleatoriaTres) obj;
        return this.atributoInt.equals(outraClasse.atributoInt);
    }

    @Override
    public int hashCode() {
        return this.atributoInt.hashCode();
    }

}
