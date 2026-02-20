package frontend;

import java.util.Scanner;
import common.User;

public class UI {

    User u;

    public void acceptUser() {
        System.out.println("Enter Frontend Engineer Details : ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Age : ");
        int age = sc.nextInt();
        sc.nextLine(); // consume the newline

        System.out.print("Role : ");
        String role = sc.nextLine();

        System.out.print("Password : ");
        String password = sc.nextLine();

        u = new User(name, age, role, password);
    }

    public void displayUser() {
        System.out.println("\n----------Displaying Details :----------");
        System.out.println("Designing UI .... ");  
        System.out.print("Engineer Name : ");
        System.out.println(u.name);   // public -> allowed

        // System.out.println(u.age);  protected -> not subclass
        // System.out.println(u.role);  default -> different package
        // System.out.println(u.password);  private -> never allowed
        u.showPassword(); // public method
        System.out.print("\n");
    }
}
