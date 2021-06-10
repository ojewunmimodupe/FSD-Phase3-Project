package in.co.air.line.ticket.exception;

/**
 * DuplicateRecordException thrown when a duplicate record occurred
 * 
 * @author Unique Dupson
 * @version 1.0
 * @Copyright (c) Unique Dupson
 * 
 */
public class DuplicateRecordException  extends Exception
{
	/**
	 * @param msg
	 *            error message
	 */
	public DuplicateRecordException(String msg) {
		super(msg);
	}
}
