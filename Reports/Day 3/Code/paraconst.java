import java.util.Scanner;
import java.io.*;
import java.util.*;
public class paraconst {
    String name;
    int rno;
    paraconst(String str,int n){
        name=str;
        rno = n;
    }
    public static void main(String args[]){
        System.out.println("Enter name");
        Scanner S1 = new Scanner(System.in);
        String str = S1.nextLine();
        System.out.println("Enter roll.no");
        Scanner S2 = new Scanner(System.in);
        int n  = S2.nextInt();
        paraconst p = new paraconst(str,n);
        System.out.println("Name " +p.name);
        System.out.println("Roll No " +p.rno);
    }

}

