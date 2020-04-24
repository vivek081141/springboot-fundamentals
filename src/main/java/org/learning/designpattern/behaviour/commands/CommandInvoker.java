/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.commands;

import org.learning.designpattern.behaviour.commands.command.ICommand;

/**
 *  This is perfect exacmple of decoupling
 *  The invoker does not know anything about the implementation
 */
public class CommandInvoker {

    private ICommand command;

    public CommandInvoker(ICommand command){
        this.command = command;
    }

    public void buttonClicked(){
        command.execute();
    }
}
