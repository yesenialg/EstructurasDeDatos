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
    
    public boolean checkBalanced(String exp){
        LinkedStack validateStack = new LinkedStack();
        char[] arrayString = exp.toCharArray();
        for (int i = 0; i < arrayString.length; i++) {
            if(arrayString[i]=='('){
                validateStack.push('(');                
            }else if (arrayString[i]==')'){
                if(validateStack.empty()){
                    return false;
                }else{
                    validateStack.pop();
                }
            }
        }
        return validateStack.empty();
    }
}
