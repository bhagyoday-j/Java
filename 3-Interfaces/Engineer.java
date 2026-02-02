import java.util.Scanner;

interface WebDeveloper {
    void developWebsite();

    interface frontend {
        void designUI();
    }

    interface backend {
        void manageDatabase();
    }
}

interface MLDeveloper {
    void buildModel();
}

interface FullStackDeveloper extends WebDeveloper,
        WebDeveloper.frontend,
        WebDeveloper.backend,
        MLDeveloper {
    void deployApplication();
}

class SoftwareEngineer implements FullStackDeveloper {

    Scanner sc = new Scanner(System.in);

    String frontendEngineer;
    String backendEngineer;
    String mlEngineer;

    String frontendTech;
    String backendTech;
    String websiteTitle;
    String modelName;

    public void designUI() {
        System.out.print("Enter Frontend Engineer Name: ");
        frontendEngineer = sc.nextLine();

        System.out.print("Enter Frontend Technology: ");
        frontendTech = sc.nextLine();
    }

    public void manageDatabase() {
        System.out.print("Enter Backend Engineer Name: ");
        backendEngineer = sc.nextLine();

        System.out.print("Enter Backend/Database Technology: ");
        backendTech = sc.nextLine();
    }

    public void developWebsite() {
        System.out.print("Enter Website Title: ");
        websiteTitle = sc.nextLine();
    }

    public void buildModel() {
        System.out.print("Enter ML Engineer Name: ");
        mlEngineer = sc.nextLine();

        System.out.print("Enter ML Model Name: ");
        modelName = sc.nextLine();
    }

    public void deployApplication() {
        System.out.println("\n----- PROJECT DETAILS -----");
        System.out.println("Website Title : " + websiteTitle);

        System.out.println("\nFrontend:");
        System.out.println("Engineer : " + frontendEngineer);
        System.out.println("Technology : " + frontendTech);

        System.out.println("\nBackend:");
        System.out.println("Engineer : " + backendEngineer);
        System.out.println("Technology : " + backendTech);

        System.out.println("\nMachine Learning:");
        System.out.println("Engineer : " + mlEngineer);
        System.out.println("Model : " + modelName);

        System.out.println("\nApplication deployed successfully ");
    }
}

// Main class
public class Engineer {
    public static void main(String[] args) {

        FullStackDeveloper dev = new SoftwareEngineer();

        dev.designUI();
        dev.manageDatabase();
        dev.developWebsite();
        dev.buildModel();
        dev.deployApplication();
    }
}
