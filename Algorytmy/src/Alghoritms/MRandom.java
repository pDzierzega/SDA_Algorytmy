package Alghoritms;

import java.util.Random;

/**
 * Created by RENT on 2017-07-31.
 */
public class MRandom extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "m_Random";
    }

    @Override
    public void runAlgorithm(String[] input) {
        Random  mRand = new Random(12);
        int [] tabOfrandom=new int [200];

        for (Integer integer :tabOfrandom) {
            integer=mRand.nextInt();
        }

        int [] even=new int [200];
        int [] odd=new int [even.length];

        for (int i = 0; i <even.length ; i++) {
            even[i]=2*i;
            odd[i]=2*i+1;
        }

    }




    }

