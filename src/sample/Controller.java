package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    public Button AddProductButton;
    @FXML
    public Button RecordProductionButton;


    public void handleAddProductButtonAction() {
        System.out.println(" Added Product");
    }

    public void handleRecordProductionButton() {
        System.out.println(" Production Recorded");
    }
}