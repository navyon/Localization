package com.smartapps.Localization;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


/**
 * Created by Maryanne on 22-05-2014.
 */
public class DataCell{

    //the counter of the data array is the number of different MACs ids
    //Each object of this array, is also an array with ssid and rssi values
    //the counter for that array is the number of elements with that MAC id
    private Map< String, ArrayList<RFData>> data;

    public DataCell(Map<String, ArrayList<RFData>> data){
        this.data = data;
    }

    public int getTotalNumberOfMACIDs(){
        return this.data.size();
    }

    /**
     * Number of elements with ID mac
     */
    public int getNumberOfMACvalues(String mac){
        return this.data.get(mac).size();
    }

    /**
     * Get the elements with ID mac
     */
    public ArrayList<RFData> getElementsOfMACId(String mac){
        return this.data.get(mac);
    }

    /**
     * Get number of elements with macId and rssi value in this cell
     */
    public int getNrElemsOfIDAndRssi (String macID, int rssi){
        ArrayList<RFData> leData = this.data.get(macID);
        for (RFData rf : leData) {
            if (rf.getRssi() == rssi) {
                return rf.getQuantity();
            }
        }
        return -1;
    }

}
