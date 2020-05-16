/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_final;

/**
 *
 * @author HP
 */
public class BinarySearchTree {
    
    private BinaryNode root;
    private BinaryNode father;
    private boolean position;
    private int nodes;
    private int leaves;
    private int altura;
    String linea = "";

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int data) {
        root = new BinaryNode(data);
        nodes++;
    }
    
    public void Add(int data) {
        if (root == null) {
            root = new BinaryNode(data);
            root.setLevel(LastLevel());
            nodes++;
        } else //validar si el dato ya existe
        {
            if (Search(data) != null) {
                System.out.println("Dato repetido, no se puede insertar");
            } else {
                Add(data, root);
                nodes++;
            }
        }
    }

    private void Add(int data, BinaryNode currentRoot) {
        if (data < currentRoot.getData()) {
            if (currentRoot.getLeft() == null) {
                BinaryNode binaryNode = new BinaryNode(data);
                binaryNode.setLevel(currentRoot.getLevel() + 1);
                currentRoot.setLeft(binaryNode);
            } else {
                Add(data, currentRoot.getLeft());
            }

        } else {
            if (currentRoot.getRight() == null) {
                BinaryNode binaryNode = new BinaryNode(data);
                binaryNode.setLevel(currentRoot.getLevel() + 1);
                currentRoot.setRight(binaryNode);
            } else {
                Add(data, currentRoot.getRight());
            }
        }
    }
    
    public BinaryNode Search(int data) {
        return Search(data, root);
    }

    private BinaryNode Search(int data, BinaryNode currentRoot) {
        if (currentRoot == null) {
            return currentRoot;
        } else if (data == currentRoot.getData()) {
            return currentRoot;
        }
        this.father = currentRoot;
        if (data < currentRoot.getData()) {
            this.position = false;
            return Search(data, currentRoot.getLeft());
        } else {
            this.position = true;
            return Search(data, currentRoot.getRight());
        }
    }

     public int LastLevel() {
        altura = -1;
        LastLevel(root, 0);
        return altura;
    }

    private void LastLevel(BinaryNode currentRoot, int nivel) {
        if (currentRoot != null) {
            LastLevel(currentRoot.getLeft(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            LastLevel(currentRoot.getRight(), nivel + 1);
        }
    }
    
    public void LevelOrder() {
        for (int i = 0; i < LastLevel() + 1; i++) {
            System.out.println(searchLevel(i));
        }
    }

    public String searchLevel(int level) {
        searchLevel(level, root);
        String temp = linea;
        linea = "";
        return temp;
    }

    private void searchLevel(int level, BinaryNode currentRoot) {
        if (currentRoot != null) {
            if (currentRoot.getLevel() == level) {
                linea += currentRoot.getData() + " ";
            }
            searchLevel(level, currentRoot.getLeft());
            searchLevel(level, currentRoot.getRight());
        }
    }
}
