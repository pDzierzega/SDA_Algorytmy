package Alghoritms;

/**
 * Created by RENT on 2017-07-21.
 */
public class CamelCase_v1 extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int charCounter=0;
        for (int i=1;i<input.length;i++){
            char [] word=input[i].toCharArray();
            for (char c :word) {
                charCounter++;
                if (charCounter%2==0) c=Character.toUpperCase(c);
                else c=Character.toLowerCase(c);
                System.out.print(c);
        }
            System.out.print(" ");
        }
        }
    }

