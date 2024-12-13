package exemple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemple1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(25);
        System.out.println(list);
        List<Integer> list1 = list.stream()
                .filter(I -> I > 0)
                .collect(Collectors.toList());
        System.out.println(list1);

//L'expression lambda I -> I > 0 implémente cette interface fonctionnelle,
// car elle prend
// un élément I et retourne un boolean (vrai si I > 0, sinon faux)



    }

}
