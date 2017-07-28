package Alghoritms;

import java.util.TreeMap;

/**
 * Created by RENT on 2017-07-27.
 */
public class SortowaniePrzezZliczanie_v1 extends AbstractAlgorithm {
    private int[] tab;
    private int[] out;

    @Override
    public String getName() {
        return "Sortowanie Przez Zliczanie_v1";
    }

    @Override
    public void runAlgorithm(String[] input) {

        tab = new int[Integer.parseInt(input[1]) + 1];
        out = new int[input.length - 2];

        for (int i = 0; i < input.length - 2; i++) {
            tab[Integer.parseInt(input[i + 2])]++;
        }
        int index = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i]; j++) {
                out[index] = i;
                index++;
            }
        }

        System.out.println("Posortowane liczby to:");
        for (int i : out) {
            System.out.print(i + " ,");
        }

    }
}

