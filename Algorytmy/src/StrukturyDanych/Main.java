package StrukturyDanych;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by RENT on 2017-08-01.
 */
public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(0);

        Element p=list.get(0);
        list.remove(p);

//        System.out.println("Po usunieciu długość listy "+list.length());
//        list.printListForward();

        int a = 30;
        int b = 4;

        list.add(0);
        list.add(1);
        list.add(2,a, b);
        list.addOnBeginning(100);

        p=list.get(3);
        list.remove(p);

        list.printListForward();
        list.toArray();


        // JAK ZROBIC ZEBY PODPOWIADAL MI ZE PODAJE ARGUMENT ZLEJ KLASY
        // CZY POWINIENEM RZUTOWAC ELEMENT
//        System.out.println(list.contains("ada"));
//        System.out.println(list.get(-1));


//       JAK ZROBIC FOR_EACH



//        ArrayList<Integer> help=new ArrayList<>();
//        for (int i = 0; i <list.length() ; i++) {
//            help.add((int)list.get(i).getData());
//        }
//
//        MyTree<Integer> myTree=new MyTree (Integer.class,list.length());
//
//
//        myTree.addAll( help.toArray(new Integer [ help.size()]));



    }
}

