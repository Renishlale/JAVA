```java
class Student
{
    String name;
    int roll_no;
    String dept;

    Student(String n, int r, String d)
    {
        name = n;
        roll_no = r;
        dept = d;
    }

    void display()
    {
        System.out.println("Name=" + name);
        System.out.println("Roll No=" + roll_no);
        System.out.println("Department=" + dept);
    }
}

public class main3
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Rahul", 1, "CSE");
        Student s2 = new Student("Amit", 2, "CSE");
        Student s3 = new Student("Neha", 3, "IT");

        System.out.println("Student 1:");
        s1.display();

        System.out.println();

        System.out.println("Student 2:");
        s2.display();

        System.out.println();

        System.out.println("Student 3:");
        s3.display();
    }
}
```
