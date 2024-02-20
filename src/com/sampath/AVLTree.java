package com.sampath;


public class AVLTree {

    private AVLTreeNode root;

    public void insert(int value) {
        root = insert(root, value);

    }

    private AVLTreeNode insert(AVLTreeNode root, int value) {
        if (root == null)
            return new AVLTreeNode(value);
        if (value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);
        root.hight = Math.max(hight(root.leftChild), hight(root.rightChild)) + 1;

        var balanceFactor = hight(root.leftChild) - hight(root.rightChild);
        if (balanceFactor > 0) {
            System.out.println(root.value + "is left heavy ");
        } else if (balanceFactor < -1) {
            System.out.println(root.value + "is right heavy ");

        }
        return root;
    }

    private int hight(AVLTreeNode node) {
        return (node == null) ? -1 : node.hight;

    }

    private boolean isLeftisHeavy(AVLTreeNode node) {
        return balanceFactor(node) > 1;

    }
    private boolean isRighisHeavy(AVLTreeNode node) {
        return balanceFactor(node) < - 1;

    }

    private int balanceFactor(AVLTreeNode node) {
        return (node ==null) ? 0 : hight(node.leftChild) - hight(node.rightChild);

    }
    private class AVLTreeNode {
        AVLTreeNode leftChild;
        AVLTreeNode rightChild;
        private int hight;
        private int value;

        public AVLTreeNode(int value) {
            this.value = value;
        }
    }
}
