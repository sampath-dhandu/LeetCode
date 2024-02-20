package com.sampath;

public class Tree {

    private Node root;

    public void inset(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.lefChild == null) {
                    current.lefChild = node;
                    break;
                }
                current = current.lefChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value) {
                current = current.lefChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else
                return true;
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.lefChild);
        traversePreOrder(root.rightChild);

    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;
        traversePreOrder(root.lefChild);
        System.out.println(root.value);
        traversePreOrder(root.rightChild);

    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;
        traversePreOrder(root.lefChild);
        traversePreOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int treeHight() {
        return treeHight(root);

    }

    private int treeHight(Node root) {
        if (root == null)
            return -1;
        if (root.lefChild == null && root.rightChild == null)
            return 0;
        return 1 + Math.max(
                treeHight(root.lefChild),
                treeHight(root.rightChild));
    }

    public int min() {
        return min(root);
    }

    //O(log n)
    public int Binarymin() {
        if (root == null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.lefChild;
        }
        return last.value;
    }

    //O(n);
    private int min(Node root) {
        if (root == null)
            return -1;
        if (isLeaf(root))
            return root.value;
        var left = min(root.lefChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    public boolean equals(Tree tree) {
        if (tree == null)
                throw  new IllegalStateException();
            return eqauls2Trees(root, tree.root);

    }

    private boolean eqauls2Trees(Node first, Node second) {
        if (first == null && second == null)
            return true;
        if (first != null && second != null)
            return first.value == second.value
                    && eqauls2Trees(first.lefChild, second.lefChild)
                    && eqauls2Trees(second.rightChild, second.rightChild);

        return false;
    }

    private boolean isLeaf(Node node) {
        return node.lefChild == null && node.rightChild == null;
    }

    public Node invertTree(Node root){
        if(root== null)
            return null;
        var right = invertTree(root.rightChild);
        var left = invertTree(root.lefChild);
        root.lefChild = right;
        root.rightChild = left;
        return root;
    }

    private class Node {
        private int value;
        private Node lefChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;

        }
    }
}
