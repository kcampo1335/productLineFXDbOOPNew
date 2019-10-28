package sample;

public class Screen implements ScreenSpec {
    private String resolution;
    private int refreshRate;
    private int responseTime;

    Screen(String Resolution, int RefreshRate, int ResponseTime){
        this.resolution = Resolution;
        this.refreshRate = RefreshRate;
        this.responseTime = ResponseTime;
    }
    public String toString() {
        return "Screen:" + "\n" + "Resolution: " + resolution + "\n" + "Refresh rate: " + refreshRate + "\n" + "Response time: " + responseTime;
    }
    public String getResolution(){
        return resolution;
    }
    public void setResolution(String Resolution){
        resolution = Resolution;
    }
    public int getRefreshRate(){
        return refreshRate;
    }
    public void setRefreshRate(int RefreshRate){
        refreshRate = RefreshRate;
    }
    public int getResponseTime(){
        return responseTime;
    }
    public void setResponseTime(int ResponseTime){
        responseTime = ResponseTime;
    }
}