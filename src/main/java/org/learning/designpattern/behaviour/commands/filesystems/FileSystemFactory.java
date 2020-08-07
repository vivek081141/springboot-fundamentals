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

package org.learning.designpattern.behaviour.commands.filesystems;

public class FileSystemFactory {

  public static FileSystem getInstance(String type) {
    FileSystem fileSystem = null;
    switch (type) {
      case "WIN":
        fileSystem = new WindowsFileSystem();
        break;
      case "UNIX":
        fileSystem = new UnixFileSystem();
        break;
      default:
        fileSystem = new MacFileSystem();

    }
    return fileSystem;
  }
}
