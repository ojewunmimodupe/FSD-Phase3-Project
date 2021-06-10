package in.co.air.line.ticket.exception;

/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 * 
 * @author Unique Dupson
 * @version 1.0
 * @Copyright (c) Unique Dupson
 * 
 */

public class ApplicationException  extends Exception
{
	/**
	 * @param msg
	 *            : Error message
	 */
	public ApplicationException(String msg) {
		super(msg);
	}
}
