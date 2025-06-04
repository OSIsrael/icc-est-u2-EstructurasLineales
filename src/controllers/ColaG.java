package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;

public class ColaG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    public int size;
    public ColaG() {
        this.primero=null;
        this.ultimo=null;
        this.size=0;
    }

    public void add(T value){
        NodeGeneric<T> newNode= new NodeGeneric<T>(value);
        if (isEmpty()) {
            primero=newNode;
            ultimo=newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo=newNode;
        }
        size++;
        
    }
    public T remove(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value=primero.getValue();
        primero=primero.getNext();
        size--;
        return value;
    }
    public T peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value=primero.getValue();
        return value;

    }
    public void printCola(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        NodeGeneric<T> aux=primero;
        while (aux!=null) {
            System.out.print(aux.getValue()+", ");
            aux=aux.getNext();
        }
    }

    public boolean isEmpty(){
        return primero==null;
    }
    public int getsize(){
        return size;
    }
}
