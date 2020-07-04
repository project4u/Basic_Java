package T04072020;

public class Student {
    String firstname;
    String lastname;
    String userId;
    int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Student s=(Student)obj;
        if(this.userId.equals(s.userId))
            return true;
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getUserId()+ " "+ getFirstname()+" "+getLastname()+" "+getAge();
        //return super.toString();
    }
}
