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
public class ConvertDecimals {

    public void base(int decimal, int base) throws Exception {
        switch (base) {
            case 2:
                toBinary(decimal);
                break;
            case 8:
                toOctal(decimal);
                break;
            case 16:
                toHexadecimal(decimal);
                break;
            default:
                throw new Exception("La base ingresada no es correcta");
        }
    }

    public String toBinary(int n) {
        LinkedStack bin = new LinkedStack();
        String binary = "";

        while (n > 0) {
            bin.push(n % 2);
            n /= 2;
        }
        while (!bin.empty()) {
            try {
                binary += bin.pop();
            } catch (Exception e) {
                binary = "Error interno";
            }
        }
        return binary;
    }

    public String toOctal(int n) {
        LinkedStack oct = new LinkedStack();
        String octal = "";

        while (n > 0) {
            oct.push(n % 8);
            n /= 8;
        }
        while (!oct.empty()) {
            try {
                octal += oct.pop();
            } catch (Exception e) {
                octal = "Error interno";
            }
        }
        return octal;
    }

    public String toHexadecimal(int n) {
        LinkedStack hex = new LinkedStack();
        String hexadecimal = "";

        while (n > 0) {
            int num = n % 16;
            switch (num) {
                case 10:
                    hex.push("A");
                    break;
                case 11:
                    hex.push("B");
                    break;
                case 12:
                    hex.push("C");
                    break;
                case 13:
                    hex.push("D");
                    break;
                case 14:
                    hex.push("E");
                    break;
                case 15:
                    hex.push("F");
                    break;
                default:
                    hex.push(n % 16);
                    break;
            }
            n /= 16;
        }
        while (!hex.empty()) {
            try {
                hexadecimal += hex.pop();
            } catch (Exception e) {
                hexadecimal = "Error interno";
            }
        }
        return hexadecimal;
    }
}
