/*
This is a problem found on Hackerrank.com. Solved by Teena Xiong 
We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows: 
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. 
For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically
smallest and largest substrings of length .

Input Format
The first line contains a string denoting . 
The second line contains an integer denoting .

Output Format
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
 */
package substringcomparison;

import java.util.Scanner;

/**
 *
 * @author teena
 */
public class SubStringComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        s = s.replace(" ", ""); //user will enter words; replaces "spaces" with no space
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        for (int x = 0; x <= (s.length() - k); x++) {
            String a = s.substring(x, k + x);
            if (smallest.compareTo(a) > 0) {
                smallest = a;
            }
            if (largest.compareTo(a) < 0) {
                largest = a;
            }

        }
        return "Smallest: " + smallest + "\n" + "Largest: " + largest;
    }

}
