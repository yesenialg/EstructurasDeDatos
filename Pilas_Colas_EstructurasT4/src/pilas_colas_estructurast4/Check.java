/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_colas_estructurast4;

/**
 *
 * @author HP
 */
public class Check {

    public boolean checkBalanced(String exp) {
        LinkedStack validateStack = new LinkedStack();
        char[] arrayString = exp.toCharArray();
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i] == '(') {
                validateStack.push('(');
            } else if (arrayString[i] == '[') {
                if (validateStack.peek().equals('(')) {
                    return false;
                } else {
                    validateStack.push('[');
                }
            } else if (arrayString[i] == '{') {
                if (validateStack.peek() != null) {
                    if (validateStack.peek().equals('(') || validateStack.peek().equals('[')) {
                        return false;
                    } else {
                        validateStack.push('{');
                    }
                } else {
                    validateStack.push('{');
                }
            } else if (arrayString[i] == ')' || arrayString[i] == ']' || arrayString[i] == '}') {
                if (validateStack.empty()) {
                    return false;
                } else if (arrayString[i] == ')' && validateStack.peek().equals('(')) {
                    validateStack.pop();
                } else if (arrayString[i] == ']' && validateStack.peek().equals('[')) {
                    validateStack.pop();
                } else if (arrayString[i] == '}' && validateStack.peek().equals('{')) {
                    validateStack.pop();
                } else {
                    return false;
                }
            }
        }
        return validateStack.empty();
    }
}
