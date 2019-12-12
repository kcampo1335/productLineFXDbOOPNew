package sample;

/**
 * The type Movie player.
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
     * @param Name           the name
     * @param Manufacturer   the manufacturer
     * @param theScreen      the the screen
     * @param theMonitorType the the monitor type
     */
    MoviePlayer(String Name, String Manufacturer, Screen theScreen, MonitorType theMonitorType){
        super(Name, Manufacturer,ItemType.VISUAL);
        setScreen(theScreen);
        setMonitorType(theMonitorType);
    }

    @Override
    public String toString(){
        return super.toString() +"\n" + screen + "\n" + "Monitor Type: " + monitorType;
    }

    @Override
    public void play(){
        System.out.println("Playing movie");
    }

    @Override
    public void stop(){
        System.out.println("Stopping movie");
    }

    @Override
    public void previous(){
        System.out.println("Previous movie");
    }

    @Override
    public void next(){
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
     * @param sCreen the s creen
     */
    public void setScreen(Screen sCreen){
        this.screen = sCreen;
    }

    /**
     * Get monitor type monitor type.
     *
     * @return the monitor type
     */
    public MonitorType getMonitorType(){
        return monitorType;
    }

    /**
     * Set monitor type.
     *
     * @param monitoRType the monito r type
     */
    public void setMonitorType(MonitorType monitoRType){
        this.monitorType = monitoRType;
    }

    @Override
    public void setType(ItemType type) {

    }
}