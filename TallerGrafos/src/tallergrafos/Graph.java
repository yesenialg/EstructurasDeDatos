/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallergrafos;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class Graph {
    
    private final boolean aMatrix[][];
    private final int totalNodes;
    private final LinkedList<Integer> aList[];
    public Graph(int n){
        totalNodes=n;
        aMatrix=new boolean[n][n];
        aList = new LinkedList[n];
        for (int i = 0; i < totalNodes; i++) {
            aList[i] = new LinkedList<>();
        }
    }
    
    public void addEdge(int source, int destination){
        aMatrix[source][destination]=true;
        aList[source].add(destination);
    }
    
    //Punto 1 - Recorrido completo por los nodos
    ArrayList<String> check=new ArrayList<>();
    public void RecorridoGrafo(){
        RecorridoGrafo(0);
    }
    private void RecorridoGrafo(int s){
        if(check.size()!=aList.length){
        check.add(s+"");
        System.out.print(s+" ");
          for(int vecino:aList[s]){
             if(check.contains(vecino+"")){
                 RecorridoGrafo(vecino);
                 System.out.print(s+" ");
            }
            }
        }
    }
    
    //Punto 2 - Decir si cada nodo tiene la misma 
    //          cantidad de entradas y salidas
    public boolean MismaEntradoasSalidas(){
        int contador=0,cont=0;
        for (int i = 0; i < totalNodes; i++) {
            for (int j = 0; j < totalNodes; j++) {
                if(aMatrix[i][j]){
                    contador++;
                }
            }
            for (int j = 0; j < totalNodes; j++) {
                if(aMatrix[j][i]){
                    cont++;
                }
            }
            if(!(contador==cont)){
                return false;
            }
        }
        return true;
    }
    
    //Punto 3 - Decir que arcos faltan para conectar 
    //          todos los nodos
    public void ArcosFaltantes(){
        ArrayList<String> faltan =new ArrayList<>();
        for (int i = 0; i < totalNodes; i++) {
            for (int j = i; j < totalNodes; j++) {
                boolean exis=false;
                for(int vecinos:aList[i]){
                    if((vecinos==j&&!aList[vecinos].contains(i))
                            ||(aList[j].contains(i))){
                        exis=true;
                    }
                }
                if(!exis&&i!=j){
                    faltan.add("("+i+","+j+")");
                }
            }
        }
        for(String faltantes:faltan){
            System.out.print(faltantes+" ");
        }
    }
}

