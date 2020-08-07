/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.chainofresponsibility.duplicatecheck;

public class Chain {
  private MatchHandler matchHandler;

  public Chain() {
    initializeChainOfResponsibility();
  }

  private void initializeChainOfResponsibility() {
    matchHandler = new ExactEmailHandler(new DunsMatchHandler(new OthersMatchHandler(new NoMatchHandler(null))));
  }

  public void process(MatchConstants matchConstants) {
    matchHandler.match(matchConstants);
  }
}
