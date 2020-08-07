/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.chainofresponsibility.pushemail;

public class ComplaintHandler implements IEmailHandler {

  private IEmailHandler nextEmailHandler;

  @Override
  public void setSuccessor(IEmailHandler emailHandler) {
    this.nextEmailHandler = emailHandler;
  }

  @Override
  public void handleRequest(EmailType emailType) {
    if (EmailType.COMPLAINT == emailType) {
      System.out.println("Complaint department is looking into it");
      return;
    }
    this.nextEmailHandler.handleRequest(emailType);
  }
}
