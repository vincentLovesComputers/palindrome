/*
*Program to determine if a word is a palindrome
*/

import acm.program.ConsoleProgram;

public class Palindrome extends ConsoleProgram {
    public void run() {
        if (isPalindrome("kayak")) {
            print("palindrome");
        }
        else
        {
            println("Not a palindrome");
        }
    }

    /*reverse string and return true/false if it's a string or  not*/
    private boolean isPalindrome(String input)
    {
        input = input.toLowerCase();
        for(int i=input.length() -1 ; i>=0; i--)
        {
            newStr += input.charAt(i);
        }
        if(input.equals(newStr))
        {
            return true;
        }
        return false;
    }

    /*instance variables*/
    String input = "Vincent";
    String newStr = "";
}
