package sample;

/**
 * The enum Item type.
 */
public enum ItemType {
    /**
     * Audio item type.
     */
    AUDIO ("AU"),
    /**
     * Visual item type.
     */
    VISUAL ("VI"),
    /**
     * Audio mobile item type.
     */
    AUDIO_MOBILE ("AM"),
    /**
     * Visual mobile item type.
     */
    VISUAL_MOBILE ("VM");

    /**
     * The Label.
     */
    public final String label;

    ItemType(String code){
        label = code;
    }

    /**
     * Get label string.
     *
     * @return the string
     */
    public String getLabel(){
        return this.label;
    }
}