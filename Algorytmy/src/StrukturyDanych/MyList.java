package StrukturyDanych;

/**
 * Created by RENT on 2017-08-01.
 */
public class MyList<T> {

    private Element<T> _head;
    private Element<T> _tail;
    private int _counter;

    public void printListForward() {
        Element<T> p = _head;
        while (p.getNextElement() != null) {
            System.out.println(p.getData().toString());
            p = p.getNextElement();
        }
        System.out.println(_tail.getData());

    }

    public void printListBack() {
        Element<T> p = _tail;
        while (p.getPrevElement() != null) {
            System.out.println(p.getData().toString());
            p = p.getPrevElement();
        }
        System.out.println(_head.getData());
    }



    public <T> void add(T newData) {
        if (_head == null) {
            _head = new Element(null, newData);
            _tail = _head;
        } else {
            _tail = new Element(_tail, newData);
            _tail.getPrevElement().setNextElement(_tail);
        }
        _counter++;
    }

    public <T> void add(T... Data) {
        for (T newData : Data) {
            if (_head == null) {
                _head = new Element(null, newData);
                _tail = _head;
            } else {
                _tail = new Element(_tail, newData);
                _tail.getPrevElement().setNextElement(_tail);
            }
            _counter++;
        }
    }

    public int length (){
        return _counter;
    }
}
