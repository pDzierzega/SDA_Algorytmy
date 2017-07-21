import Alghoritms.AbstractAlgorithm;
import Alghoritms.BiednyCamelCase;
import Alghoritms.Test;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgorithmFactory {

    public  AbstractAlgorithm getAlgorithm(String name) throws Exception{
        switch (name.toLowerCase()){
            case "test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();
            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }

}
