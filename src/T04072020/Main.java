package T04072020;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setAge(10);
        s1.setFirstname("F1");
        s1.setLastname("L1");
        s1.setUserId("12345");
        Student s2=new Student();
        s2.setUserId("12345");
        s2.setFirstname("F2");
        s2.setLastname("L2");
        s2.setAge(12);
        boolean state=s1.equals(s2);
        // here equality check on Student, so equals will check the equal method in Student class
        // to check on what basis two Object are equal. in this project we are considering two objects equal if their
        // userId is same. you can check equality of two object based on userid along with student firstname and lastname.
        System.out.println("two Objects are :" +state);
        System.out.println(s1);
        System.out.println(s2.toString());
        // This code is for understanding of equals and toString method overidden in Student class.
    }

}
