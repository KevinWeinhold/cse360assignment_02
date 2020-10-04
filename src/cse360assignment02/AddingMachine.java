/**
 * The Adding Machine class adds, subtracts, and gets the total of different
 * integer values and prints them to screen
 *
 * @author  Kevin Weinhold
 * @version 1.0
 * @since   2020-10-4
 */



package cse360assignment02;
import java.util.ArrayList; // import the ArrayList class



public class AddingMachine {
    private int total;

    ArrayList<String> memory = new ArrayList<>(); // Create an ArrayList object

    public AddingMachine () {
        /**
         * This method is the core method that  will utilize the other functions
         * written in the class and will be where we add, subtract, get total, and
         * print to String.
         */
        memory.add("0 ");
        total = 0;  // not needed - included for clarity

    }

    public int getTotal () {
        /**
         * This method is used to get the total number calculated in the class
         */


        return total;
    }

    public void add (int value) {
        /**
         * This method is used to add two integers.
         * @param value This is the first paramter to add method
         */

        memory.add("+ ");
        memory.add(Integer.toString(value) + " ");
        total = total + value;


    }

    public void subtract (int value) {
        /**
         * This method is used to subtract two integers.
         * @param value This is the first paramter to subtract method
         */

        memory.add("- ");
        memory.add(Integer.toString(value) + " ");
        total = total - value;

    }

    public String toString () {
        /**
         * This method prints values to a string
         */
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < memory.size(); i++) {
            output.append(memory.get(i));
        }
        return output.toString();
    }

    public void clear() {
        /**
         * This method clears the interface for the user
         */
        memory.clear();
        memory.add("0 ");
    }
}