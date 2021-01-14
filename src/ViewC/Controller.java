package ViewC;

import Model.CarDatabase;
import Model.Vehicle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller implements Initializable
{

    @FXML
    private TextField searchTxt;

    @FXML
    private TextArea ausgabeTxt;

    @FXML
    private Button search;

    @FXML
    private Button searchExact;


    private CarDatabase cdb = new CarDatabase();
    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){}
    public void setStage(Stage stage)
    {
        this.stage = stage;
    }
    public static void show(Stage stage) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("View.fxml"));
            Parent root = fxmlLoader.load();

            //get controller which is connected to this fxml file
            Controller ctrl = fxmlLoader.getController();
            ctrl.setStage(stage);

            stage.setTitle("Car Database");
            stage.setScene(new Scene(root, 325, 400));

            stage.show();
        }

        catch (IOException e)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, e);
            System.err.println("Something wrong with welcome.fxml!");
            e.printStackTrace(System.err);
            System.exit(1);
        }


    }
    public void handle_patternSearch()
    {
        ausgabeTxt.clear();
        ArrayList<Vehicle> l = cdb.patternSearch(searchTxt.getText());
        for (Vehicle car:l)
        {
            ausgabeTxt.appendText(car.toString() + "\n");
        }
    }

    public void handle_exactSearch()
    {
        ausgabeTxt.clear();
        ausgabeTxt.setText(String.valueOf(cdb.exactSearch(searchTxt.getText())));
    }
}
