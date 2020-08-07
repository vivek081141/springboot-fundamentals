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

public class OthersMatchHandler implements MatchHandler {

  private MatchHandler nextMatchHandler;

  public OthersMatchHandler(MatchHandler nextMatchHandler) {
    this.nextMatchHandler = nextMatchHandler;
  }

  @Override
  public void match(MatchConstants matchConstants) {
    if (MatchConstants.NORMAL == matchConstants) {
      System.out.println("Others match");
    } else {
      this.nextMatchHandler.match(matchConstants);
    }
  }
}
