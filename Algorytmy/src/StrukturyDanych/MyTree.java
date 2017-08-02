package StrukturyDanych;

import java.lang.reflect.Array;

/**
 * Created by RENT on 2017-08-02.
 */
public class  MyTree <T> {
    private T[] tab;
    private T _root;
    private int length;
    private int level;

    public MyTree(Class <T> c, int length) {
        this.length = length;
        final T[] tab = (T[]) Array.newInstance(c, length);
        final int level=level();
        _root=tab[0];
}

    private int level() {
        int level = 0;
        while ((int) Math.pow(2,level) >= length-1) {
            level++;
        }
        return  level;
    }

    public void addAll (T... data){
        int i=0;
        for (T d :data) {
        //    tab[i]=d;
            i++;
        }
    }

    public T get (int i){
        return tab[i];
    }




}
