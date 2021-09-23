import java.util.Stack;
import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {

    	System.out.println("Type a string");
        Scanner scan =new Scanner(System.in);
        String input = scan.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < input.length(); i++) {
            
        	stack.push(input.charAt(i));
        }

        String backwards = "";

        while (!stack.isEmpty()) {
            backwards = backwards + stack.pop();
        }

        if (input.equals(backwards))
            System.out.println("Nice! It's a palindrome.");
        else
            System.out.println("Uh oh, it's NOT a palindrome.");

    }
}