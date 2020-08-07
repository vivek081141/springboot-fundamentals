/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.chainofresponsibility.duplicatecheck;

public class NoMatchHandler implements MatchHandler {
  private MatchHandler nextMatchHandler;

  public NoMatchHandler(MatchHandler nextMatchHandler) {
    this.nextMatchHandler = nextMatchHandler;
  }

  @Override
  public void match(MatchConstants matchConstants) {
    System.out.println("NO Match.");
  }
}
