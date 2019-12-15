package sample;

import java.util.Date;


/**
 * The type Production record stores product information and helps to create a serial number for products.
 *
 * @author  Kathryn Campo
 */
public class ProductionRecord {
                 private int productionNumber;
                 private int productID;
                 private String serialNumber;
                  private Date dateProduced;


    /**
     * Instantiates a new Production record.
     *
     * @param productProduced the product produced
     * @param items           the items
     */
    public ProductionRecord(Product productProduced, int items) {
        String id = String.format("%05d", items);
        // formats and sets cereal number
        this.serialNumber =
                productProduced.Manufacturer.substring(0, 3) + productProduced.getType().getLabel() + id;
    }

    /**
     * Instantiates a new Production record.
     *
     * @param productID the product id
     */
    public ProductionRecord(int productID) {
        this.productID = productID;
        productionNumber = 0;
        serialNumber = "0";
        dateProduced = new Date();
    }


    /**
     * Instantiates a new Production record.
     *
     * @param productionNumber the production number
     * @param productID        the product id
     * @param serialNumber     the serial number
     * @param dateProduced     the date produced
     */
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


    /**
     * Gets production num.
     *
     * @return the production num
     */
    public int getProductionNum() {
        return productionNumber;
    }

    /**
     * Sets production num.
     *
     * @param productionNumber the production number
     */
    public void setProductionNum(int productionNumber) {
        this.productionNumber = productionNumber;
    }


    /**
     * Gets product id.
     *
     * @return the product id
     */
    public int getProductID() {
        return productID;
    }


    /**
     * Sets product id.
     *
     * @param productID the product id
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     * Gets serial num.
     *
     * @return the serial num
     */
    public String getSerialNum() {
        return serialNumber;
    }


    /**
     * Sets serial num.
     *
     * @param serialNumber the serial number
     */
    public void setSerialNum(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets prod date.
     *
     * @return the prod date
     */
    public Date getProdDate() {
        return dateProduced;
    }


    /**
     * Sets prod date.
     *
     * @param dateProduced the date produced
     */
    public void setProdDate(Date dateProduced) {
        this.dateProduced = dateProduced;
    }
}