package org.learning.problems.linkedlist;

import org.junit.jupiter.api.Test;

public class SingleLinkedListTest {

  @Test
  public void transversal() {
    SingleLinkedList linkedList = new SingleLinkedList();
    LinkedModel model = new LinkedModel();
    model.setData(1);
    model.setLinkedModel(new LinkedModel(2, new LinkedModel(3, null)));
    linkedList.transversal(model);
  }

  @Test
  public void insert() {
    SingleLinkedList linkedList = new SingleLinkedList();
    LinkedModel model = new LinkedModel();
    model.setData(1);
    model.setLinkedModel(new LinkedModel(2, new LinkedModel(3, null)));
    linkedList.insert(model, 100);
    linkedList.transversal(model);
  }
}