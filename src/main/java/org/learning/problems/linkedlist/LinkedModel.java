package org.learning.problems.linkedlist;

public class LinkedModel {

  private LinkedModel linkedModel;
  private int data;

  public LinkedModel( int data, LinkedModel linkedModel) {
    this.linkedModel = linkedModel;
    this.data = data;
  }

  public LinkedModel() {
    super();
  }

  public LinkedModel getLinkedModel() {
    return linkedModel;
  }

  public void setLinkedModel(LinkedModel linkedModel) {
    this.linkedModel = linkedModel;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }
}
