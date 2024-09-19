import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(A.equals(reverse(A))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
    }
    public static String reverse(String A){
        StringBuilder re = new StringBuilder(A);
        return re.reverse().toString();
    }
}



