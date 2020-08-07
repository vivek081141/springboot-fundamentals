/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.app.dto;

import java.util.List;
import javax.validation.constraints.NotNull;

public class PatchingRequest {

  @NotNull(message = "This is error message")
  private String serviceName;
  private List<String> serverName;
  private String password;
  private String fileName;
  private String path;
  private String downloadPath;

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public List<String> getServerName() {
    return serverName;
  }

  public void setServerName(List<String> serverName) {
    this.serverName = serverName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getDownloadPath() {
    return downloadPath;
  }

  public void setDownloadPath(String downloadPath) {
    this.downloadPath = downloadPath;
  }
}
