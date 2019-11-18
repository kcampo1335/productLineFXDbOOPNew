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

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Production Line");
    primaryStage.setScene(new Scene(root,300, 300));
    primaryStage.show();
    }
    public static void main(String[] args) {

        launch(args);
    }

}
