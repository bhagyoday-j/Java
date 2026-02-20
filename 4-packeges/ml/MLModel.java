package ml;

import java.util.Scanner;
import common.User;

public class MLModel extends User {

    public MLModel() {
        System.out.println("Enter ML Engineer Details : ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Age : ");
        int age = sc.nextInt();
        sc.nextLine(); // consume the newline

        System.out.print("Role : ");
        String role = sc.nextLine();

        System.out.print("Passaword : ");
        String password = sc.nextLine();

        super(name, age, role, password);
    }

    public void trainModel() {
        System.out.println("Training the ML model...");

        System.out.print("Engineer Name : ");
        System.out.println(name);  // public

        System.out.print("Engineer Age : ");
        System.out.println(age);   // protected (subclass)
        System.out.print("\n");

        // System.out.println(role); X default 
        // System.out.println(password); X private 
    }
}
