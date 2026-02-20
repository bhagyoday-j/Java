import frontend.UI;
import backend.Service;
import database.DBConnection;
import ml.MLModel;

public class MainApp {
    public static void main(String[] args) {

        UI ui = new UI();
        ui.acceptUser();

        Service service = new Service();
        service.process();

        DBConnection db = new DBConnection();

        MLModel model = new MLModel();

        ui.displayUser();
        service.displayUser();
        model.trainModel();
        db.connect();
    }
}
