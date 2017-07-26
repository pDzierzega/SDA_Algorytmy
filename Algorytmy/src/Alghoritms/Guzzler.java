package Alghoritms;

public class Guzzler extends  AbstractAlgorithm {
    private final int DAY_IN_SECONDS=60*60*24;

    private int time[][];
    private int numOfGuzzlers[];
    private int numOfCookies[];
    private int numOfTest;
    private int index;

    @Override
    public String getName() {
        return "Obzartuch (Guzzler) ";
    }

    @Override
    public void runAlgorithm(String[] input) {
        createAlgorithm(input);

        for (int i = 0; i <numOfTest ; i++) {
            System.out.println("Należy kupić " +calculateTest(i) + " ciastek");
        }

    }

    public void createAlgorithm(String[] input) {

        numOfTest=Integer.parseInt(input[1]);

        numOfGuzzlers =new int[numOfTest];
        numOfCookies =new int[numOfTest];
        time=new int[numOfTest][];

        index=2;
        for (int i = 0; i <numOfTest ; i++) {
            index=createTest(i,index,input);
        }

    }

    private int createTest(int i, int index, String[] input) {
        numOfGuzzlers[i]=Integer.parseInt(input[index]);
        numOfCookies[i]=Integer.parseInt(input[index+1]);

        time[i]=new int[numOfGuzzlers[i]];
        index=index+2;

        for (int j = 0; j <numOfGuzzlers[i] ; j++) {
            time[i][j]=Integer.parseInt(input[index]);
            index++;
        }

        return index;
    }

    private int calculateTest(int i) {
        int sum=0;
        for (int cookies :time[i]) {
            sum=DAY_IN_SECONDS/cookies+sum;
        }
        return (sum%numOfCookies[i]==0)? sum/numOfCookies[i]:sum/numOfCookies[i]+1;
    }
}
