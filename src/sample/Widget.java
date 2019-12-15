package sample;

/**
 * The Widget class is used to create products.
 *
 * @author Kathryn Campo
 */
class Widget extends Product {

    /**
     * Instantiates a new Widget.
     *
     * @param name         the name
     * @param manufacturer the manufacturer
     * @param type         the type
     */
    Widget(String name, String manufacturer, ItemType type) {

        super(name, manufacturer, type);
    }

    @Override
    public void setType(ItemType type) {

    }
}