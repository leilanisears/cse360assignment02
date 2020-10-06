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
	   * the current history of all operations made by the AddingMachine
	   */
	  private String history;
	  
	  /**
	   * creates an instance of an AddingMachine
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = 0 + " ";
	  }
	  
	  /**
	   * Method is a standard get method to return the private variable total
	   * @return the current value of total
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * Method will add the given value to total and updates the history
	   * @param value adds this value to total
	   */
	  public void add (int value) {
		  total = total + value;
		  history = history + " " + "+" + " " + value + " ";
	  }
	 /**
	  * Method will subtract the given value from the total and updates the history
	  * @param value subtracts this value from the total
	  */
	  public void subtract (int value) {
		  total = total - value;
		  history = history + " " + "-" + " " + value + " ";
	  }
	  
	  /**
	   * re
	   * @return a string of all operations made
	   */
	  public String toString () {
	    return history;
	  }
	  
	  /**
	   * will set history to a blank string and the total to 0
	   */
	  public void clear() {
		  history = "";
		  total = 0;
	  }
	}