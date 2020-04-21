/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

/**
 *
 * @author HP
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarySearchTree pino = new BinarySearchTree(10);
        pino.Add(5);
        pino.Add(3);
        pino.Add(8);
        pino.Add(20);
        pino.Add(7);
        pino.Add(18);
        pino.Add(25);
        pino.Add(23);
        pino.Add(30);
        pino.Add(21);
        pino.Add(24);
        System.out.println("");

        System.out.println("Inorden");
        pino.InOrden();
        System.out.println("");
        System.out.println("");
        System.out.println("preorden");
        pino.PreOrden();
        System.out.println("");
        System.out.println("");
        System.out.println("postorden");
        pino.Postorden();
        System.out.println("");
        pino.Delete(20);
        System.out.println("");
        System.out.println("Inorden borrado 20");
        pino.InOrden();
        System.out.println("");
        pino.Delete(5);
        pino.Delete(3);
        pino.Delete(25);
        pino.Delete(30);
        pino.Delete(8);
        System.out.println("");
        System.out.println("Inorden borrados los numeros(5,3,25,30,8)");
        pino.InOrden();
        System.out.println("");
        System.out.println("Hojas");
        System.out.println(pino.CountLeafs());
        System.out.println("Nodos");
        System.out.println(pino.CountNodes());
        System.out.println("Último nivel");
        System.out.println(pino.LastLevel());
        System.out.println("Level order");
        pino.LevelOrder();
    }
    
}
