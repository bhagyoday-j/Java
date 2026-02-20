import frontend.App;
import frontend.SupperBase;

public class MainApp {
    public static void main(String[] args) {
        SupperBase sb = new SupperBase();
        sb.accessingSchemaInSupperBase();

        App app = new App();
        app.runFrontend();
    }
}
