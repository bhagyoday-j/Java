import java.io.BufferedReader; //to read input from keyboard
import java.io.InputStreamReader; //connects keyboard input to Java
import java.io.IOException; //handles input errors

class Student {
    String name;
    int rollNo;

    Student() {
        this.name = "NA";
        this.rollNo = 0;
    }

    void inputStudent(BufferedReader br) throws IOException {
        System.out.print("Enter Student Name : ");
        this.name = br.readLine();

        System.out.print("Enter Student Roll No : ");
        this.rollNo = Integer.parseInt(br.readLine());
    }
}

class Marks {
    int m1, m2, m3;

    void inputMarks(BufferedReader br) throws IOException {
        while(true) {
            System.out.print("Enter Subject 1 Marks : ");
            this.m1 = Integer.parseInt(br.readLine());

            if(this.m1 < 0 || this.m1 > 100) {
                System.out.println("Marks should be in range 0 to 100");
            } else {
                break;
            }
        }

        while(true) {
            System.out.print("Enter Subject 2 Marks : ");
            this.m2 = Integer.parseInt(br.readLine());

            if(this.m2 < 0 || this.m2 > 100) {
                System.out.println("Marks should be in range 0 to 100");
            } else {
                break;
            }
        }

        while(true) {
            System.out.print("Enter Subject 3 Marks : ");
            this.m3 = Integer.parseInt(br.readLine());

            if(this.m3 < 0 || this.m3 > 100) {
                System.out.println("Marks should be in range 0 to 100");
            } else {
                break;
            }
        }
    }

    int total() {
        return this.m1 + this.m2 + this.m3;
    }
}

class GradeCalculator {
    char calculateGrade(int total) {
        int avg = total / 3;

        if (avg >= 80)
            return 'A';
        else if (avg >= 60)
            return 'B';
        else if (avg >= 40)
            return 'C';
        else
            return 'F';
    }
}

class Display {
    void show(Student s, Marks m, char grade) {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name        : " + s.name);
        System.out.println("Roll No     : " + s.rollNo);
        System.out.println("Total Marks : " + m.total());
        System.out.println("Grade       : " + grade);
        System.out.println("Persentage  : "  + m.total() / 3 + "%" );
    }
}

class MainApp {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of students : ");
        int n = Integer.parseInt(br.readLine());

        Student[] students = new Student[n];
        Marks[] marks = new Marks[n];

        GradeCalculator gc = new GradeCalculator();
        Display d = new Display();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            students[i] = new Student();
            marks[i] = new Marks();

            students[i].inputStudent(br);
            marks[i].inputMarks(br);
        }

        for (int i = 0; i < n; i++) {
            char grade = gc.calculateGrade(marks[i].total());
            d.show(students[i], marks[i], grade);
        }
    }
}
