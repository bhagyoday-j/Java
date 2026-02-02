import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

interface Person {
    void inputStudent(BufferedReader br) throws IOException;
    void displayType();
}

interface StudentOperations {
    void inputMarks(BufferedReader br) throws IOException;
    int total();
    char calculateGrade();
}

interface StudentDetails extends Person, StudentOperations {
    void showResult();
}

class Student implements StudentDetails {

    protected String name;
    protected int rollNo;
    protected int m1, m2, m3;

    @Override
    public void inputStudent(BufferedReader br) throws IOException {
        System.out.print("Enter Student Name : ");
        name = br.readLine();

        System.out.print("Enter Student Roll No : ");
        rollNo = Integer.parseInt(br.readLine());
    }

    @Override
    public void inputMarks(BufferedReader br) throws IOException {
        m1 = readMarks(br, "Subject 1");
        m2 = readMarks(br, "Subject 2");
        m3 = readMarks(br, "Subject 3");
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

    @Override
    public int total() {
        return m1 + m2 + m3;
    }

    @Override
    public char calculateGrade() {
        int avg = total() / 3;
        if (avg >= 80) return 'A';
        else if (avg >= 60) return 'B';
        else if (avg >= 40) return 'C';
        else return 'F';
    }

    @Override
    public void displayType() {
        System.out.println("Student Type : General Student");
    }

    @Override
    public void showResult() {
        displayType();
        System.out.println("Name        : " + name);
        System.out.println("Roll No     : " + rollNo);
        System.out.println("Total Marks : " + total());
        System.out.println("Grade       : " + calculateGrade());
        System.out.println("Percentage  : " + (total() / 3) + "%");
    }
}

class UGStudent extends Student {

    @Override
    public void displayType() {
        System.out.println("Student Type : Undergraduate");
    }

    @Override
    public char calculateGrade() {
        int avg = total() / 3;
        if (avg >= 70) return 'A';
        else if (avg >= 50) return 'B';
        else if (avg >= 35) return 'C';
        else return 'F';
    }
}

class PGStudent extends Student {

    @Override
    public void displayType() {
        System.out.println("Student Type : Postgraduate");
    }

    @Override
    public char calculateGrade() {
        int avg = total() / 3;
        if (avg >= 75) return 'A';
        else if (avg >= 55) return 'B';
        else if (avg >= 40) return 'C';
        else return 'F';
    }
}

// Main Class
public class StudentApp {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of students : ");
        int n = Integer.parseInt(br.readLine());

        StudentDetails[] students = new StudentDetails[n];

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

        for (StudentDetails s : students) {
            System.out.println("\n--- Student Result ---");
            s.showResult();
        }
    }
}
