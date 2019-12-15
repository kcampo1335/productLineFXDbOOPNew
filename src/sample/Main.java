package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.MonitorType;
import sample.MoviePlayer;
import sample.MultimediaControl;

import java.util.ArrayList;

/**
 * This program is made using JavaFX. It is created to track items being created and stores their information in a database.
 * <p>
 * This is the main class. It executes the program.
 *
 * @author Kathryn Campo
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Production Line");
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        launch(args);
    }

}
