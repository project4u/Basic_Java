package Main;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        System.out.println("MAIN MENU");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLCATION");
        System.out.println("4. DIVISION");
        Scanner sc=new Scanner(System.in);
        int option=0;
        try {
            option = Integer.parseInt(sc.next());
        }
        catch(Exception e){

        }
        //System.out.println("Value Entered is : "+option);
        int a,b;
        switch (option){
            case 1: System.out.println("Enter the first number");
                    a=sc.nextInt();
                    System.out.println("Enter the second number");
                    b=sc.nextInt();
                    System.out.println(" Addition of "+a+" and "+b+" is :"+(a+b));
                    break;
            case 2:System.out.println("Enter the first number");
                    a=sc.nextInt();
                    System.out.println("Enter the second number");
                    b=sc.nextInt();
                    System.out.println(" Subtraction of "+a+" and "+b+" is :"+(a-b));
                    break;
            case 3:System.out.println("Enter the first number");
                    a=sc.nextInt();
                    System.out.println("Enter the second number");
                    b=sc.nextInt();
                    System.out.println(" Multiplication of "+a+" and "+b+" is :"+(a*b));
                    break;
            case 4:System.out.println("Enter the first number");
                  a=sc.nextInt();
                  System.out.println("Enter the second number");
                  b=sc.nextInt();
                  System.out.println(" Division of "+a+" and "+b+" is :"+(a/b));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
