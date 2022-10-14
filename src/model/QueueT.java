package model;

public class QueueT<T> {
    private Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public QueueT() {
        this.head = null;
    }

    public void insert(T t) {
        Node<T> node = new Node<>(t);
        if (head == null) {
            head = node;
        } else {
            Node<T> puntero = head;
            while (puntero.getNext() != null) {
                puntero = puntero.getNext();
            }
            puntero.setNext(node);
        }
    }

    public Node search(T goal) {
        return search(goal, head);
    }

    //Recursivo
    private Node<T> search(T goal, Node<T> current) {
        //Casos base
        if (current == null) {
            return null;
        }
        if (current.getValue() == goal) {
            return current;
        }
        //Llamados recursivos
        return search(goal, current.getNext());
    }

    public void insertarNodo(Node<T> t) {
        if (head == null) {
            head = t;
        } else {
            Node<T> puntero = head;
            while (puntero.getNext() != null) {
                puntero = puntero.getNext();
            }
            puntero.setNext(t);
        }
    }

    public void delete(T goal) {
        delete(goal, head, new QueueT<T>());
    }

    private void delete(T goal, Node<T> current, QueueT<T> out) {
        //Casos bases
        if (current == null) {
            head = out.head;
        } else {
            //Delete head
            if (current.getValue() == goal) {
                out.insertarNodo(current.getNext());
                head = out.head;
                return;
            }

            //Llamado recursivo
            out.insert(current.getValue());
            delete(goal, current.getNext(), out);
        }


    }

    public void mostrar() {
        Node<T> puntero = head;
        while (puntero != null) {
            System.out.print(puntero.getValue() + "-->");
            puntero = puntero.getNext();
        }
        System.out.println("null");
    }

    //falta heap


}
