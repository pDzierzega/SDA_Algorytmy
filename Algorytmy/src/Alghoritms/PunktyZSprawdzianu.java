package Alghoritms;

/**
 * Created by RENT on 2017-07-28.
 */
public class PunktyZSprawdzianu extends AbstractAlgorithm {
    private char[] kuba;
    private char[] jarek;
    private char[] marek;

    private int liczbaPktow;

    @Override
    public String getName() {
        return "Punkty z sprawdzianu";
    }

    @Override
    public void runAlgorithm(String[] input) {
        kuba=input[1].toUpperCase().toCharArray();
        jarek=input[2].toUpperCase().toCharArray();
        marek=input[3].toUpperCase().toCharArray();

        liczbaPktow=0;

        for (int i = 0; i <kuba.length ; i++) {
            if (kuba[i]==jarek[i]) liczbaPktow++;
            if (kuba[i]==marek[i]) liczbaPktow++;
            if (marek[i]!=jarek[i]) liczbaPktow--;
        }

        System.out.println("Maksymalna liczba punktów jaka moga łaćżnie zdobyc Jarek i Marek to " + liczbaPktow);


    }
}
