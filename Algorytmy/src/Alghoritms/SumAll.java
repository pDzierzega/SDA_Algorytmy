package Alghoritms;

import java.util.IdentityHashMap;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumAll extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "SumAll";
    }

    @Override
    public void runAlgorithm(String[] input) {
        Integer n= Integer.parseInt(input[1]);
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Suma "+n+" kolejnych liczb naturalnych wynosi "+sum);

    }

}
