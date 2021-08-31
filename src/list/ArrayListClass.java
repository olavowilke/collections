package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        String string1 = "String 03";
        String string2 = "String 02";
        String string3 = "String 01";

        List<String> strings = new ArrayList<>();
        strings.add(string1);
        strings.add(string2);
        strings.add(string3);

//        System.out.println(strings);


// forEach
//        for (String string :
//                strings) {
//            System.out.println("forEach:" + string);
//        }

// forEach
        strings.forEach(string -> {
            System.out.println("forEach:" + string);
        });

//        Collections.sort(strings);
//        System.out.println("Depois de ordenado:");
//        System.out.println(strings);
    }
}
