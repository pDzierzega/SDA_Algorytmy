package StrukturyDanych;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-01.
 */
public class Main {

    public static void main(String[] args) {
        My_List<Integer> list = new My_List<>();
        list.add(12);

        Element p=list.get(0);
        list.remove(p);

        int a = 30;
        int b = 4;

        list.add(2560);
        list.add(345);
        list.add(789,a, b);
        list.add(789,125,1123,134,431,256,789,123,328,3217,4389,123,548);
        list.addOnBeginning(100);

//      JAK ZROBIC ZEBY PODPOWIADAL MI ZE PODAJE ARGUMENT ZLEJ KLASY
//      CZY POWINIENEM RZUTOWAC ELEMENT
//        System.out.println(list.contains("ada"));
//        System.out.println(list.get(-1));
//        ZROBIMY TEST

//      JAK ZROBIC FOR_EACH

        MyHeap heap=new MyHeap();
        ArrayList<Integer> test=new ArrayList<>();


        list.stream().forEach(e-> heap.add((Integer) e));

        heap.toString();


        //System.out.println(heap.sorted().toString());

    }
}

