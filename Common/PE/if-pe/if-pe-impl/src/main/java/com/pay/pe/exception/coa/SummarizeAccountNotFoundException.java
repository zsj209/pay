package com.pay.pe.exception.coa;

import com.pay.inf.exception.AppException;
import com.pay.pe.exception.ErrorLevel;

/**
 * Subclass of <code>AppException</code> generated by tool
 * g
 *
 */
public class SummarizeAccountNotFoundException extends AppException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1587955545090247076L;

	/**
     * Constructs an exception
     *
     */
    public SummarizeAccountNotFoundException() {
        super("30004", ErrorLevel.WARN);
    }

    /**
     * Constructs an exception with root cause
     * @param cause The root cause
     */
    public SummarizeAccountNotFoundException(Throwable cause) {
		super("30004", cause, ErrorLevel.WARN);
    }

}