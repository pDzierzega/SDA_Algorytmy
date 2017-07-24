import Alghoritms.*;

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
            case "sumall":
                return new SumAll();
            case "sumall2":
                return new SumAll_2();
            case "bankomat":
                return new Bankomat();
            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }

}
