package Main;

import java.util.Scanner;

public class Starter1 {
    public static void main(String[] args) {
        //greatest of 3 numbers.
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        int a=Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[1]);
        int c=Integer.parseInt(str[2]);
        //System.out.println(Math.max(Math.max(a,b),c));
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else
        if(b>=a && b>=c){
            System.out.println(b);
        }
        else
            System.out.println(c);
    }
}
