package sample;

import sample.MultimediaControl;
import sample.Product;


/**
 * @author Kathryn Campo
 */


public class AudioPlayer extends Product implements MultimediaControl {

    private String supportedAudioFormats;
    private String supportedPlaylistFormats;

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

    public String getsupportedAudioFormats() {
        return supportedAudioFormats;
    }


    public void setsupportedAudioFormats(String supportedAudioFormats) {
        this.supportedAudioFormats = supportedAudioFormats;
    }

    public String getsupportedPlaylistFormats() {
        return supportedPlaylistFormats;
    }

    public void setsupportedPlaylistFormats(String supportedPlaylistFormats) {
        this.supportedPlaylistFormats = supportedPlaylistFormats;
    }

    @Override
    public void setType(ItemType type) {

    }
}