package Alghoritms;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by RENT on 2017-07-27.
 */
public class SortowaniePrzezZliczanie_v2 extends AbstractAlgorithm {
    private TreeMap<Integer, Integer> temp = new TreeMap<>();
    private int[] out;

    @Override
    public String getName() {
        return "Sortowanie Przez Zliczanie_v2";
    }

    @Override
    public void runAlgorithm(String[] input) {
        out = new int[input.length-2];
        int n;

        for (int i = 0; i < input.length - 2; i++) {
            n = Integer.parseInt(input[i+2]);
            if (temp.containsKey(n)){
                int m=temp.get(n);
                temp.put(n,(m+1));
            }
            else {
                temp.put(n,1);
            }
        }
        n=0;
        temp.entrySet().stream().sorted();
        for (Map.Entry<Integer,Integer> entry :temp.entrySet()) {
            for (int i = 0; i <entry.getValue() ; i++) {
                out[n+i]=entry.getKey();
                System.out.print(out[n+i]+", ");
                n++;
            }
        }


    }
}

