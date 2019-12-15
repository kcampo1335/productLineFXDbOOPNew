package sample;

/**
 * The enum Item type store information on the different types of items.
 *
 * @author Kathryn Campo
 */
public enum ItemType {
    /**
     * Audio item type.
     */
    AUDIO("AU"),
    /**
     * Visual item type.
     */
    VISUAL("VI"),
    /**
     * Audio mobile item type.
     */
    AUDIO_MOBILE("AM"),
    /**
     * Visual mobile item type.
     */
    VISUAL_MOBILE("VM");

    /**
     * The Label.
     */
    public final String label;

    ItemType(String code) {
        label = code;
    }

    /**
     * Get label string.
     *
     * @return the string
     */
    //Update your code to insert a product to use the
    // choicebox selected item.
    public String getLabel() {
        return this.label;
    }
}