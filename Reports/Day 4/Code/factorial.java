import java.io.*;
import java.util.Scanner;
import java.util.*;
public class factorial {
    static int find(int n){
        int i,sum=1;
        for(i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial of ");
        int m = sc.nextInt();
        int fact = find(m);
        System.out.println("The factorial of the given number "+m+" is "+fact);
    }
}
