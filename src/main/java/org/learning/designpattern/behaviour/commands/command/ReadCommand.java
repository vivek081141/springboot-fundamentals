/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.commands.command;

import org.learning.designpattern.behaviour.commands.filesystems.FileSystem;

public class ReadCommand implements ICommand {

    private FileSystem fileSystem;

    public ReadCommand(FileSystem fileSystem){
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.readFile();
    }
}
