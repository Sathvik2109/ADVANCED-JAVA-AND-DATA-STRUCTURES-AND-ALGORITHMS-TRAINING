import java.util.Scanner;
import java.io.*;
public class cal {
    int num;
    public cal(int n1,int n2){
        num=n1+n2;
    }
    public static void main(String args[]){
        int data = 10;
        System.out.println("enter number1:");
        Scanner n1= new Scanner(System.in);
        int m1=n1.nextInt();
        System.out.println("enter number2");
        Scanner n2= new Scanner(System.in);
        int m2 = n2.nextInt();
        cal obj = new cal(m1,m2);
        System.out.println(obj.num);
    }
}