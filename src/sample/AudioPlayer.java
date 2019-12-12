package sample;

import sample.MultimediaControl;
import sample.Product;

/**
 * The type Audio player.
 */
public class AudioPlayer extends Product implements MultimediaControl {

    private String supportedAudioFormats;
    private String supportedPlaylistFormats;

    /**
     * Instantiates a new Audio player.
     *
     * @param name                     the name
     * @param manufacturer             the manufacturer
     * @param type                     the type
     * @param supportedAudioFormats    the supported audio formats
     * @param supportedPlaylistFormats the media type
     */
    AudioPlayer(String name, String manufacturer, ItemType type, String supportedAudioFormats, String supportedPlaylistFormats) {
        super(name, manufacturer, type);
        this.supportedAudioFormats = supportedAudioFormats;
        this.supportedPlaylistFormats = supportedPlaylistFormats;
    }

    public String toString() {
        String spec = "\nSupported Audio Formats: " + this.supportedAudioFormats + '\n';
        String media = "Supported Playlist Formats: " + this.supportedPlaylistFormats;
        return super.toString() + spec + media;
    }

    public void play() {
        System.out.println("Playing");
    }

    public void stop() {
        System.out.println("Stopping");
    }

    public void next() {
        System.out.println("Next");
    }

    public void previous() {
        System.out.println("Previous");
    }

    /**
     * Gets audio specification.
     *
     * @return the audio specification
     */
    public String getsupportedAudioFormats() {
        return supportedAudioFormats;
    }

    /**
     * Sets audio specification.
     *
     * @param supportedAudioFormats the audio specification
     */
    public void setsupportedAudioFormats(String supportedAudioFormats) {
        this.supportedAudioFormats = supportedAudioFormats;
    }

    /**
     * Gets media type.
     *
     * @return the media type
     */
    public String getsupportedPlaylistFormats() {
        return supportedPlaylistFormats;
    }

    /**
     * Sets media type.
     *
     * @param supportedPlaylistFormats the media type
     */
    public void setsupportedPlaylistFormats(String supportedPlaylistFormats) {
        this.supportedPlaylistFormats = supportedPlaylistFormats;
    }

    @Override
    public void setType(ItemType type) {

    }
}