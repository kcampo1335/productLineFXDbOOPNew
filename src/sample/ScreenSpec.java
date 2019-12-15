package sample;

/**
 * The interface Screen spec is where the Screens resolution, refresh rate, and response time is obtained.
 *
 * @author Kathryn Campo
 */
public interface ScreenSpec {

    /**
     * Gets resolution.
     *
     * @return the resolution
     */
    String getResolution();

    /**
     * Gets refresh rate.
     *
     * @return the refresh rate
     */
    int getRefreshRate();

    /**
     * Gets response time.
     *
     * @return the response time
     */
    int getResponseTime();

    /**
     * Sets resolution.
     *
     * @param Resolution the resolution
     */
    void setResolution(String Resolution);

    /**
     * Sets refresh rate.
     *
     * @param RefreshRate the refresh rate
     */
    void setRefreshRate(int RefreshRate);

    /**
     * Sets response time.
     *
     * @param ResponseTime the response time
     */
    void setResponseTime(int ResponseTime);

}
