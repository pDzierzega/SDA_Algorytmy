package Alghoritms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-31.
 */
public class ReversedCamelCase extends AbstractAlgorithm{
    private ArrayList<String> listOftext=new ArrayList<>();

    @Override
    public String getName() {
        return "Reversed camelCase";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for (int i = 1; i <input.length ; i++) {
            char [] text=input[i].toCharArray();
            StringBuilder builder = new StringBuilder();
            for (char c :text) {
                if (c==Character.toUpperCase(c)) {
                    listOftext.add(builder.toString());

                }
                builder.append(c);
            }


        }



    }
}
