package backend;

import java.util.Scanner;
import common.User;

public class Service {
    User u;
    
    public void process() {
        System.out.println("Enter Backend Engineer Details : ");
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

        u = new User(name, age, role, password);
    }

    public void displayUser() {
        System.out.println("Backend Development .....");
        System.out.println("Engineer Name : " + u.name);  //public

        u.showPassword();             //public method
        System.out.print("\n");
    }
}
