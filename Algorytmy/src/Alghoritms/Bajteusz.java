package Alghoritms;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by RENT on 2017-07-26.
 */
public class Bajteusz extends AbstractAlgorithm {
    private int numOfTest;
    private int [][] n;
    private int [] k;

    @Override
    public String getName() {
        return "Bajteusz - przeprowadzka";
    }

    @Override
    public void runAlgorithm(String[] input) {
         numOfTest=Integer.parseInt(input[1]);
         n=new int  [numOfTest][];
         k=new int  [numOfTest];

        int index=2;

        for (int i = 0; i <numOfTest ; i++) {
            index=createTest(i,index,input);
            System.out.println(calculateAlgorithm(i));
        }

        
    }

    private int createTest(int i, int index, String[] input) {
        n[i] =new int [Integer.parseInt(input[index])];
        k[i] = Integer.parseInt(input[index+1]);
        index=index+2;

        for (int j = 0; j <n[i].length ; j++) {
            n[i][j]=Integer.parseInt(input[index]);
            index++;
        }
    return index;
    }

    private int calculateAlgorithm(int i) {
        n[i]=SortowanieBabelkowe.sortedInt(n[i]);

        int numOfBoxes=0;
        int counter=n[i].length-1;
        int min;
        int max;
        
        for (int j = 0 ; j<=counter ; j++) {
            min=n[i][counter];
            max=n[i][j];
            numOfBoxes++;

//            for (int l = j; l <=counter ; l++) {
//                System.out.print(n[i][l] +" ,");
//            }
//            System.out.println( "liczba  pudełek " + numOfBoxes);

            if (min+max<=k[i]){
                counter--;
            }
        }
        return numOfBoxes;
    }

    }






