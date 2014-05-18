package com.smartapps.Localization;

/**
 * Created by admin on 5/14/14.
 */
public class RFData {



    private String ssid;
    private int rssi;



    public RFData(String ssid, int rssi) {
        this.ssid = ssid;
        this.rssi = rssi;
    }

    public String toString()
    {
        return " RSSI =" + this.rssi +" SSID ="+this.ssid;
    }

}


