interface FY {
    void getFY();
}

interface SY {
    void getSY();
}

public class Student implements FY, SY {

    int fyRoll, syRoll;
    String fyName, syName, fyResult, syResult;

    Student(int fr, String fn, String fres,
            int sr, String sn, String sres) {

        fyRoll = fr;
        fyName = fn;
        fyResult = fres;

        syRoll = sr;
        syName = sn;
        syResult = sres;
    }

    public void getFY() {
        System.out.println("FY: " + fyRoll + " " + fyName + " " + fyResult);
    }

    public void getSY() {
        System.out.println("SY: " + syRoll + " " + syName + " " + syResult);
    }

    void display() {
        getFY();
        getSY();
    }

    public static void main(String[] args) {
        Student s = new Student(
            101, "Renish", "Pass",
            201, "Rahul", "Pass"
        );

        s.display();
    }
}
