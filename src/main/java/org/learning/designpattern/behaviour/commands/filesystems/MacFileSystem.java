/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.commands.filesystems;

public class MacFileSystem extends AbstractFileSystem {
  @Override
  public void openFile() {
    System.out.println("MAC:Opening File");
  }

  @Override
  public void readFile() {
    System.out.println("MAC:Reading File");
  }

  @Override
  public void closeFile() {
    System.out.println("MAC:Closing File");
  }
}
