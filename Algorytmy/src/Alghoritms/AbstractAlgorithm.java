package Alghoritms;

/**
 * Created by RENT on 2017-07-21.
 */
public abstract class AbstractAlgorithm {
    public AbstractAlgorithm() {
        System.out.println("Konstruktor Abstract Algorithm");
    }

    public abstract String getName();
    public abstract void RunAlgorithm(String[] input);

}
