package sample;

/**
 * @author Kathryn Campo
 */
public abstract class Product implements Item {
    private int id;

    public ItemType Type;

    public String Manufacturer;

    public String Name;

    Product(String name, String manufacturer, ItemType type) {
        this.Name = name;
        this.Manufacturer = manufacturer;
        this.Type = type;
    }

    public ItemType getType() {
        return Type;
    }

    public void setType() {
        ItemType type = null;
        Type = type;
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

