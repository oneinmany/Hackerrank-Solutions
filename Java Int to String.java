/*You are given an integer n, you have to convert it into a string.
Please complete the partially completed code in the editor. If your code successfully converts into a string the code will print “Good job”. Otherwise it will print “Wrong answer”.
Sample Input
100

Sample Output
Good job*/
import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {
try {
 Scanner in = new Scanner(System.in);
 int n = in .nextInt();
 in.close();
 String s=String.valueOf(n);
if (n == Integer.parseInt(s)) {
 System.out.println(“Good job”);
 } else {
 System.out.println(“Wrong answer.”);
 }
 } catch (DoNotTerminate.ExitTrappedException e) {
 System.out.println(“Unsuccessful Termination!!”);
 }
 }
}
