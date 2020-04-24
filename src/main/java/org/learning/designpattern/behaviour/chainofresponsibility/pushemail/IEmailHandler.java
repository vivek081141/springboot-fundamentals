/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.chainofresponsibility.pushemail;

public interface IEmailHandler {
    void setSuccessor(IEmailHandler emailHandler);

    void handleRequest(EmailType emailType);
}
