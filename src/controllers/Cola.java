package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Cola {
    private Node primero;
    private Node ultimo;
    public int size;
    public Cola() {
        this.primero=null;
        this.ultimo=null;
        this.size=0;
    }

    public void add(int value){
        Node newNode= new Node(value);
        if (isEmpty()) {
            primero=newNode;
            ultimo=newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo=newNode;
        }
        size++;
        
    }
    public int remove(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value=primero.getValue();
        primero=primero.getNext();
        size--;
        return value;
    }
    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value=primero.getValue();
        return value;

    }
    public void printCola(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Node aux=primero;
        while (aux!=null) {
            System.out.print(aux.getValue()+", ");
            aux=aux.getNext();
        }
    }

    public boolean isEmpty(){
        return primero==null;
    }
}
