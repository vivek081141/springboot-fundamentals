/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.app.controller;

import org.learning.app.dto.PatchingRequest;
import org.learning.app.service.SSHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.ExecutionException;
import javax.validation.Valid;

@RestController
@RequestMapping("/Patching")
public class ServicePatchingController {

  @Autowired
  private SSHService sshService;

  @RequestMapping(value = "/download", method = RequestMethod.POST, produces = {MediaType.MULTIPART_RELATED_VALUE})
  public ResponseEntity download(@Valid @RequestBody PatchingRequest request) throws ExecutionException, InterruptedException {

    sshService.downloadFile(request);

    return ResponseEntity.status(HttpStatus.OK).build();
  }


  @RequestMapping(value = "/test", method = RequestMethod.POST, produces = {MediaType.MULTIPART_RELATED_VALUE})
  public ResponseEntity test(@Valid @RequestBody PatchingRequest request) throws ExecutionException, InterruptedException {

    sshService.downloadFile(request);

    return ResponseEntity.status(HttpStatus.OK).build();
  }
}
