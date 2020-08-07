/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.structural.adapter;

public class Adapter implements IAdapter {
  private Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void newRequest() {
    adaptee.request();
  }
}
