import java.io.*;
import java.util.*;
public class isPalindromeString
{
    public static int find(String input1){
        input1=input1.toLowerCase();
        int i;
        int l = input1.length();
        for(i=0;i<l/2;i++) {
            if (input1.charAt(i) != input1.charAt(l - i - 1)) {
                return 1;
            }
        }
        return 2;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();
        int ans = find(s);
        if (ans ==1){
            System.out.println("NOt a Palindrome");
        }
        else{
            System.out.println("It is a palindrome");
        }
    }
}

