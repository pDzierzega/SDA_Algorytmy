package Alghoritms;

import java.util.TreeMap;

/**
 * Created by RENT on 2017-07-27.
 */
public class SortowaniePrzezZliczanie extends AbstractAlgorithm {
    private int[] tab;
    private TreeMap<Integer, Integer> temp = new TreeMap<>();
    private int[] out;

    @Override
    public String getName() {
        return "Sortowanie Przez Zliczanie";
    }

    @Override
    public void runAlgorithm(String[] input) {
    version_01(input);
    }

    private void version_01(String[] input) {
        int[] out;
        int[] tab;

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

