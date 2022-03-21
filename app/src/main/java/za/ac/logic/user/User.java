package za.ac.logic.user;

public class User {

    private String name;
    private int studentNumber;
    private int age;
    private String contact;

    public User() {

    }
    public User(String name, int studentNumber, int age, String contact) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.age = age;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


}
