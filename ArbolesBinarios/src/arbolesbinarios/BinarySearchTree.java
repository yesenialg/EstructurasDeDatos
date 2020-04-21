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

    //Punto 1
    public void InOrden() {
        InOrden(root);
    }

    private void InOrden(BinaryNode currentRoot) {
        if (currentRoot != null) {
            InOrden(currentRoot.getLeft());
            System.out.print(currentRoot.getData() + " ");
            InOrden(currentRoot.getRight());
        }
    }

    //Punto 2
    public void Postorden() {
        PostOrden(root);
    }

    private void PostOrden(BinaryNode currentRoot) {
        if (currentRoot != null) {
            PostOrden(currentRoot.getLeft());
            PostOrden(currentRoot.getRight());
            System.out.print(currentRoot.getData() + " ");
        }
    }

    //Punto 3
    public void PreOrden() {
        PreOrden(root);
    }

    private void PreOrden(BinaryNode currentRoot) {
        if (currentRoot != null) {
            System.out.print(currentRoot.getData() + " ");
            PreOrden(currentRoot.getLeft());
            PreOrden(currentRoot.getRight());
        }
    }

    //Punto 4
    public int CountNodes() {
        return nodes;
    }

    //Punto 5
    public int CountLeafs() {
        LeafNodes(root);
        return leaves;
    }

    private void LeafNodes(BinaryNode currentRoot) {
        if (currentRoot != null) {
            if (currentRoot.getLeft() == null && currentRoot.getRight() == null) {
                leaves++;
            }
            LeafNodes(currentRoot.getLeft());
            LeafNodes(currentRoot.getRight());
        }
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

    //Punto 6
    public void Delete(int data) {
        if (root == null) {
            System.out.print("Árbol vacío");
        } else {
            Delete(data, root);
        }
    }

    private void Delete(int data, BinaryNode currentRoot) {

        BinaryNode v = Search(data);
        if (v != null) {
            if (v == this.root && v.getLeft() == null && v.getRight() == null) {
                this.root = null;
                return;
            }
            if (v.isLeaf()) {
                if (position) {
                    father.setRight(null);
                } else {
                    father.setLeft(null);
                }
            } else if (v.hasOneChild()) {
                if (v.isChildPosition()) {
                    if (root == v) {
                        BinaryNode minimum = getMinor(v.getRight());
                        Delete(minimum.getData());
                        v.setData(minimum.getData());
                        minimum.setLevel(v.getLevel());
                    } else if (position) {
                        this.father.setRight(v.getRight());
                    } else {
                        this.father.setLeft(v.getLeft());
                    }
                    levelDown(v);
                    v.setRight(null);
                } else {
                    if (root == v) {
                        BinaryNode minimum = getMinor(v.getRight());
                        Delete(minimum.getData());
                        v.setData(minimum.getData());
                        minimum.setLevel(v.getLevel());
                    } else if (position) {
                        this.father.setRight(v.getRight());
                    } else {
                        this.father.setLeft(v.getLeft());
                    }
                    levelDown(v);
                    v.setRight(null);
                }
            } else {
                BinaryNode minimum = getMinor(v.getRight());
                Delete(minimum.getData());
                v.setData(minimum.getData());
                minimum.setLevel(v.getLevel());
            }
            nodes--;
        } else {
        }
    }

    private void levelDown(BinaryNode currentRoot) {
        if (currentRoot != null) {
            currentRoot.setLevel(currentRoot.getLevel() - 1);
            levelDown(currentRoot.getLeft());
            levelDown(currentRoot.getRight());
        }
    }

    //Punto 7
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

    //Punto 8
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

    public BinaryNode getMinor(BinaryNode currentRoot) {
        if (currentRoot.getLeft() == null) {
            return currentRoot;
        } else {
            return getMinor(currentRoot.getLeft());
        }
    }
}
