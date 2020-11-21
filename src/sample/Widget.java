package sample;

/**
 * @author Kathryn Campo
 */
class Widget extends Product {

    Widget(String name, String manufacturer, ItemType type) {

        super(name, manufacturer, type);
    }

    @Override
    public void setType(ItemType type) {

    }
}