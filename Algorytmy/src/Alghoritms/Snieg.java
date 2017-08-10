package Alghoritms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by RENT on 2017-08-09.
 */
public class Snieg extends AbstractAlgorithm {
    int a;
    int b;
    int c;
    private int s;

    @Override
    public String getName() {
        return "Slady na sniegu";
    }

    @Override
    public void runAlgorithm(String[] input) {
        a=Integer.parseInt(input[1]);
        b=Integer.parseInt(input[2]);
        c=Integer.parseInt(input[3]);
        s=Integer.parseInt(input[4])*100;

        int nww=NWW(a,b,c);
        System.out.printf("Najwieksza wspolna wielokrotnosc dla liczb %d , %d , %d to %d,\n",a,b,c, nww);

        int i=0;

        while (i*nww<=s){
            i++;
        }
        System.out.printf("Na odcinku %s [cm] pojawi sie %d wspolnych sladów",s,i+1);
    }

    private int NWW (int a,int... data){
        int b=data[0];
        if (data.length==1) return a*b/NWD(a,b);
        return NWW(b, Arrays.copyOfRange(data,1,data.length));
    }

    private int NWD (int a,int b){
        if (b==0) return a;
        return NWD(b,a%b) ;
    }
}
