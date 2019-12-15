package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;  // for initialization method


/**
 * The type Controller. Controls sample.fxml. IT handles the add product button
 * and record production button. This class allows users to save to the database.
 *
 * @author Kathryn Campo
 */
public class Controller {
    /**
     * The Add product button.
     */
    @FXML
    public Button addProductButton;
    /**
     * The Record production button.
     */
    @FXML
    public Button recordProductionButton;
    /**
     * The Produces combo.
     */
    @FXML
    public ComboBox<Integer> producesCombo;
    /**
     * The Item type choice box.
     */
    @FXML
    public ChoiceBox<String> itemTypeChoiceBox;
    /**
     * The Table view.
     */
    @FXML
    public TableView<Product> tableView;
    /**
     * The Table col one.
     */
    @FXML
    public TableColumn<?, ?> tableColOne;
    /**
     * The Table col two.
     */
    @FXML
    public TableColumn<?, ?> tableColTwo;
    /**
     * The Table col three.
     */
    @FXML
    public TableColumn<?, ?> tableColThree;
    /**
     * The List view one.
     */
    @FXML
    public ListView<Product> listViewOne;
    /**
     * The Text area.
     */
    @FXML
    public TextArea textArea;
    /**
     * The Product name box.
     */
    @FXML
    public TextField productNameBox;
    /**
     * The Manufacturer name box.
     */
    @FXML
    public TextField manufacturerNameBox;

    /**
     * The Choose product.
     */
    @FXML
    public Label chooseProduct;

    /**
     * The Choose quantity lbl.
     */
    @FXML
    public Label chooseQuantityLBL;
    /**
     * The Prod name lbl.
     */
    @FXML
    public Label prodNameLBL;

    /**
     * The Man lbl.
     */
    @FXML
    public Label manLBL;
    /**
     * The It lbl.
     */
    @FXML
    public Label itLBL;
    /**
     * The Existing lbl.
     */
    @FXML
    public Label existingLBL;

    @FXML public Tab tab1;
    @FXML public Tab tab2;
    @FXML public Tab tab3;


    //global
    private Connection conn;

    private final ObservableList<Product> ProductLine = FXCollections.observableArrayList();

    /**
     * Handle record production button.
     */
    public void handleRecordProductionButton() {
        System.out.println(" Production Recorded");
    }

    /**
     * Handle add product button.
     *
     * @param actionEvent the action event
     * @throws SQLException the sql exception
     */
    public void handleAddProductButton(ActionEvent actionEvent) throws SQLException {
        System.out.println(" Added Product");
        String productName = productNameBox.getText();
        String manufacturerName = manufacturerNameBox.getText();
        String productChoice = itemTypeChoiceBox.getValue();

        String dataInfo = "Insert into PRODUCT( NAME, TYPE, MANUFACTURER) VALUES (?,?,?)";

        PreparedStatement preparedStatement = conn.prepareStatement(dataInfo);
        preparedStatement.setString(1, productName);
        preparedStatement.setString(2, manufacturerName);
        preparedStatement.setString(3, productChoice);
        preparedStatement.executeUpdate();
        productNameBox.clear();
        manufacturerNameBox.clear();

        tableColOne.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableColTwo.setCellValueFactory(new PropertyValueFactory<>("manufacturer"));
        tableColThree.setCellValueFactory(new PropertyValueFactory<>("type"));
        tableView.setItems(ProductLine);
        listViewOne.setItems(ProductLine);
        preparedStatement.close();
        conn.close();
    }

    /**
     * Initialize.
     */
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

    /**
     * Initialization data.
     */
    public void initializationData() {

        //  Database credentials
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:./res/ProductionLine";

        Statement stmt;

        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            conn = DriverManager.getConnection(DB_URL);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}