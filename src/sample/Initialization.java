package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Initialization extends Controller {
    public void initialize() {
        initializationData();

        ObservableList<Integer> prodQuantity = FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        producesCombo.setItems(prodQuantity);
        producesCombo.getSelectionModel().selectFirst();
        producesCombo.setEditable(true);

        ObservableList<String> itemList = FXCollections.observableArrayList();
        for (ItemType itemTypeChoice : ItemType.values()) {
            System.out.println(itemTypeChoice + " " + itemTypeChoice.label);
            itemList.add(new String().valueOf(itemTypeChoice));

        }
        itemTypeChoiceBox.getItems().addAll(itemList);
        ProductionRecord prodRecord = new ProductionRecord(0);
        String prod = prodRecord.toString();

    }

    public void initializationData() {

        //  Database credentials
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:./res/ProductionLine";

        Statement stmt;

        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            Connection conn = DriverManager.getConnection(DB_URL);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}

