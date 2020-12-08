package sample;

/**
 * @author Kathryn Campo
 */
public class Screen {
    private String resolution;
    private int refreshRate;
    private int responseTime;

    Screen(String Resolution, int RefreshRate, int ResponseTime) {
        this.resolution = Resolution;
        this.refreshRate = RefreshRate;
        this.responseTime = ResponseTime;
    }

    public String toString() {
        return "Screen:" + "\n" + "Resolution: " + resolution + "\n" + "Refresh rate: " + refreshRate + "\n" + "Response time: " + responseTime;
    }}

