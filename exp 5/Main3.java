class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void walk() {
        System.out.println(name + " is walking.");
    }
}

class Student extends Person {

    Student(String name, int age) {
        super(name, age);
    }
}

interface Sport {
    void play();
}

class SportStudent extends Student implements Sport {

    SportStudent(String name, int age) {
        super(name, age);
    }

    public void play() {
        System.out.println(name + " is playing sports.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        SportStudent s = new SportStudent("Rahul", 20);

        s.display();
        s.walk();
        s.play();
    }
}
