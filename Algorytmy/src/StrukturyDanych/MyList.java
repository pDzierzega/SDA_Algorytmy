package StrukturyDanych;

/**
 * Created by RENT on 2017-08-01.
 */
public class MyList<T> {

    private Element<T> _head;
    private Element<T> _tail;
    private int _counter;

    public void goThroughListForward() {
        Element<T> p = _head;
        while (p.getNextElement() != null) {
            p = p.getNextElement();
        }
    }

    public void goThroughListBack() {
        Element<T> p = _tail;
        while (p.getNextElement() != null) {
            p = p.getPrevElement();
        }
    }

    public <T> void add(T newData) {
        String a = "AAA";
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
