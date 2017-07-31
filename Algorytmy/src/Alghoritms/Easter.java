package Alghoritms;

import java.time.LocalDate;

/**
 * Created by RENT on 2017-07-31.
 */
public class Easter extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Wielkanoc";
    }

    @Override
    public void runAlgorithm(String[] input) {


        int year=Integer.parseInt(input[1]);
        int a=year%19;
        int b=year/100;
        int c=year%100;
        int d=b/4;
        int e=b%4;
        int f=(b+8)/25;
        int g=(b-f+1)/3;
        int h=(19*a+b-d-g+15)%30;
        int i=c/4;
        int k=c%4;
        int l=(32+2*e+2*i-h-k)%7;
        int m=(a+11*h+22*l)/451;
        int p=(h+l-7*m+114)%31;

        int day=p+1;
        int month=(h+l-7*m+114)/31;

        if (month!=4) month=3;

//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        System.out.println("c="+c);
//        System.out.println("d="+d);
//        System.out.println("e="+e);
//        System.out.println("f="+f);
//        System.out.println("g="+g);
//        System.out.println("h="+h);
//        System.out.println("i="+i);
//        System.out.println("k="+k);
//        System.out.println("l="+l);
//        System.out.println("p="+p);


        LocalDate easterData=LocalDate.of(year,month,day);
        System.out.println(easterData);



    }
}
