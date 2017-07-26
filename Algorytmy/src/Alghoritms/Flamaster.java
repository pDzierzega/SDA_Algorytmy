package Alghoritms;

import java.util.Arrays;

public class Flamaster extends  AbstractAlgorithm {
    @Override
    public String getName() {
        return "Flamaster";
    }

    @Override
    public void runAlgorithm(String[] input) {
        System.out.println("Wczyatno " + input[1] + " wyrazów:");
        char[] wyraz;
        int n;

        for (int i = 2; i <input.length ; i++) {
            System.out.print("Dla wyrazu " + input[i] + " skrócona wersja to: ");
            wyraz=(input[i]+" ").toCharArray(); // dodaje spacje na końcu, zeby dzialalo w petli
            n=1;

            for (int j = 0; j <wyraz.length-1 ; j++) {
                if (wyraz[j]==wyraz[j+1]) {
                    n++;
                }
                else {
                    if (n>2) {
                        System.out.print(wyraz[j]);
                        System.out.print(n);
                    }
                    else {
                        for (int k = 0; k <n ; k++) {
                            System.out.print(wyraz[j]);
                        }
                    }
                    n=1;
                }
            }
            System.out.println();
        }
    }


}
