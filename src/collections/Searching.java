package collections;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int arr[]={1,5,3,6,8,2,1};
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == element) {
                System.out.print(i + " ");
                break;
            }
        }

    }
}
