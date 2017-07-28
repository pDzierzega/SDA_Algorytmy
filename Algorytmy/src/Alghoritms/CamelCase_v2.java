package Alghoritms;

/**
 * Created by RENT on 2017-07-28.
 */
public class CamelCase_v2 extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "camel case v2";
    }

    @Override
    public void runAlgorithm(String[] input) {
        StringBuilder builder=new StringBuilder();
        char[] text;
        char a;


        for (int i = 1; i <input.length ; i++) {
            text=input[i].toCharArray();
            text[0]=Character.toUpperCase(text[0]);
            builder.append(text);
        }

        System.out.println(builder.toString());

    }
}
