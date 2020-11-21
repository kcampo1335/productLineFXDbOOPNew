package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;  // for initialization method



public class Controller {

    @FXML
    public Button addProductButton;

    @FXML
    public Button recordProductionButton;

    @FXML
    public ComboBox<Integer> producesCombo;

    @FXML
    public ChoiceBox<String> itemTypeChoiceBox;

    @FXML
    public TableView<Product> tableView;

    @FXML
    public TableColumn<?, ?> tableColOne;

    @FXML
    public TableColumn<?, ?> tableColTwo;

    @FXML
    public TableColumn<?, ?> tableColThree;

    @FXML
    public ListView<Product> listViewOne;

    @FXML
    public TextArea textArea;

    @FXML
    public TextField productNameBox;

    @FXML
    public TextField manufacturerNameBox;

    @FXML
    public Label chooseProduct;

    @FXML
    public Label chooseQuantityLBL;

    @FXML
    public Label prodNameLBL;

    @FXML
    public Label manLBL;

    @FXML
    public Label itLBL;

    @FXML
    public Label existingLBL;

    @FXML
    public Tab tab1;

    @FXML
    public Tab tab2;

    @FXML
    public Tab tab3;

    //global
    private Connection conn;

    //hold all of the Products that can be produced.
    private final ObservableList<Product> ProductLine = FXCollections.observableArrayList();

    public void handleRecordProductionButton() {
        System.out.println(" Production Recorded");
    }

    public void handleAddProductButton(ActionEvent actionEvent) throws SQLException {
        System.out.println(" Added Product");

        createProduct();
        createProdTable();
        clearTextField();

    }

    public void clearTextField(){
        productNameBox.clear();
        manufacturerNameBox.clear();
    }

    public void createProduct() throws SQLException {
        String productName = productNameBox.getText();
        String manufacturerName = manufacturerNameBox.getText();
        String productChoice = itemTypeChoiceBox.getValue();

        String dataInfo = "Insert into PRODUCT( NAME, TYPE, MANUFACTURER) VALUES (?,?,?)";

        PreparedStatement preparedStatement = conn.prepareStatement(dataInfo);
        preparedStatement.setString(1, productName);
        preparedStatement.setString(2, manufacturerName);
        preparedStatement.setString(3, productChoice);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        conn.close();
    }

    public void createProdTable(){

        tableColOne.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableColTwo.setCellValueFactory(new PropertyValueFactory<>("manufacturer"));
        tableColThree.setCellValueFactory(new PropertyValueFactory<>("type"));
        tableView.setItems(ProductLine);
        listViewOne.setItems(ProductLine);
    }

}