package sample;

/**
 * The type Movie player. Create a class called MoviePlayer that extends Product and implements MultimediaControl.
 * The movieplayer class is where information regarding movieplayer can be obtained or accessed.
 *
 * @author Kathryn Campo
 */
public class MoviePlayer extends Product implements MultimediaControl {

    /**
     * The Screen.
     */
    Screen screen;
    /**
     * The Monitor type.
     */
    MonitorType monitorType;

    /**
     * Instantiates a new Movie player.
     *
     * @param name         the name
     * @param manufacturer the manufacturer
     * @param screen       the the screen
     * @param monitorType  the the monitor type
     */
    //Create a constructor that accepts the name, manufacturer, a screen, and a monitor type. The constructor can set the item type to VISUAL.
    MoviePlayer(String name, String manufacturer, Screen screen, MonitorType monitorType) {
        super(name, manufacturer, ItemType.VISUAL);
        setScreen(screen);
        setMonitorType(monitorType);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + screen + "\n" + "Monitor Type: " + monitorType;
    }

    @Override
    public void play() {
        System.out.println("Playing movie");
    }

    @Override
    public void stop() {
        System.out.println("Stopping movie");
    }

    @Override
    public void previous() {
        System.out.println("Previous movie");
    }

    @Override
    public void next() {
        System.out.println("Next movie");
    }

    /**
     * Gets screen.
     *
     * @return the screen
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     * Set screen.
     *
     * @param screen the s creen
     */
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    /**
     * Get monitor type monitor type.
     *
     * @return the monitor type
     */
    public MonitorType getMonitorType() {
        return monitorType;
    }

    /**
     * Set monitor type.
     *
     * @param monitorType the monito r type
     */
    public void setMonitorType(MonitorType monitorType) {
        this.monitorType = monitorType;
    }

    @Override
    public void setType(ItemType type) {

    }
}