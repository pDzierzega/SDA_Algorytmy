package StrukturyDanych;

/**
 * Created by RENT on 2017-08-07.
 */
public class MyHeap extends MyTree <Integer>  {

    public MyHeap(Class<Integer> c) {
        super(c);
    }

    @Override
    public void add (Integer... data){
        for (Integer t :data) {
            isFatherBigger(length,t);
            length++;
        }
        level=level();
    }

    private void isFatherBigger (int i,int t){
        if (i>0) {
            int parent=(i-1)/2;
                if (tab[parent]>t) {
                tab[i]=t;
            } else {
                tab[i]=tab[parent];
                isFatherBigger(parent,t);
            }
        }
    }


}
