/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.commands.command;

import org.learning.designpattern.behaviour.commands.filesystems.FileSystem;

public class CloseCommand implements ICommand {
    FileSystem fileSystem;

    public CloseCommand(FileSystem fileSystem){
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.closeFile();
    }
}
