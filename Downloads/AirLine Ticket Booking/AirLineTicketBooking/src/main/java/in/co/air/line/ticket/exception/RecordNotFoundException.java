package in.co.air.line.ticket.exception;

/**
 * RecordNotFoundException thrown when a record not found occurred
 * 
 * @author Unique Dupson
 * @version 1.0
 * @Copyright (c) Unique Dupson
 * 
 */

public class RecordNotFoundException extends Exception
{

	/**
	 * @param msg
	 *            error message
	 */
	public RecordNotFoundException(String msg) {
		super(msg);

	}
}
