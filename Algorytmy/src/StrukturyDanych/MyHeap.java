package StrukturyDanych;

/**
 * Created by RENT on 2017-08-07.
 */
public class MyHeap extends MyTree <Integer>  {

    public MyHeap() {
        super(Integer.class);
    }

    @Override
    public void add (Integer... data){
        for (Integer t :data) {
            fatherIsAlwaysBigger(length,t);
            length++;
        }
        level=level();
    }

    private void fatherIsAlwaysBigger(int i, int t){
        if (i>0) {
            int parent=(i-1)/2;
                if (tab[parent]>t) {
                tab[i]=t;
            } else {
                tab[i]=tab[parent];
                fatherIsAlwaysBigger(parent,t);
            }
        }
    }

    public int[] sorted (){
        int[] sorted=new int[length-1];
        return sorted;
    }

    private int indexOfBiggerSon (int i, int t){
        int first=2*i+1;
        if (first==length-1) return first;
        int second=first+1;
        return tab[first]>tab[second]? first:second;
        }
    }



