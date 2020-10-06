package cse360assignment02;
/**
 * AddingMachine is the entity used to add or subtract int values to the variable total
 *
 * @author lsears1
 *
 */
 
public class AddingMachine {
	/**
	 * the total value of all operations
	 */
	  private int total;
	  
	  /**
	   * creates an instance of an AddingMachine
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  /**
	   * Method is a standard get method to return the private variable total
	   * @return the current value of total
	   */
	  public int getTotal () {
	    return 0;
	  }
	  
	  /**
	   * Method will add the given value to total
	   * @param value adds this value to total
	   */
	  public void add (int value) {
	  }
	 /**
	  * Method will subtract the given value from the total
	  * @param value subtracts this value from the total
	  */
	  public void subtract (int value) {
	  }
	  
	  /**
	   * current implementation returns an empty string
	   * @return an empty string
	   */
	  public String toString () {
	    return "";
	  }
	  
	  /**
	   * current implementation is undeveloped, future development will set total to 0
	   */
	  public void clear() {
	  }
	}