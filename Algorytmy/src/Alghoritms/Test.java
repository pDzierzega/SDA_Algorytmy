package Alghoritms;

/**
 * Created by RENT on 2017-07-21.
 */
public class Test extends AbstractAlgorithm {

    public Test() {
        System.out.println("Konstruktor TEST");
    }

    @Override
    public String getName() {
        return "Test";
    }

    @Override
    public void RunAlgorithm(String[] input) {
        System.out.println("To jest algorytm testowy!");
    }
}
