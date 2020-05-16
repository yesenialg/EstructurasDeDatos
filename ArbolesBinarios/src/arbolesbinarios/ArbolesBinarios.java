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
        pino.Add(1);
        pino.Add(2);
        pino.Add(3);
        pino.Add(4);
        pino.Add(5);
        pino.Add(6);
        pino.Add(7);
        pino.Add(8);
        pino.Add(9);
        pino.Add(10);
        pino.Add(11);
        System.out.println("");

        System.out.println("Lectura preorden");
        pino.PreOrden();
        System.out.println("");
        System.out.println("");
        System.out.println("Lectura Inorden");
        pino.InOrden();
        System.out.println("");
        System.out.println("");
        System.out.println("Lectura postorden");
        pino.Postorden();
        System.out.println("");
        pino.Delete(2);
        System.out.println("");
        System.out.println("Inorden sin 2");
        pino.InOrden();
        System.out.println("");
        pino.Delete(5);
        pino.Delete(3);
        pino.Delete(4);
        pino.Delete(8);
        System.out.println("");
        System.out.println("Inorden eliminando los numeros{5-3-4-8}");
        pino.InOrden();
        System.out.println("");
        System.out.println("Numero de Hojas");
        System.out.println(pino.CountLeafs());
        System.out.println("Numero de Nodos");
        System.out.println(pino.CountNodes());
        System.out.println("Último nivel del arbol");
        System.out.println(pino.LastLevel());
        System.out.println("Level order");
        pino.LevelOrder();
    }
    
}
