package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;

public class StackG<T> {
    private int size;
    private NodeGeneric<T> top;

    public StackG() {
        this.size = 0;
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        newNode.setNext(top); 
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return top.getValue();
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Pila vacía.");
            return;
        }
        NodeGeneric<T> actual = top;
        System.out.print("Pila: [");
        while (actual != null) {
            System.out.print(actual.getValue());
            if (actual.getNext() != null) {
                System.out.print(", ");
            }
            actual = actual.getNext();
        }
        System.out.println("]");
    }

    public int printSize() { 
        return size;
    }
}