package Alghoritms;

/**
 * Created by RENT on 2017-07-24.
 */
public class LeapYear extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "LeapYear";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for (int i=0; i<Integer.parseInt(input[1]);i++){
            System.out.println(isLeapyear(Integer.parseInt(input[i+2])));
        }
    }

    private boolean isLeapyear (int year){
        if (year%400==0) {
            return true;
        }
        if ((year%4==0) && (year%100==0)){
            return true;
        }
        else {
            return false;
        }
    }
}
