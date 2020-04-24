/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.chainofresponsibility.pushemail;

import org.junit.Test;

public class EmailHandlerChainDemo {

    @Test
    public void handleEmail(){

        IEmailHandler suggestionHandler = new SuggestionHandler();
        IEmailHandler complaintHandler = new ComplaintHandler();
        IEmailHandler fanEmailHandler = new FanEmailHandler();

        suggestionHandler.setSuccessor(complaintHandler);
        complaintHandler.setSuccessor(fanEmailHandler);

        suggestionHandler.handleRequest(EmailType.COMPLAINT);
        suggestionHandler.handleRequest(EmailType.SUGGESTION);
        suggestionHandler.handleRequest(EmailType.FAN);


    }
}