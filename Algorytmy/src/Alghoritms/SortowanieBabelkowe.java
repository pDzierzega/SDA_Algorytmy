package Alghoritms;

/**
 * Created by RENT on 2017-07-26.
 */
public class SortowanieBabelkowe extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Sortowanie babelkowe";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int[] tab = new int[input.length - 1];
        int n;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }
        tab =sortedInt(tab);
        for (int i : tab) {
            System.out.println(i);
        }
    }

        static int[] sortedInt(int[] ints){
            int temp;
            for (int j = 0; j < ints.length; j++) {
                for (int i = 0; i < ints.length - 1; i++) {
                    if (ints[i] < ints[i + 1]) {
                        temp = ints[i];
                        ints[i] = ints[i + 1];
                        ints[i + 1] = temp;
                    }
                }
            }
            return ints;
        }
    }

