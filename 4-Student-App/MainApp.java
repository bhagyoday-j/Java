import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//BASE ABSTRACT CLASS
abstract class Person {
    protected String name;
    protected int rollNo;

    Person() {
        this.name = "NA";
        this.rollNo = 0;
    }

    void inputStudent(BufferedReader br) throws IOException {
        System.out.print("Enter Student Name : ");
        this.name = br.readLine();

        System.out.print("Enter Student Roll No : ");
        this.rollNo = Integer.parseInt(br.readLine());
    }

    // Overloaded method
    void inputStudent(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    abstract void displayType();   // abstract method
}


class Student extends Person {
    int m1, m2, m3;

    void inputMarks(BufferedReader br) throws IOException {
        this.m1 = readMarks(br, "Subject 1");
        this.m2 = readMarks(br, "Subject 2");
        this.m3 = readMarks(br, "Subject 3");
    }

    private int readMarks(BufferedReader br, String subject) throws IOException {
        int marks;
        while (true) {
            System.out.print("Enter " + subject + " Marks : ");
            marks = Integer.parseInt(br.readLine());
            if (marks >= 0 && marks <= 100)
                break;
            System.out.println("Marks should be between 0 to 100");
        }
        return marks;
    }

    final int total() {     // final method
        return this.m1 + this.m2 + this.m3;
    }

    @Override
    void displayType() {
        System.out.println("Student Type : General Student");
    }

    char calculateGrade() {
        int avg = total() / 3;
        if (avg >= 80) return 'A';
        else if (avg >= 60) return 'B';
        else if (avg >= 40) return 'C';
        else return 'F';
    }
}

class UGStudent extends Student {

    @Override
    char calculateGrade() {   // overridden
        int avg = total() / 3;
        if (avg >= 70) return 'A';
        else if (avg >= 50) return 'B';
        else if (avg >= 35) return 'C';
        else return 'F';
    }

    @Override
    void displayType() {
        System.out.println("Student Type : Undergraduate");
    }
}

class PGStudent extends Student {

    @Override
    char calculateGrade() {   // overridden
        int avg = total() / 3;
        if (avg >= 75) return 'A';
        else if (avg >= 55) return 'B';
        else if (avg >= 40) return 'C';
        else return 'F';
    }

    @Override
    void displayType() {
        System.out.println("Student Type : Postgraduate");
    }
}

//MAIN CLASS
public class MainApp {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of students : ");
        int n = Integer.parseInt(br.readLine());

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n1. General  2. UG  3. PG");
            System.out.print("Choose Student Type : ");
            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 2:
                    students[i] = new UGStudent();
                    break;
                case 3:
                    students[i] = new PGStudent();
                    break;
                default:
                    students[i] = new Student();
            }

            students[i].inputStudent(br);
            students[i].inputMarks(br);
        }

        for (Student s : students) {
            System.out.println("\n--- Student Result ---");
            s.displayType();
            System.out.println("Name        : " + s.name);
            System.out.println("Roll No     : " + s.rollNo);
            System.out.println("Total Marks : " + s.total());
            System.out.println("Grade       : " + s.calculateGrade());
            System.out.println("Percentage  : " + s.total() / 3 + "%");
        }
    }
}
