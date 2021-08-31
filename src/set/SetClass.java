package set;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("String 01");
        stringSet.add("String 02");
        stringSet.add("String 03");
        stringSet.add("String 04");
        stringSet.add("String 05");
        stringSet.add("String 06");

        for (String string : stringSet) {
            System.out.println(string);
        }

        System.out.println(stringSet);

        boolean contem = stringSet.contains("String 01");

        if (contem){
            System.out.println("contem");
        }
    }
}
