package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Searching1 {
    public static void main(String[] args) {
        List<User> al=new ArrayList<>();
        User u=new User("abc","123");
        al.add(u);
        u=new User("Chaitanya","4546");
        al.add(u);
        u=new User("Dharmendra","5465");
        al.add(u);
        System.out.println(al);
        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        boolean flag=false;
        for(int i=0;i<al.size();i++){
            if(username.equals(al.get(i).getUsername())){
                System.out.println("Username Found");
                flag=true;
                break;
            }
        }
       if(flag==false)
            System.out.println("Username not found");



       List<String> list=new ArrayList<>();
       List<Object[]> rows=null;
        for(int i=0;i<rows.size();i++){
            list.add(rows.get(i)[0]!=null?(String)rows.get(i)[0]: "0");
        }

    }
}
