import java.io.*;
import java.util.Scanner;
import java.util.*;
public class defaultconst {
    String name;
    int rno;
    defaultconst(){
        name="ABC";
        rno = 123;
    }
    public static void main(String arg[]){
        defaultconst d = new defaultconst();
        System.out.println("Name " +d.name);
        System.out.println("Roll No " +d.rno);
    }

}
