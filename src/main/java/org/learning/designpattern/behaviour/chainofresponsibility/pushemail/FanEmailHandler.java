/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.chainofresponsibility.pushemail;

public class FanEmailHandler implements IEmailHandler {

  private IEmailHandler nextEmailHandler;

  @Override
  public void setSuccessor(IEmailHandler emailHandler) {
    this.nextEmailHandler = emailHandler;
  }

  @Override
  public void handleRequest(EmailType emailType) {
    if (EmailType.FAN == emailType) {
      System.out.println("Mail has been forwarded to the PR departments");
      return;
    }
    this.nextEmailHandler.handleRequest(emailType);
  }
}
