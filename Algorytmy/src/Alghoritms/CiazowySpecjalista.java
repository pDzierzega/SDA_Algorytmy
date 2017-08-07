package Alghoritms;

/**
 * Created by RENT on 2017-08-07.
 */
public class CiazowySpecjalista extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Ciazowy specjalista";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int [] tab=new int[3];

        for (int i = 1; i <input.length ; i++) {
            tab[i-1]=Integer.parseInt(input[i]);
        }

        double n;
        if (tab[2]>1) {
            n=-12*(tab[0]+tab[1]-tab[2]*tab[1])/(tab[2]-1);
            System.out.printf("Obecnie dziecko jest o %d lat młodsze od swojej matki.\n",tab[0]);
            System.out.printf("Za %d lat dziecko będzie %d razy młodsze od swojej matki\n",tab[1],tab[2]);
            System.out.printf("W takim wypadku ciąża [matki/dziecka] będzie trwać %.2f miesiecy\n",n);
        } else{
            n=1/tab[2] ;
            System.out.printf("Dziecko nie może być %.2f starsze od swojej matki ",n);
        }
    }
}
