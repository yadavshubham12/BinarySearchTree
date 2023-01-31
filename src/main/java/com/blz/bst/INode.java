package com.blz.bst;

class INode<T extends Comparable<T>> {
    T key;
    INode<T> left, right;

    INode(T key) {
        this.key = key;
        left = right = null;
    }
}

class BinaryTree<T extends Comparable<T>> {
    INode<T> root;
    int size;

    BinaryTree() {
        root = null;
        size = 0;
    }

    void insert(T key) {
        root = insertRecursive(root, key);
        size++;
    }

    INode<T> insertRecursive(INode<T> current, T key) {
        if (current == null) {
            return new INode<T>(key);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = insertRecursive(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = insertRecursive(current.right, key);
        } else {
            return current;
        }

        return current;
    }

    int size() {
        return size;
    }
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insert(56);
        bt.insert(30);
        bt.insert(70);
        bt.insert(22);
        bt.insert(40);
        bt.insert(60);
        bt.insert(95);
        bt.insert(65);
        bt.insert(63);
        bt.insert(67);
        bt.insert(11);
        bt.insert(3);
        bt.insert(16);
        System.out.println("Tree size: " + bt.size());
    }
}

