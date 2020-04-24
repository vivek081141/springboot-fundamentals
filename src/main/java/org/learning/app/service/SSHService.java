/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.app.service;

import org.learning.app.dto.PatchingRequest;

public interface SSHService {
    void downloadFile(PatchingRequest request);
}
