package sample;

import sample.MultimediaControl;
import sample.Product;


/**
 * The type Audio player. This class creates all of the details of an audio player.
 *
 * @author Kathryn Campo
 */

// A lot of checkstyle indentation errors. I am not sure why or how to fix the issue.

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
     * @param supportedPlaylistFormats the supported playlist formats
     */
    AudioPlayer(String name, String manufacturer, ItemType type, String supportedAudioFormats,
                String supportedPlaylistFormats) {
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
     * Gets audio formats.
     *
     * @return the audio formats
     */
    public String getsupportedAudioFormats() {
        return supportedAudioFormats;
    }

    /**
     * Sets audio formats.
     *
     * @param supportedAudioFormats the supported audio formats
     */
    public void setsupportedAudioFormats(String supportedAudioFormats) {
        this.supportedAudioFormats = supportedAudioFormats;
    }

    /**
     * Gets playlist formats.
     *
     * @return the playlist formats
     */
    public String getsupportedPlaylistFormats() {
        return supportedPlaylistFormats;
    }


    /**
     * Sets playlist formats.
     *
     * @param supportedPlaylistFormats the supported playlist formats
     */
    public void setsupportedPlaylistFormats(String supportedPlaylistFormats) {
        this.supportedPlaylistFormats = supportedPlaylistFormats;
    }

    @Override
    public void setType(ItemType type) {

    }
}