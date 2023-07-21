import java.util.Scanner;
import java.util.*;
import java.io.*;

public class secondworduppercase {
    public static String find(String s){
        String[] s1=s.split(" ");
        int j = s1.length;
        if(j==1) {
            return "invalid";
        }
        String s2=s1[1];
        s2=s2.toUpperCase();
        return s2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();
        String ans = find(s);
        if (ans == "invalid"){
            System.out.println("Two words required to perform the operation");
        }
        else{
            System.out.println(ans);
        }
    }

}
