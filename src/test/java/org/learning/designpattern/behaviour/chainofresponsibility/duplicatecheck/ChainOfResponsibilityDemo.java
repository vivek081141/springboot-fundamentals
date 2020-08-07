/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.chainofresponsibility.duplicatecheck;

import org.junit.Test;

/**
 * Chain of responsibility pattern is used to achieve loose coupling in software design
 * where a request from the client is passed to a chain of objects to process them.
 * Later, the object in the chain will decide themselves who will be processing the request
 * and whether the request is required to be sent to the next object in the chain or not.
 */
public class ChainOfResponsibilityDemo {

  /**
   * The object creation can be moved to Chain as shown in
   * https://www.geeksforgeeks.org/chain-responsibility-design-pattern/
   */
  @Test
  public void duplicateCheck() {
    MatchHandler handler = new ExactEmailHandler(new DunsMatchHandler(new OthersMatchHandler(new NoMatchHandler(null))));
    handler.match(MatchConstants.EMAIL);
    handler.match(MatchConstants.DUNS);
    handler.match(MatchConstants.NORMAL);
    handler.match(MatchConstants.NO_MATCH);
  }

  @Test
  public void duplicateCheck_usingChain() {
    Chain chain = new Chain();
    chain.process(MatchConstants.EMAIL);
    chain.process(MatchConstants.DUNS);
    chain.process(MatchConstants.NORMAL);
    chain.process(MatchConstants.NO_MATCH);
  }
}