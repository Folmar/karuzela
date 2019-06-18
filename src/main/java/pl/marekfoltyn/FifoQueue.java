package pl.marekfoltyn;


public class FifoQueue {
    private Node head;
    private int size;

    /**
     * wepchniecie na kolejke
     * jak add z List(poprzedni projekt)
     *
     * @param node
     */
    public void push(Node node) {
        Node tmpNode = head; //zmienna pomocnicza - nie tworzymy nowego obiektu jak w przypadku Listy (Node node = new Node(value)). Nie alokujemy miejsca w pamięci. Tworzymy wskaźnik
        if (head == null) {
            head = node;
        } else {
            //iterujemy do momentu aż będziemy mieli w kolejce nulla
            while (tmpNode.getNext() != null) {
                tmpNode = tmpNode.getNext();
            }

            tmpNode.setNext(node);
        }
        size++;
    }

    /**
     * zdjecie z kolejki
     *
     * @return
     */
    public Node pop() {
        Node tmpPopNode = head; //zmienna pomocnicza po to żeby ustawić wartość heada na następna czyli getNext
        head = head.getNext();
        tmpPopNode.setNext(null);
        size--;
        return tmpPopNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //Napisz program, który będzie odwzorowywał pracę operatora karuzeli.
    //Będzie sterował wpuszczaniem ludzi na w/w karuzelę
    //Pamiętaj że ludzie chcacy przejechać się na atrakcji ustawiają się wkolejce
    //Na karuzelę moze wejść tylko jedna osoba na raz - ta która jest pirwsza w kolejce
    //z przyczyn technicznych program musi
}

