import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

abstract class Person {
  protected String name;
  protected int rollNo;

  Person() {
    this.name = "NA";
    this.rollNo = 0;
  }

  void inputStudent(BufferedReader br) {
    System.out.print("Enter Student Name : ");
    this.name = br.readLine();

    System.out.print("Enter Student Roll Number : ");
    this.rollNo = Integer.parseInt(br.readLine());
  }

  void inputStudent(String name, int rollNo) {
    this.name = name;
    this.rollNo = rollNo;
  }

  abstract void displayType();
}

class Student extends Person {
  int m1, m2, m3;

  Student() {
    super();
  }

  void inputMarks(BufferedReader br) {
    System.out.print("Enter marks of subject m1 : ");
    this.m1 = Integer.parseInt(br.readLine());

    System.out.print("Enter marks of subject m2 : ");
    this.m2 = Integer.parseInt(br.readLine());

    System.out.print("Enter marks of subject m3 : ");
    this.m3 = Integer.parseInt(br.readLine());
  }

  final total() {
    return m1 + m2 + m3;
  }

  char calculateGrade() {
    int avgMarks = total() / 3;

    if(avgMarks > 90) {
      return 'A';
    } else if(avgMarks > 70) {
      return 'B';
    } else if(avgMarks > 45) {
      return 'C';
    } else {
      return 'F';
    }
  }

  @Override
  void displayType() {
    super.displayType();
    System.out.print("Total Marks : " + total());
    
    System.out.print("Grade       : " + calculateGrade());
  }
}