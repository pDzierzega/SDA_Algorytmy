package StrukturyDanych;

/**
 * Created by RENT on 2017-08-01.
 */
public class Main {

    public static void main(String[] args) {
        MyList <Integer> list=new MyList<>();

        int a=1;
        int b=2;

        list.add(1);
        list.add(2);

        System.out.println("Dziala?");

        list.add(a,b);

        System.out.println(list.length());


    }
}
