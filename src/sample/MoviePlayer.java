package sample;

/**
 * The type Movie player. Create a class called MoviePlayer that extends Product and implements MultimediaControl.
 * The movieplayer class is where information regarding movieplayer can be obtained or accessed.
 *
 * @author Kathryn Campo
 */
public class MoviePlayer extends Product implements MultimediaControl {

    Screen screen;


    //Create a constructor that accepts the name, manufacturer, a screen, and a monitor type. The constructor can set the item type to VISUAL.
    MoviePlayer(String name, String manufacturer, Screen screen) {
        super(name, manufacturer, ItemType.VISUAL);
        setScreen(screen);

    }

    //toString method that calls the Product toString and displays
    // the monitor and the screen details.
    @Override
    public String toString() {
        return super.toString() + "\n" + screen + "\n";
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

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }


    @Override
    public void setType(ItemType type) {

    }
}