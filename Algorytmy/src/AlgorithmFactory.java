import Alghoritms.*;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgorithmFactory {
    public ArrayList <AbstractAlgorithm> getListAlgorith (String name) throws Exception{
        ArrayList <AbstractAlgorithm> listOfAlgorithm=new ArrayList<>();
        listOfAlgorithm.add(getAlgorithm(name));
        switch (name.toLowerCase()){
            case "sortowanieprzezzliczanie":
                listOfAlgorithm.add(new SortowaniePrzezZliczanie_v2());
                break;
        }
        return listOfAlgorithm;
    }



    public  AbstractAlgorithm getAlgorithm(String name) throws Exception{
        switch (name.toLowerCase()){
            case "test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
            case "sumall":
                return new SumAll();
            case "sumall2":
                return new SumAll_2();
            case "bankomat":
                return new Bankomat();
            case "leapyear":
                return new LeapYear();
            case "strong":
                return new Strong();
            case "triangleholiday":
                return new TriangleHolyday();
            case "sumlikestrong":
                return new SumLikeStrong();
            case "fibonaccisequence":
                return new FibonacciSequence();
            case "ciphercezar":
                return new CipherCezar();
            case "palindromwliczbach":
                return new PalindronWLiczbach();
            case "flamaster":
                return new Flamaster();
            case "guzzler":
                return new Guzzler();
            case "sortowaniebabelkowe":
                return new SortowanieBabelkowe();
            case "bajteusz":
                return new Bajteusz();
            case "zil":
                return new ZliczaczLiter();
            case "sortowanieprzezzliczanie":
                return new SortowaniePrzezZliczanie_v1();
            case "statki":
                return new Statki();
            case "nwd":
                return new NWD();
            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }

}
