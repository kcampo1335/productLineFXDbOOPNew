package sample;

import java.util.Date;

public class ProductionRecord{
    private int productionNumber;
    private int productID;
    private String serialNumber;
    private Date dateProduced;

    public ProductionRecord(int productID){
        this.productID = productID;
        productionNumber = 0;
        serialNumber = "0";
        dateProduced = new Date();
    }

    public ProductionRecord(int productionNumber, int productID, String serialNumber, Date dateProduced){
        this.productID = productID;
        this.productionNumber = productionNumber;
        this.dateProduced = dateProduced;
        this.serialNumber = serialNumber;

    }

    public String toString() {
        return "Prod. Num: " + productionNumber + " Product ID: " + productID + " Serial Num: " + serialNumber + " Date: " + dateProduced;
    }

    public int getProductionNum(){
        return productionNumber;
    }
    public void setProductionNum(int productionNumber){
        this.productionNumber = productionNumber;
    }
    public int getProductID(){
        return productID;
    }
    public void setProductID(int productID){
        this.productID = productID;
    }
    public String getSerialNum(){
        return serialNumber;
    }
    public void setSerialNum(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public Date getProdDate(){
        return dateProduced;
    }
    public void setProdDate(Date dateProduced){
        this.dateProduced = dateProduced;
    }
}