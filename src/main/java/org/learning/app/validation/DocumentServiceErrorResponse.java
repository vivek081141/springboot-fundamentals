/*
    Copyright (c) 2016 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: rohit.raj.thirumurthy
*/
package org.learning.app.validation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentServiceErrorResponse implements Serializable {

    @NotNull
    List<String> errors;

    public DocumentServiceErrorResponse() {
        this.errors = new ArrayList<>();
    }

    public DocumentServiceErrorResponse(String error) {
        this.errors = Collections.singletonList(error);
    }

    public DocumentServiceErrorResponse(String... errors) {
        this.errors = Arrays.asList(errors);
    }

    public DocumentServiceErrorResponse(List<String> errors) {
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public void addErrorMessage(String error) {
        this.errors.add(error);
    }
}
