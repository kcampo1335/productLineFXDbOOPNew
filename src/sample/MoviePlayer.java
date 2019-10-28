package sample;

public class MoviePlayer extends Product implements MultimediaControl {

    Screen screen;
    MonitorType monitorType;

    MoviePlayer(String Name, String Manufacturer, Screen sCreen, MonitorType monitoRType){
        super(Name, Manufacturer, "VISUAL");
        setScreen(sCreen);
        setMonitorType(monitoRType);
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

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen sCreen){
        this.screen = sCreen;
    }

    public MonitorType getMonitorType(){
        return monitorType;
    }

    public void setMonitorType(MonitorType monitoRType){
        this.monitorType = monitoRType;
    }

}