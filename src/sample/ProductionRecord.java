package sample;

import java.util.Date;


/**
 * @author Kathryn Campo
 */
public class ProductionRecord {
                 private int productionNumber;
                 private int productID;
                 private String serialNumber;
                 private Date dateProduced;

    public ProductionRecord(Product productProduced, int items) {
        String id = String.format("%05d", items);
        // formats and sets cereal number
        this.serialNumber =
                productProduced.Manufacturer.substring(0, 3) + productProduced.getType().getLabel() + id;
    }

    public ProductionRecord(int productID) {
        this.productID = productID;
        //set productionNumber to 0
        productionNumber = 0;
        //set serialNumber to "0"
        serialNumber = "0";
        //produces the date
        dateProduced = new Date();
    }


    public ProductionRecord(
            int productionNumber, int productID, String serialNumber, Date dateProduced) {
        this.productID = productID;
        this.productionNumber = productionNumber;
        this.dateProduced = dateProduced;
        this.serialNumber = serialNumber;
    }


    public String toString() {
        return "Prod. Num: "
                + productionNumber
                + " \nProduct ID: "
                + productID
                + " \nSerial Num: "
                + serialNumber
                + " \nDate: "
                + dateProduced;
    }


}