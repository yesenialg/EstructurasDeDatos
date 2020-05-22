/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_final;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class BinarySearchTree {

    int x = 510;
    int y = 40;

    private BinaryNode root;
    private BinaryNode father;
    private boolean position;
    private int nodes;
    private int leaves;
    private int altura;
    String linea = "";
    ArrayList numeros = new ArrayList();

    public BinaryNode getRoot() {
        return root;
    }

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int data) {
        root = new BinaryNode(data);
        nodes++;
    }

    public void Add(int data, JLabel labelTex, JOptionPane messegeError, TrabajoFinal t) {
        if (root == null) {
            root = new BinaryNode(data);
            root.setLevel(LastLevel());
            nodes++;
        } else {
            if (Search(data) != null) {
                System.out.println("Dato repetido, no se puede insertar");
                labelTex.setText("Dato repetido, no se puede insertar");
                JOptionPane.showMessageDialog(t, "Dato repetido, no se puede insertar", "Error!", JOptionPane.OK_CANCEL_OPTION);
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

    public void AllDelete() {
        deleteAll();
        root = null;
        nodes = 0;
        leaves = 0;
    }

    private void deleteAll() {
        if (root.getLeft() != null) {
            Delete(root.getLeft().getData());
            deleteAll();
        }
        if (root.getRight() != null) {
            Delete(root.getRight().getData());
            deleteAll();
        }
    }

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
    
    public BinaryNode getMinor(BinaryNode currentRoot) {
        if (currentRoot.getLeft() == null) {
            return currentRoot;
        } else {
            return getMinor(currentRoot.getLeft());
        }
    }

    public void graficar(Graphics p) {
        if (root != null) {
            p.drawOval(x, y, 30, 30);
            p.drawString(String.valueOf(root.getData()), x + 10, y + 20);
            graficar(root, p, 0, x, y);
        }
    }

    private void graficar(BinaryNode currentRoot, Graphics p, int orientacion, int x, int y) {
        if (currentRoot != null) {
            System.out.print(currentRoot.getData() + " " + currentRoot.getLevel() + " - ");
            int a = 0;
            if (currentRoot.getLevel() == 0) {
                a = 40;
            } else if (currentRoot.getLevel() == 1) {
                a = 120;
            } else if (currentRoot.getLevel() == 2) {
                a = 80;
            } else if (currentRoot.getLevel() == 3) {
                a = 50;
            } else {
                a = 40;
            }
            int b = 0;
            if (currentRoot.getLevel() == 1) {
                b = 120;
            } else if (currentRoot.getLevel() == 2) {
                b = 80;
            } else if (currentRoot.getLevel() == 3) {
                b = 50;
            } else {
                b = 40;
            }
            if (orientacion == 1) {
                p.drawOval(x -= a, y += 50, 30, 30);
                p.drawString(String.valueOf(currentRoot.getData()), x + 10, y + 20);
                p.drawLine(x + 30, y + 10, x + b, y - 40);
            } else if (orientacion == 2) {
                p.drawOval(x += a, y += 50, 30, 30);
                p.drawString(String.valueOf(currentRoot.getData()), x + 10, y + 20);
                p.drawLine(x, y + 10, x - (b - 30), y - 40);
            }
            graficar(currentRoot.getLeft(), p, 1, x, y);
            graficar(currentRoot.getRight(), p, 2, x, y);
        }
    }
}
