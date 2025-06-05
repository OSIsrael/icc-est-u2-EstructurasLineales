package ejercicio_02_sorting; 
import controllers.StackG;
public class StackSorter {


    public void sortStack(StackG<Integer> stack) { 
        StackG<Integer> tempStack = new StackG<>(); 

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}