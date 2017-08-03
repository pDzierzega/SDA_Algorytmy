package StrukturyDanych;

import java.lang.reflect.Array;

/**
 * Created by RENT on 2017-08-02.
 */
public class  MyTree <T> {
    private T[] tab;
    private T _root;
    private int length;

    public MyTree(Class <T> c) {
        tab = (T[]) Array.newInstance(c, 1000);
        int level=level();
        length=0;
        tab[0]=null;
        _root=tab[0];
        System.out.println("tu");
}

    public int level() {
        int level = 0;
        while ((int) Math.pow(2,level) < length-1) {
            level++;
        }
        return  level;
    }

    public void add (T... data){
        for (T t :data) {
            tab[length]=t;
            length++;
        }
    }

    public T get (int i){
        return tab[i];
    }






}
