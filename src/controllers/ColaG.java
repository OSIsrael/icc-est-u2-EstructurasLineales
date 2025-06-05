package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;
import models.Persona;

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
    public Persona searchPerson(String name) {
        if (isEmpty()) {
            System.out.println("La cola está vacía, no se puede buscar a '" + name + "'.");
            return null;
        }

        NodeGeneric<T> current = primero; 
        while (current != null) {
            if (current.getValue() instanceof Persona) {
                Persona person = (Persona) current.getValue(); 
                if (person.getNombre().equals(name)) {
                    System.out.println("Se encontró a '" + name + "' en la cola.");
                    return person; 
                }
            }
            current = current.getNext(); 
        }

        System.out.println("No se encontró a '" + name + "' en la cola.");
        return null; 
    }
    public Persona removePerson(String name) {
        if (isEmpty()) {
            System.out.println("La cola está vacía, no se puede eliminar a '" + name + "'.");
            return null;
        }
        if (primero.getValue() instanceof Persona && ((Persona) primero.getValue()).getNombre().equals(name)) {
            Persona removedPerson = (Persona) primero.getValue();
            primero = primero.getNext(); 
            if (primero == null) { 
                ultimo = null;
            }
            size--;
            System.out.println("Se eliminó a '" + name + "' del inicio de la cola.");
            return removedPerson;
        }

        NodeGeneric<T> current = primero;
        NodeGeneric<T> previous = null;
        
        while (current != null && !(current.getValue() instanceof Persona && ((Persona) current.getValue()).getNombre().equals(name))) {
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("No se encontró a '" + name + "' para eliminar en la cola.");
            return null;
        }

        Persona removedPerson = (Persona) current.getValue();

        previous.setNext(current.getNext());

     
        if (current == ultimo) {
            ultimo = previous;
        }
        
        size--;
        System.out.println("Se eliminó a '" + name + "' de la cola.");
        return removedPerson;
    }
}
