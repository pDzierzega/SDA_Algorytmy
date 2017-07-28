import Alghoritms.AbstractAlgorithm;
import Alghoritms.MesureTheTime;
import Alghoritms.PalindronWLiczbach;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        String algorithmName = args[0];

        try {
            AlgorithmFactory factory = new AlgorithmFactory();
            ArrayList<AbstractAlgorithm> listOfAlgorithms = factory.getAlgorithm(algorithmName);

            for (AbstractAlgorithm algorithm : listOfAlgorithms) {
                System.out.println("Wykonujemy algorytm " + algorithm.getName());
                MesureTheTime.mesure(algorithm, args);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Nie ma takiego algorytmu");
        }
    }
}
