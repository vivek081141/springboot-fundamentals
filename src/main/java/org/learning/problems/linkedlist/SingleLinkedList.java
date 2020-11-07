package org.learning.problems.linkedlist;

public class SingleLinkedList {

  /**
   * Transversal for single linked list
   */
  public void transversal(LinkedModel model) {
    if (model == null) {
      return;
    }

    System.out.println(model.getData());
    transversal(model.getLinkedModel());

  }

  /**
   * inserting element in last node
   * @param model
   */
  public void insert(LinkedModel model, Integer x) {
    LinkedModel originalModel = model;
    while(model !=null) {
      if(model.getLinkedModel() == null) {
        model.setLinkedModel(new LinkedModel(x, null));
        break;
      }
      model = model.getLinkedModel();
    }

    model = originalModel;
  }
}
