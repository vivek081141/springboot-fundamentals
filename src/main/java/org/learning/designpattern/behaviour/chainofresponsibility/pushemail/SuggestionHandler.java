/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.chainofresponsibility.pushemail;

public class SuggestionHandler implements IEmailHandler {


  private IEmailHandler nextEmailHandler;

  @Override
  public void setSuccessor(IEmailHandler emailHandler) {
    this.nextEmailHandler = emailHandler;
  }

  @Override
  public void handleRequest(EmailType emailType) {
    if (EmailType.SUGGESTION == emailType) {
      System.out.println("Suggestion mail has forwarded to the CEO");
      return;
    }
    this.nextEmailHandler.handleRequest(emailType);
  }
}
