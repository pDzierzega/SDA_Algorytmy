package StrukturyDanych;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-01.
 */
public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();


        list.add(0);

        System.out.println("Długość listy "+list.length());
        list.printListForward();

        Element p=list.get(0);
        list.remove(p);

        System.out.println("Po usunieciu długość listy "+list.length());
        list.printListForward();

        int a = 3;
        int b = 4;

        list.add(0);
        list.add(1);

        list.add(2,a, b);
        list.addOnBeginning(100);

        p=list.get(3);
        list.remove(p);

        System.out.println("Po dodaniu długość listy "+list.length());
        list.printListForward();

        // JAK ZROBIC ZEBY PODPOWIADAL MI ZE PODAJE ARGUMENT ZLEJ KLASY
        // CZY POWINIENEM RZUTOWAC ELEMENT
//        System.out.println(list.contains("ada"));
//        System.out.println(list.get(-1));


//       JAK ZROBIC FOR_EACH
//        for (Integer integer :list) {
//            System.out.println(integer);
//        }


        ArrayList<String> listOfColors = new ArrayList<>();
        listOfColors.add("niebieski");
        listOfColors.add("czarny");
        listOfColors.add("zółty");
        listOfColors.add("fioletowy");

        listOfColors.add(0,"różowy");
        listOfColors.add("zielony");
//
//        System.out.println(listOfColors);
//
//
//        TAK MOZNA?????
        ArrayList listOfAll = new ArrayList();

        //listOfAll.add(listOfColors);
        listOfAll.add("Dupa");

        for (Object o :listOfAll) {
            System.out.println(o);

        }


//



    }
}

