package Alghoritms;

import java.util.InputMismatchException;
import java.util.TreeMap;

/**
 * Created by RENT on 2017-07-31.
 */
public class Lider extends AbstractAlgorithm  {
    @Override
    public String getName() {
        return "Lider";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int [] tab=new int[input.length-1];
        int max=0;

        for (int i = 0; i <tab.length ; i++) {
            tab[i]=Integer.parseInt(input[i+1]);
            if (tab[max]>tab[i]) max=i;
        }

        int [] counter=new int [tab[max]+1];

        max=tab[0];

        for (int i = 0; i <tab.length ; i++) {
            counter[tab[i]]=counter[tab[i]]+1;
            if ( counter[tab[max]] > counter[tab[i]] ){
                max=i;
            }
        }
        if (counter[2*tab[max]]>(tab.length)){
            System.out.println("Liderem jest "+tab[max]);
        } else
            System.out.println("Brak lidera w podanym zbiorze");

    }
}
