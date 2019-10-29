
package com;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.6
 * 2019-07-30T15:34:59.867+05:30
 * Generated source version: 3.2.6
 */

@WebFault(name = "Exception", targetNamespace = "http://com/")
public class Exception_Exception extends java.lang.Exception {

    private com.Exception exception;

    public Exception_Exception() {
        super();
    }

    public Exception_Exception(String message) {
        super(message);
    }

    public Exception_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, com.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, com.Exception exception, java.lang.Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public com.Exception getFaultInfo() {
        return this.exception;
    }
}