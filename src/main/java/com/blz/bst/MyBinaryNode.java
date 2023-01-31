package com.blz.bst;

public class MyBinaryNode<T extends Comparable<T>> implements INode<T> {
    T key;
    MyBinaryNode<T> left, right;

    public MyBinaryNode(T key) {
        this.key = key;
        left = right = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    public void add(T value) {
        if (value.compareTo(key) < 0) {
            if (left != null) {
                left.add(value);
            } else {
                left = new MyBinaryNode<T>(value);
            }
        } else {
            if (right != null) {
                right.add(value);
            } else {
                right = new MyBinaryNode<T>(value);
            }
        }
    }

    public static void main(String[] args) {
        MyBinaryNode<Integer> root = new MyBinaryNode<Integer>(56);
        MyBinaryNode<Integer> root1 = new MyBinaryNode<Integer>(30);
        MyBinaryNode<Integer> root2 = new MyBinaryNode<Integer>(70);
    }


}

