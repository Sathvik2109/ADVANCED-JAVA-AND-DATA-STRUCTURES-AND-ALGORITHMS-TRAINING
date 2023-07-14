import java.io.*;
import java.util.Scanner;
import java.util.*;

public class isPrime {
    static int find(int n){
        int i;
        for(i=2;i<n;i++){
            if(n%i==0){
                return 1;
            }
        }
        return 2;
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check if it is a prime number or not");
        int m = sc.nextInt();
        int s = find(m);
        if (s==1){
            System.out.println("The number " +m+" is not a prime number");
        }
        else{
            System.out.println("The number " +m+ " is a prime number");
        }
    }
}

