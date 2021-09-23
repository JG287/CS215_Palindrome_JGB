/** 
* A class that tests whether or not an input is a palindrome.
*/
import java.util.Stack;
import java.util.Scanner;
class Palindrome {

    public static void main(String[] args) {

    	/** 
    	 * scanner is created in order to read user input.
    	 */
    	System.out.println("Type a string");
        Scanner scan =new Scanner(System.in);
        String input = scan.nextLine();
        
        
        /** 
         * new stack object is created for future use.
         */
        Stack stack = new Stack();

        /** 
         * for loop that goes through each letter in the input and pushes each one
         * on top of the stack.
         */
        for (int n = 0; n < input.length(); n++) {
            
        	stack.push(input.charAt(n));
        }

        String backwards = "";

        /** 
         * while loop that pops elements out of the stack one by one 
         * until the stack is empty.
         */
        while (!stack.isEmpty()) {
            backwards = backwards + stack.pop();
        }

        /** 
         * If else statement that prints out a result depending on whether or not the 
         * user input is equal to the backwards variable.
         */
        if (input.equals(backwards))
            System.out.println("Nice! It's a palindrome.");
        else
            System.out.println("Uh oh, it's NOT a palindrome.");
       
    }
}