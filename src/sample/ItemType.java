package sample;

/**
 * @author Kathryn Campo
 */
public enum ItemType {

    AUDIO("AU"),

    VISUAL("VI"),

    AUDIO_MOBILE("AM"),

    VISUAL_MOBILE("VM");

    public final String label;

    ItemType(String code) {
        label = code;
    }

    public String getLabel() {
        return this.label;
    }
}