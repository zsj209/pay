package com.pay.pe.exception.coa;

import com.pay.inf.exception.AppException;
import com.pay.pe.exception.ErrorLevel;

/**
 * Subclass of <code>AppException</code> generated by tool
 * g
 *
 */
public class MatchingAccountIsExistException extends AppException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2779178803658142970L;

	/**
     * Constructs an exception
     *
     */
    public MatchingAccountIsExistException() {
        super("30002", ErrorLevel.ERROR);
    }

    /**
     * Constructs an exception with root cause
     * @param cause The root cause
     */
    public MatchingAccountIsExistException(Throwable cause) {
		super("30002", cause, ErrorLevel.ERROR);
    }

}
