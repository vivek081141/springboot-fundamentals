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

package org.learning.designpattern.behaviour.chainofresponsibility.duplicateCheck;

public class ExactEmailHandler implements MatchHandler {
    private MatchHandler nextMatchHandler;

    public  ExactEmailHandler(MatchHandler nextMatchHandler){
        this.nextMatchHandler = nextMatchHandler;
    }



    @Override
    public void match(MatchConstants matchConstants){
        if(MatchConstants.EMAIL == matchConstants){
            System.out.println("Email match");
        }else{
            this.nextMatchHandler.match(matchConstants);
        }


    }
}
