package Alghoritms;

import java.util.Collections;
import java.util.TreeMap;

/**
 * Created by RENT on 2017-07-26.
 */
public class ZliczaczLiter extends AbstractAlgorithm {

    TreeMap<Character,Integer> counter= new TreeMap<>();
    StringBuilder text= new StringBuilder();

    @Override
    public String getName() {
        return "ZIL Zliczacz Liter";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for (int i = 1; i <input.length ; i++) {
            text.append(input[i]);
        }
        char[] arrayOfText=text.toString().toCharArray();
        for (Character character :arrayOfText) {
            countChar(character);
        }
        sortedAndPrint();
        
    }

    private void sortedAndPrint() {
        counter.entrySet()  .stream()
                            .sorted((e1,e2)-> e1.getKey().compareTo(e2.getKey()))
                            .forEach(e -> System.out.println(e.getKey()+" występuje " + e.getValue() + "razy."));
    }

    private void countChar(Character character) {
        if (counter.containsKey(character) ) {
            int n=counter.get(character);
            counter.put(character,n+1);
        } else
        counter.put(character,1);
    }
}


