package sample;

/**
 * The Product class handles all of the fuctionality for products.
 *
 * @author Kathryn Campo
 */
public abstract class Product implements Item {
    private int id;
    /**
     * The Type.
     */
    public ItemType Type;
    /**
     * The Manufacturer.
     */
    public String Manufacturer;
    /**
     * The Name.
     */
    public String Name;


    /**
     * Instantiates a new Product.
     *
     * @param name         the name
     * @param manufacturer the manufacturer
     * @param type         the type
     */
    Product(String name, String manufacturer, ItemType type) {
        this.Name = name;
        this.Manufacturer = manufacturer;
        this.Type = type;
    }

    public ItemType getType() {
        return Type;
    }

    /**
     * Set type.
     */
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

