import java.util.*;

class Student {
    String name;
    int age;

    void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    void displayData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class StudentApp {
    public static void main(String[] args) {

        Student s1 = new Student(); 

        s1.inputData();     
        s1.displayData();   
    }
}
