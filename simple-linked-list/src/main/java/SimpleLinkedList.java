import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    private Node<T> head;
    private int size;

    SimpleLinkedList() {
        head = null;
        size = 0;
    }

    SimpleLinkedList(T[] values) {
        this();
        if (values != null) {
            for (T value : values) {
                push(value);
            }
        }
    }

    void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("The list is empty.");
        }
        T value = head.value;
        head = head.next;
        size--;
        return value;
    }

    void reverse() {
        Node<T> previous = null;
        Node<T> current = head;
        Node<T> next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    T[] asArray(Class<T> clazz) {
        List<T> list = new ArrayList<>();
        Node<T> current = head;

        while (current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list.toArray((T[]) java.lang.reflect.Array.newInstance(clazz, list.size()));
    }

    int size() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }
}
