package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top=null;
        this.size=0;
    }
    public void push(int value){
        Node newNode=new Node(value);
        newNode.setNext(top);
        top=newNode;
        size++;
    }
    public int pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value=top.getValue();
        top=top.getNext();
        size--;
        return value;
    }
    public int peek(){
        if (isEmpty()) throw new EmptyStackException();
        return top.getValue();
    }

    public boolean isEmpty(){
        return top==null;
    }
    public void printStack(){
        Node actual=top;
      while (actual!=null) {
        System.out.print(actual.getValue()+", ");
        actual=actual.getNext();
      }
    }
    public int printSize(){
        return size;
    }
    
}
