package Alghoritms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-04.
 */
public class Zad2_Lista extends AbstractAlgorithm {
    private ArrayList<String> lista=new ArrayList<>();
    private String toDelete;
    @Override
    public String getName() {
        return "Array lista ";
    }

    @Override
    public void runAlgorithm(String[] input) {
        toDelete=input[1];
        for (int i = 2; i <input.length ; i++) {
            lista.add(input[i]);
        }

        System.out.println("Wczytana lista dancyh:");
        System.out.println(lista.toString());

        for (int i = 0; i <lista.size() ; i++) {
            if (lista.get(i).equals(toDelete)) lista.remove(i);
        }

        System.out.println("Po usunieciu z listy dancyh elemntów:"+toDelete);
        System.out.println(lista.toString());

    }
}
