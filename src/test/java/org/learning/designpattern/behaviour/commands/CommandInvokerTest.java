/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.commands;


import org.junit.Test;
import org.learning.designpattern.behaviour.commands.command.CloseCommand;
import org.learning.designpattern.behaviour.commands.command.ICommand;
import org.learning.designpattern.behaviour.commands.command.OpenCommand;
import org.learning.designpattern.behaviour.commands.command.ReadCommand;
import org.learning.designpattern.behaviour.commands.filesystems.FileSystem;
import org.learning.designpattern.behaviour.commands.filesystems.FileSystemFactory;

/**
 * Invoker -> CommandInvoker
 * Receiver -> FileSystem
 * Command
 *
 * In command pattern, the request is send to the invoker and invoker pass it to the encapsulated command object.
 * Command object passes the request to the appropriate method of Receiver to perform the specific action.
 * The client program create the receiver object and then attach it to the Command.
 * Then it creates the invoker object and attach the command object to perform an action.
 *
 *
 * 1. Receiver implementation is separate from command implementation.
 *
 * 2. Client is responsible to instantiate appropriate command and receiver
 * implementation and then associate them together.
 *
 * 3. Invoker class just forward the request from client to the command object
 *
 *
 */
public class CommandInvokerTest {

    @Test
    public void buttonClicked() {
        //Receiver
        FileSystem fs = FileSystemFactory.getInstance("MAC");

        //creating command and associating with receiver
        ICommand openFileCommand = new OpenCommand(fs);
        //Creating invoker and associating with Command
        CommandInvoker file = new CommandInvoker(openFileCommand);
        //perform action on invoker object
        file.buttonClicked();

        ICommand readCommand = new ReadCommand(fs);
        file = new CommandInvoker(readCommand);
        file.buttonClicked();

        ICommand closeFileCommand = new CloseCommand(fs);
        file = new CommandInvoker(closeFileCommand);
        file.buttonClicked();
    }
}