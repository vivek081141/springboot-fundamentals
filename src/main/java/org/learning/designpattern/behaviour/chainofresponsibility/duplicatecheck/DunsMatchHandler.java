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

public class DunsMatchHandler implements MatchHandler {

  private MatchHandler nextMatchHandler;

  public DunsMatchHandler(MatchHandler nextMatchHandler) {
    this.nextMatchHandler = nextMatchHandler;
  }

  @Override
  public void match(MatchConstants matchConstants) {
    if (MatchConstants.DUNS == matchConstants) {
      System.out.println("DUNS match");
    } else {
      this.nextMatchHandler.match(matchConstants);
    }


  }
}
