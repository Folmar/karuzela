package pl.marekfoltyn;

public class LifoQueue {
    private Node head;

    //dodaje wartość do kolejki
    public void push(Node node) {
        Node tmp = head;
        head.setNext(tmp);
    }

    //zdejmuje wartość z kolejki
    public Node pop() {
        Node tmp = head;
        head = head.getNext();
        tmp.setNext(null);
        return tmp;
    }
}
