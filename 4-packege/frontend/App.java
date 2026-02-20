package frontend;

import backend.Server;
import java.util.Scanner;

public class App {

    public void runFrontend() {

        System.out.println("\n===== Website Frontend =====\n");

        Server server = new Server();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    server.register();
                    break;

                case 2:
                    server.login();
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }
}
