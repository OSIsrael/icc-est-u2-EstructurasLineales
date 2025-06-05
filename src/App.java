import controllers.Cola;
import controllers.ColaG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);
        stack.printSize();
        stack.printStack();
        System.out.println();
        stack.pop();
        stack.peek();
        stack.printSize();
        stack.printStack();
        
        System.out.println("NODO GENERICOS");
        System.out.println("ENTEROS");
        StackG<Integer> stackG=new StackG<Integer>();
        stackG.push(4);
        stackG.push(2);
        stackG.push(0);
        stackG.push(6);
        StackG<String> stackG2=new StackG<String>();
        stackG2.push("HOY?");
        stackG2.push("ESTAS");
        stackG2.push("COMO");
        stackG2.push("HOLA");
       ///// impresion enteros
        stackG.printSize();
        stackG.printStack();
        System.out.println();
        stackG.pop();
        stackG.peek();
        stackG.printSize();
        stackG.printStack();
        ////// impresion cadenas
         stackG2.printSize();
        stackG2.printStack();
        System.out.println();
        stackG2.pop();
        stackG2.peek();
        stackG2.printSize();
        stackG2.printStack();
        
        Cola cola=new Cola();
            cola.add(5);
            cola.add(7);
            cola.add(10);
            System.out.println("tam= "+ cola.size);
            cola.remove();
            System.out.println("tam= "+cola.size);
            cola.printCola();
            
       Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");
        Persona p4 = new Persona("Ana");
        Persona p5 = new Persona("Carlos");
        
        ColaG<Persona> colaG = new ColaG<>();
        colaG.add(p1); 
        colaG.add(p2); 
        colaG.add(p3); 
        
        System.out.println("--- Cola inicial ---");
        System.out.println("Tamaño: " + colaG.getsize()); 
        colaG.printCola(); 
        System.out.println();

        System.out.println("--- Eliminar a Juan (en medio) ---");
        Persona removed = colaG.removePerson("Juan");
        if (removed != null) {
            System.out.println("Eliminada: " + removed.getNombre()); 
        }
        System.out.println("Tamaño: " + colaG.getsize()); 
        colaG.printCola(); 
        System.out.println();

        System.out.println("--- Eliminar a Pablo (el primero) ---");
        removed = colaG.removePerson("Pablo");
        if (removed != null) {
            System.out.println("Eliminada: " + removed.getNombre());
        }
        System.out.println("Tamaño: " + colaG.getsize()); 
        colaG.printCola(); 
        System.out.println();

        System.out.println("--- Eliminar a Maria (la ultima, ahora primera) ---");
        removed = colaG.removePerson("Maria");
        if (removed != null) {
            System.out.println("Eliminada: " + removed.getNombre()); 
        }
        System.out.println("Tamaño: " + colaG.getsize()); 
        colaG.printCola(); 
        System.out.println();

        System.out.println("--- Intentar eliminar de una cola vacía ---");
        removed = colaG.removePerson("Inventado"); 
        System.out.println("Tamaño: " + colaG.getsize()); 
        colaG.printCola();
        System.out.println();

        System.out.println("--- Añadir más personas y eliminar la última ---");
        colaG.add(p4); 
        colaG.add(p5); 
        System.out.println("Tamaño: " + colaG.getsize()); 
        colaG.printCola(); 
        
        removed = colaG.removePerson("Carlos"); 
        if (removed != null) {
            System.out.println("Eliminada: " + removed.getNombre());
        }
        System.out.println("Tamaño: " + colaG.getsize()); 
        colaG.printCola(); 


    }
}
