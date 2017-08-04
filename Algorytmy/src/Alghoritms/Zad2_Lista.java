package Alghoritms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-04.
 */
public class Zad2_Lista extends AbstractAlgorithm {
    private ArrayList<Integer> lista=new ArrayList<>();
    private Integer toDelete;
    @Override
    public String getName() {
        return "Array lista ";
    }

    @Override
    public void runAlgorithm(String[] input) {
        toDelete=Integer.parseInt(input[1]);
        for (int i = 2; i <input.length ; i++) {
            lista.add(Integer.parseInt(input[i]));
        }

        System.out.println("Wczytana lista dancyh:");
        System.out.println(lista.toString());

        for (int i = 0; i <lista.size() ; i++) {
            if (lista.get(i)==toDelete) {
                lista.remove(i);
                i--; // Poytzebne jezeli dwie kolejne liczby sa rowne toDelete
            }
        }

        System.out.println();
        System.out.println("Po usunieciu z listy dancyh elemntów:"+toDelete);
        System.out.println(lista.toString());

    }
}
