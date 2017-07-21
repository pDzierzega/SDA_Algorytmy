import Alghoritms.AbstractAlgorithm;

public class Main  {

    public static void main(String[] args) throws Exception{
        String algorithmName = args [0];
        for (String s :args) {
            System.out.println(s);
        }

        for (int i=0; i<args.length;i++ ){
            System.out.println(args[i]);
        }

        AlgorithmFactory factory=new AlgorithmFactory();
        AbstractAlgorithm algorithm=
                factory.getAlgorithm(algorithmName);

    }
}
