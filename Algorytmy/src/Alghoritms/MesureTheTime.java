package Alghoritms;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Created by RENT on 2017-07-27.
 */
public class MesureTheTime  {

    @SuppressWarnings("uncheked")
    public static <T extends AbstractAlgorithm> void mesure (T algoritm,String[] args) {


            LocalTime methodStart = LocalTime.now();
            algoritm.runAlgorithm(args);
            LocalTime methodEnd = LocalTime.now();

            Duration methoddDuration = Duration.between(methodStart, methodEnd);

            System.out.println();
            System.out.println();
            System.out.println("Ten algorytm zajal :" + methoddDuration + "s");
        }
    }
