package sample;

import java.util.Date;

class ProductionRecord{


    private String Manufacturer;
    private int productionNumber;
    private int productID;
    private String serialNum;
    private Date dateProduced = new Date();
    private int itemCount;
    private ItemType Type;



    public ProductionRecord(Product product, int itemCount){
        this.productID = product.getId();
        this.Manufacturer = product.getManufacturer();
        this.itemCount = itemCount;
        Type = product.getType();
        this.serialNum = this.Manufacturer.substring(0, 3) + product.getType().label() + "0000"+ this.itemCount;
    }

    public String toString(){
        return "Prod. Num: " + productionNumber + " Product ID: " + productID + " Serial Num: " + serialNum + " Date: " + dateProduced;
    }

}