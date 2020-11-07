package org.learning.problems.tree;

public class BinaryTreeModel {

  private BinaryTreeModel left;
  private BinaryTreeModel right;
  private int data;

  public BinaryTreeModel getLeft() {
    return left;
  }

  public void setLeft(BinaryTreeModel left) {
    this.left = left;
  }

  public BinaryTreeModel getRight() {
    return right;
  }

  public void setRight(BinaryTreeModel right) {
    this.right = right;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }
}
