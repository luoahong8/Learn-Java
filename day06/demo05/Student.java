package day06.demo05;



public class Student {
    private String name;
    private int age;

    //Code-Generate-Constructor 什么都不选择
    public Student() {

    }
    //Code-Generate-Constructor 全选
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Code-Generate-Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
