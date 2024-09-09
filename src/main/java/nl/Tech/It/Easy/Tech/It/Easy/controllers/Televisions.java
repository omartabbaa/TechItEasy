package nl.Tech.It.Easy.Tech.It.Easy.controllers;


public class Televisions {
    private double height;
    private int width;
    private String schermKwaliteit;
    private boolean wifi;
    private boolean smartTv;
    private boolean voiceControl;
    private boolean hdr;
    private int id;  // Changed to int for ID

    // Constructor (no void)
    public Televisions(double height, int width, String schermKwaliteit, boolean wifi, boolean smartTv, boolean voiceControl, boolean hdr, int id) {
        this.height = height;
        this.width = width;
        this.schermKwaliteit = schermKwaliteit;
        this.wifi = wifi;
        this.smartTv = smartTv;
        this.voiceControl = voiceControl;
        this.hdr = hdr;
        this.id = id;  // Use int here
    }

    // Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getSchermKwaliteit() {
        return schermKwaliteit;
    }

    public void setSchermKwaliteit(String schermKwaliteit) {
        this.schermKwaliteit = schermKwaliteit;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    public boolean isVoiceControl() {
        return voiceControl;
    }

    public void setVoiceControl(boolean voiceControl) {
        this.voiceControl = voiceControl;
    }

    public boolean isHdr() {
        return hdr;
    }

    public void setHdr(boolean hdr) {
        this.hdr = hdr;
    }

    public int getId() {  // Correct getter for int id
        return id;
    }

    public void setId(int id) {  // Correct setter for int id
        this.id = id;
    }

    // toString Method for debugging
    @Override
    public String toString() {
        return "Televisions{" +
                "height=" + height +
                ", width=" + width +
                ", schermKwaliteit='" + schermKwaliteit + '\'' +
                ", wifi=" + wifi +
                ", smartTv=" + smartTv +
                ", voiceControl=" + voiceControl +
                ", hdr=" + hdr +
                ", id=" + id +
                '}';
    }
}
