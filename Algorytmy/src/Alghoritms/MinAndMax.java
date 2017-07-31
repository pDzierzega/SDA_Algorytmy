package Alghoritms;

/**
 * Created by RENT on 2017-07-31.
 */
public class MinAndMax extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "MIN & MAX";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int [] tab=new int [input.length-1];
        int min=0;
        int max=0;

        for (int i = 0; i <input.length-1 ; i++) {
            tab[i]=Integer.parseInt(input[i+1]);
            if (tab[max]>tab[i]) max=i;
            if (tab[min]<tab[i]) min=i;
        }

        System.out.println("Najwiekszy element tablicy znajduje sie na "+max+" pozycji. Jego wartośc to: "+tab[max]);
        System.out.println("Najmniejszy element tablicy znajduje sie na "+min+" pozycji. Jego wartośc to: "+tab[min]);
    }
}
