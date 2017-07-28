import Alghoritms.AbstractAlgorithm;
import Alghoritms.MesureTheTime;
import Alghoritms.PalindronWLiczbach;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) throws Exception{
        String algorithmName = args [0];

        AlgorithmFactory factory=new AlgorithmFactory();
        ArrayList<AbstractAlgorithm> listOfAlgorithms = factory.getListAlgorith(algorithmName);

        for (AbstractAlgorithm algorithm :listOfAlgorithms) {
            System.out.println("Wykonujemy algorytm " + algorithm.getName());
            MesureTheTime.mesure(algorithm, args);
            System.out.println();
        }


    }
}
