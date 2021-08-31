package classes;

public class ClasseAleatoria implements Comparable<ClasseAleatoria> {

    private Integer atributoInt;
    private String atributoString;

    public ClasseAleatoria(int atributoInt, String atributoString) {
        this.atributoInt = atributoInt;
        this.atributoString = atributoString;
    }

    public int getAtributoInt() {
        return atributoInt;
    }

    public void setAtributoInt(int atributoInt) {
        this.atributoInt = atributoInt;
    }

    public String getAtributoString() {
        return atributoString;
    }

    public void setAtributoString(String atributoString) {
        this.atributoString = atributoString;
    }

    @Override
    public String toString() {
        return "ClasseAleatoria{" +
                "atributoInt=" + atributoInt +
                ", atributoString='" + atributoString + '\'' +
                '}';
    }

    @Override
    public int compareTo(ClasseAleatoria classeAleatoria) {
        return this.atributoInt.compareTo(classeAleatoria.atributoInt);
    }

}
