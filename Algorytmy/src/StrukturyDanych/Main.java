package StrukturyDanych;

/**
 * Created by RENT on 2017-08-01.
 */
public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        int a = 3;
        int b = 4;

        list.add(0);
        list.add(1);

        list.add(2,a, b);

        System.out.println(list.length());

        System.out.println();
        list.printListBack();

        System.out.println();
        list.printListForward();

//       JAK ZROBIC FOR_EACH
//        for (Integer integer :list) {
//            System.out.println(integer);
//        }


    }
}

