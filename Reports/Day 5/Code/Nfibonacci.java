import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Nfibonacci{
    static void find(int n){
        int f0=0,f1=1;
        int f,i;
        if (n==1){
            System.out.println(f0);
        }
        else if (n==2){
            System.out.println(f0);
            System.out.println(f1);
        }
        else{
            System.out.println(f0);
            System.out.println(f1);
            for(i=2;i<n;i++){
                f=f0+f1;
                f0=f1;
                f1=f;
                System.out.println(f);
            }
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int m = sc.nextInt();
        find(m);
    }

}
