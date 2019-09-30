package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.sql.*;  // for initialization method


public class Controller {

    @FXML public Button AddProductButton;

    @FXML public Button RecordProductionButton;

    @FXML private ComboBox<Integer> ProducesCombo;

    public void handleRecordProductionButton() {
        System.out.println(" Production Recorded");
    }

    public void handleAddProductButton(ActionEvent actionEvent) {
        System.out.println(" Added Product");
    }

    public void initialization(){

        //  Database credentials
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:./res/ProductionLine";

        Connection conn;
        Statement stmt;

        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            conn = DriverManager.getConnection(DB_URL);

            //STEP 3: Execute a query
            stmt = conn.createStatement();
            String sql = "INSERT INTO Product(type, manufacturer, name) VALUES ( 'AUDIO', 'Apple', 'iPod' )";

            stmt.executeQuery(sql);


            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <= 10; i++) {
            ProducesCombo.getItems().add(i);
        }
        ProducesCombo.getSelectionModel().selectFirst();
        ProducesCombo.setEditable(true);
    }
}