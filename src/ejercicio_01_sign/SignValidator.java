package ejercicio_01_sign; 
import controllers.StackG;

public class SignValidator {

    public boolean isValid(String s) {
        StackG<Character> stack = new StackG<>(); 
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':

                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false; 
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }
}