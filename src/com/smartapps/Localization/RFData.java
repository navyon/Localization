package com.smartapps.Localization;

import java.util.Comparator;

/**
 * Created by admin on 5/14/14.
 */
public class RFData {



    private String ssid;
    private int rssi;
    private int quantity;


    /*************************************************************************
     *****************************   Le début   ******************************
     *************************************************************************/

    public RFData(String ssid, int rssi) {
        this.ssid = ssid;
        this.rssi = rssi;
        quantity = 1;
    }
    public RFData(String ssid, int rssi, int  quantity) {
        this.ssid = ssid;
        this.rssi = rssi;
        this.quantity = quantity;
    }


    /*************************************************************************
     **********************   Getters and Setters   **************************
     *************************************************************************/

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;

    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String toString()
    {
        return " RSSI =" + this.rssi +" SSID ="+this.ssid;
    }



    /*************************************************************************
     *******************   Comparisons are done here!   *********************
     *************************************************************************/

    public int compareTo(RFData n) {
        if(this.getRssi() < n.getRssi()) return -1;
        if(this.getRssi() > n.getRssi()) return 1;
        return 0;
    }


    /**
     * Beautiful comparator
     */
    public static Comparator<RFData> RFDataComparator
            = new Comparator<RFData>() {

        public int compare(RFData n1, RFData n2) {
            if(n1.getRssi() < n2.getRssi()) return -1;
            if(n1.getRssi() > n2.getRssi()) return 1;
            return 0;
        }

    };

}


