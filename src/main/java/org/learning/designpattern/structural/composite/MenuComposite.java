/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Composite has zero to many Component
 */
public class MenuComposite implements IMenuComponent {
  private String name;
  private String title;

  private List<IMenuComponent> arrayList = new ArrayList<>();

  public MenuComposite(String title) {
    this.title = title;
  }

  public void addList(IMenuComponent item) {
    arrayList.add(item);
  }

  @Override
  public String toString() {
    String s = "Menu{" + "name='" + name + '\'' + ", title='" + title + '\'' + '}';
    StringBuilder sb = new StringBuilder(s);

    Iterator<IMenuComponent> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      IMenuComponent menu = iterator.next();
      sb.append(menu.toString());
    }
    return sb.toString();
  }

  @Override
  public String getHtml() {
    StringBuilder sb = new StringBuilder();
    sb.append("<ul>");
    sb.append("<li>");
    sb.append(title);
    sb.append("</li>");
    Iterator<IMenuComponent> iterator = arrayList.iterator();

    if (iterator.hasNext()) {
      sb.append("<ul>");
    }

    while (iterator.hasNext()) {
      IMenuComponent menu = iterator.next();
      sb.append(menu.getHtml());

      if (!iterator.hasNext()) {
        sb.append("</ul>");
      }
    }
    sb.append("</ul>");

    return sb.toString();
  }
}
