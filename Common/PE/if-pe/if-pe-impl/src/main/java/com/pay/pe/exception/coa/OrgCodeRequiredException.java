package com.pay.pe.exception.coa;

import com.pay.inf.exception.AppException;
import com.pay.pe.exception.ErrorLevel;

/**
 * Subclass of <code>AppException</code> generated by tool
 * g
 *
 */
public class OrgCodeRequiredException extends AppException {

    /**
     * 
     */
    private static final long serialVersionUID = 4140366677635937707L;

    /**
     * Constructs an exception
     *
     */
    public OrgCodeRequiredException() {
        super("30007", ErrorLevel.WARN);
    }

    /**
     * Constructs an exception with root cause
     * @param cause The root cause
     */
    public OrgCodeRequiredException(Throwable cause) {
		super("30007", cause, ErrorLevel.WARN);
    }

}
