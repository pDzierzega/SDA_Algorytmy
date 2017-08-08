package StrukturyDanych;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-01.
 */
public class Main {

    public static void main(String[] args) {
        My_List<Integer> list = new My_List<>();
        list.add(0);

        Element p=list.get(0);
        list.remove(p);

        int a = 30;
        int b = 4;

        list.add(2560);
        list.add(1);
        list.add(2,a, b);
        list.addOnBeginning(100);

        list.add(p);


// JAK ZROBIC ZEBY PODPOWIADAL MI ZE PODAJE ARGUMENT ZLEJ KLASY
// CZY POWINIENEM RZUTOWAC ELEMENT
//        System.out.println(list.contains("ada"));
//        System.out.println(list.get(-1));

// JAK ZROBIC FOR_EACH

        MyTree<Integer> myTree=new MyTree<>(Integer.class);

        ArrayList<Integer> test=new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

       // System.out.println(test.toString());

       // list.stream().forEach(e-> myTree.add((Integer) e));
        test.stream().forEach(e-> myTree.add(e));


        System.out.println ("My Tree level is:"+ myTree.level());

        System.out.println((1-2)/1);
    }
}

