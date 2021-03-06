package com.pay.pe.exception.coa;

import com.pay.inf.exception.AppException;
import com.pay.pe.exception.ErrorLevel;

/**
 * Subclass of <code>AppException</code> generated by tool
 * g
 *
 */
public class OrgTypeMatchException extends AppException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5551615945137699925L;

	/**
     * Constructs an exception
     *
     */
    public OrgTypeMatchException() {
        super("30001", ErrorLevel.WARN);
    }

    /**
     * Constructs an exception with root cause
     * @param cause The root cause
     */
    public OrgTypeMatchException(Throwable cause) {
		super("30001", cause, ErrorLevel.WARN);
    }

}
