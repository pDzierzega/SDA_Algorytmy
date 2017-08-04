package Alghoritms;

/**
 * Created by RENT on 2017-08-04.
 */
public class Duplikat extends AbstractAlgorithm {
    private String[] tab;

    @Override
    public String getName() {
        return "Duplikat";
    }

    @Override
    public void runAlgorithm(String[] input) {
        tab = new String[input.length - 1];

        int i;
        int j=0;
        boolean a = false;

        for (i = 0; i < tab.length; i++) {
            tab[i]=input[i+1];
            for (j = 0; j < i; j++) {
                a = tab[i].equals(tab[j]);
                if (a) break;
            }
            if (a) break;
        }

        if (a)
            System.out.println("Pierwszy duplikat to \" " + tab[j] + "\" o numerach indeksów :" + j + " , " + i);
        else
            System.out.println("Brak duplikatów");

    }
}