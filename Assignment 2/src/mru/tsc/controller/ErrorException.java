/**
 * Exception class
 * 
 * @author Jackie Zheng Obayda Daoud March 10,2022
 *
 */
public class ErrorException extends Exception {
	/**
	 * This exception uses superclass extension
	 * 
	 * @param error Invalid input or minimum amount of players is invalid
	 */
	public ErrorException(String error) {
		// Tells what error actually happened
		super("There was an error:" + error);
	}
}