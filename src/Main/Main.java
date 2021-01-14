/********************
 * Andre Stadler
 * 14.01.2021
 ********************/
package Main;

import ViewC.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Controller.show(stage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
