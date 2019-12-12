package sample;

/**
 * The interface Item.
 */
public interface Item {

    /**
     * Gets id.
     *
     * @return the id
     */
    int getId();

    /**
     * Sets name.
     *
     * @param name the name
     */
    void setName(String name);

    /**
     * Gets name.
     *
     * @return the name
     */
    String getName();

    /**
     * Sets manufacturer.
     *
     * @param manufacturer the manufacturer
     */
    void setManufacturer(String manufacturer);

    /**
     * Gets manufacturer.
     *
     * @return the manufacturer
     */
    String getManufacturer();

    /**
     * Gets type.
     *
     * @return the type
     */
    ItemType getType();

    /**
     * Sets type.
     *
     * @param type the type
     */
    void setType(ItemType type);

}