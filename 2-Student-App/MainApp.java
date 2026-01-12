import java.util.*;

class Student {
  String name;
  int rollNo;

  public Student() {
    this.name = "NA";
    this.rollNo = 0;
  }

  void inputStudent(Scanner sc) {
    System.out.print("Enter Student name : ");
    name = sc.nextLine();

    System.out.print("Enter Student Rollno. : ");
    rollNo = sc.nextInt();
  }
}

class Marks {
  int m1, m2, m3;

  void inputMarks(Scanner sc) {
    System.out.print("Enter subject 1 Marks : ");
    m1 = sc.nextInt();

    System.out.print("Enter subject 2 Marks : ");
    m2 = sc.nextInt();

    System.out.print("Enter subject 3 Marks : ");
    m3 = sc.nextInt();
  }

  int total() {
    return m1 + m2 + m3;
  }
}

class GradeCalculator {
  GradeCalculator() {} // default constructor

  char calculateGrade(int total) {
    int avg = total / 3;

    if(avg >= 80) {
      return 'A';
    } else if(avg >= 60) {
      return 'B';
    } else if(avg >= 40) {
      return 'C';
    } else {
      return 'F';
    }
  }
}

class Display {
  void show(Student s, Marks m, char grade) {
    System.out.println("\n--- Student Result ---");
    System.out.println("Name       : " + s.name);
    System.out.println("Roll No    : " + s.rollNo);
    System.out.println("Total Marks: " + m.total());
    System.out.println("Grade      : " + grade);
  }
}

class MainApp {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

    Student s = new Student();
    Marks m = new Marks();
    GradeCalculator g = new GradeCalculator();
    Display d = new Display();

    s.inputStudent(sc);
    m.inputMarks(sc);

    char grade = g.calculateGrade(m.total());
    d.show(s, m, grade);

    sc.close();
  }
}

