import java.util.*;

// Abstract class
abstract class Student {
    protected String name;
    protected final int rollNo;
    protected int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    abstract void showRole();

    void showBasicDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public final boolean isPassed() {
        return marks >= 40;
    }

    interface Attendance {
        void markAttendance(int days);
    }
}

interface Academic {
    void studyHours(int hrs);
}

interface Sports {
    void playSport(String game);
}

// Derived interface
interface AllRounder extends Academic, Sports {
    void participateEvent(String event);
}

class CollegeStudent extends Student
        implements AllRounder, Student.Attendance {

    private int attendanceDays;

    CollegeStudent(String name, int rollNo, int marks) {
        super(name, rollNo, marks);
    }

    void showRole() {
        System.out.println("Role: College Student");
    }

    void showFullDetails() {
        super.showBasicDetails();
        System.out.println("Attendance: " + attendanceDays);
        System.out.println("Result: " + (isPassed() ? "PASS" : "FAIL"));
        System.out.println("-------------------------");
    }

    public void studyHours(int hrs) {
        System.out.println(this.name + " studied " + hrs + " hrs");
    }

    public void playSport(String game) {
        System.out.println(this.name + " plays " + game);
    }

    public void participateEvent(String event) {
        System.out.println(this.name + " participated in " + event);
    }

    public void markAttendance(int days) {
        this.attendanceDays = days;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CollegeStudent> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1. Add new student");
            System.out.println("2. Search student by roll no");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter roll no: ");
                    int roll = sc.nextInt();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    System.out.print("Enter attendance days: ");
                    int days = sc.nextInt();

                    CollegeStudent s = new CollegeStudent(name, roll, marks);
                    s.markAttendance(days);

                    list.add(s);
                    System.out.println("Student added.");
                    break;

                case 2:
                    System.out.print("Enter roll no to search: ");
                    int r = sc.nextInt();
                    boolean found = false;

                    for (CollegeStudent st : list) {
                        if (st.getRollNo() == r) {
                            st.showRole();
                            st.showFullDetails();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    System.out.println("Bye.... Bye....");
                    System.out.println("See you soon...");
                    System.out.println("kalaji ghya ");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}