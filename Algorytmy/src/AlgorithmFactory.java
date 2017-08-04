import Alghoritms.*;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgorithmFactory {

    public  ArrayList <AbstractAlgorithm> getAlgorithm(String name) throws AlgorithException {
        ArrayList<AbstractAlgorithm> toReturn = new ArrayList<>();
        switch (name.toLowerCase()){
            case "test":
            toReturn.add( new Test());
            break;
            case "ester":
            toReturn.add(new Easter());
            break;
            case "camelcase":
            toReturn.add( new CamelCase_v1());
            toReturn.add( new CamelCase_v2());
            break;
            case "palindromwliczbach":
            toReturn.add( new PalindronWLiczbach_v1());
            toReturn.add( new PalindronWLiczbach_v2());
                // goThrouht
            case "palindrom":
                toReturn.add(new Palindrom());
                break;
            case "sortowanieprzezzliczanie":
                toReturn.add( new SortowaniePrzezZliczanie_v1());
                toReturn.add( new SortowaniePrzezZliczanie_v2());
                break;
            case "minandmax":
                toReturn.add(new MinAndMax());
                break;
            case "base":
                toReturn.add(new ParseToNSystem());
                break;
            case "onp":
                toReturn.add(new ONP());
                break;
            case "onpreversed":
                toReturn.add((new ONP_reversed()));
                break;
            case "lider":
                toReturn.add(new Lider());
                break;
            case "mrand":
                toReturn.add(new MRandom());
                break;
            case "duplikat":
                toReturn.add(new Duplikat());
                break;
            case "lista":
                toReturn.add(new Zad2_Lista());
                break;
            case "sumall":
            toReturn.add( new SumAll());
                break;
            case "sumall2":
            toReturn.add( new SumAll_2());
                break;
            case "bankomat":
            toReturn.add( new Bankomat());
                break;
            case "leapyear":
            toReturn.add( new LeapYear());
                break;
            case "strong":
            toReturn.add( new Strong());
                break;
            case "triangleholiday":
            toReturn.add( new TriangleHolyday());
                break;
            case "sumlikestrong":
            toReturn.add( new SumLikeStrong());
                break;
            case "fibonaccisequence":
            toReturn.add( new FibonacciSequence());
                break;
            case "ciphercezar":
            toReturn.add( new CipherCezar());
                break;
            case "flamaster":
            toReturn.add( new Flamaster());
                break;
            case "guzzler":
            toReturn.add( new Guzzler());
                break;
            case "sortowaniebabelkowe":
            toReturn.add( new SortowanieBabelkowe());
                break;
            case "bajteusz":
            toReturn.add( new Bajteusz());
                break;
            case "zil":
            toReturn.add( new ZliczaczLiter());
                break;
            case "statki":
                toReturn.add( new Statki());
                break;
            case "nwd":
                toReturn.add( new NWD());
                break;
            case "warcaby":
                toReturn.add( new GeneratorPlanszyWarcaby());
                break;
            case "dominanta":
                toReturn.add( new Dominanta());
                break;
            case "punkty":
                toReturn.add( new PunktyZSprawdzianu());
                break;
            case "ktorydzien":
                toReturn.add( new KtoryDzienRoku());
                break;
            default:
                throw new AlgorithException ("Nie ma takiego algorytmu");
        }
        return toReturn;
    }

    public static class AlgorithException extends Exception{

        public AlgorithException(String message) {
            super(message);
        }
    }

}
