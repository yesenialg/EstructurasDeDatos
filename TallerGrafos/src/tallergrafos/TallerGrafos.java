/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallergrafos;

/**
 *
 * @author HP
 */
public class TallerGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Graph graf1 = new Graph(4);
        graf1.addEdge(0, 1);
        graf1.addEdge(0, 2);
        graf1.addEdge(0, 3);
        graf1.addEdge(1, 0);
        graf1.addEdge(2, 0);
        graf1.addEdge(3, 0);
        System.out.println("");
        System.out.println("Punto 1");
        System.out.println("Recorrido del grafo");
        System.out.println("");
        System.out.println("[[1,2,3],[0],[0],[0]]");
        graf1.RecorridoGrafo();
        
        
        Graph graf2 = new Graph(4);
        graf2.addEdge(0, 1);
        graf2.addEdge(1, 2);
        graf2.addEdge(2, 0);
        graf2.addEdge(2, 3);
        graf2.addEdge(3, 2);System.out.println("\n");
        System.out.println("Punto 2");
        System.out.println("Validacion de que tenga mismas entradas que salidas");
        System.out.println("");
        System.out.println("Matriz");
        System.out.println("");
        System.out.println("[[false, true,  false, false],");
        System.out.println("[false, false, true,  false],");
        System.out.println("[true,  false, false, true ],");
        System.out.println("[false, false, true,  false]]");
        System.out.println("");
        System.out.println(graf2.MismaEntradoasSalidas());
        System.out.println("");
        
        
        System.out.println("Punto 3");
        System.out.println("Arcos faltantes");
        System.out.println("");
        System.out.println("Arcos");
        System.out.println("[[5,3],  [4,0],  [0,1],  [6,5],  [3,4],  [0,3],  [2,0],  [2,1],  [2,6], "
                + "\n [5,1],  [3,2],  [0,5],  [1,3],  [1,4],  [6,3]]");
        Graph graf3 = new Graph(7);
        graf3.addEdge(5, 3);
        graf3.addEdge(4, 0);
        graf3.addEdge(0, 1);
        graf3.addEdge(6, 5);
        graf3.addEdge(3, 4);
        graf3.addEdge(0, 3);
        graf3.addEdge(2, 0);
        graf3.addEdge(2, 1);
        graf3.addEdge(2, 6);
        graf3.addEdge(5, 1);
        graf3.addEdge(3, 2);
        graf3.addEdge(0, 5);
        graf3.addEdge(1, 3);
        graf3.addEdge(1, 4);
        graf3.addEdge(6, 3);
        graf3.ArcosFaltantes();
    }

}
