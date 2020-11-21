package sample;

/**
 * @author Kathryn Campo
 */
public interface ScreenSpec {

    String getResolution();

    int getRefreshRate();

    int getResponseTime();

    void setResolution(String Resolution);

    void setRefreshRate(int RefreshRate);

    void setResponseTime(int ResponseTime);

}
