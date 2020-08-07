/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.structural.composite;

public class LeafComponent implements IMenuComponent {
  private String text;

  public LeafComponent(String text) {
    this.text = text;
  }

  @Override
  public String getHtml() {
    return "<li>" + text + "</li>";
  }
}
