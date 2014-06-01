package com.smartapps.Localization;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by Maryanne on 22-05-2014.
 */
public class RssiDataSource {

    private SQLiteDatabase database;
    private RssiDB rssiDB;

    public static final int ssidPos = 1;
    public static final int rssiPos = 2;
    public static final int quantPos = 3;

    public RssiDataSource(Context context){
        rssiDB = new RssiDB(context);
    }

    public void open() throws SQLException{
        database = rssiDB.getWritableDatabase();
    }

    public void close(){
        rssiDB.close();
    }





    /*************************************************************************
     *******************   Get data from the database ^^   *******************
     *************************************************************************/


    /****************************  Test Data  ********************************/
    public DataCell getTestDataC1(){
        return getDataFromCell(RssiDB.TABLE_C1_TEST);
    }
    public DataCell getTestDataC2(){
        return getDataFromCell(RssiDB.TABLE_C2_TEST);
    }
    public DataCell getTestDataC3(){
        return getDataFromCell(RssiDB.TABLE_C3_TEST);
    }
    public DataCell getTestDataC4(){
        return getDataFromCell(RssiDB.TABLE_C4_TEST);
    }
    public DataCell getTestDataC5(){
        return getDataFromCell(RssiDB.TABLE_C5_TEST);
    }
    public DataCell getTestDataC6(){
        return getDataFromCell(RssiDB.TABLE_C6_TEST);
    }
    public DataCell getTestDataC7(){
        return getDataFromCell(RssiDB.TABLE_C7_TEST);
    }
    public DataCell getTestDataC8(){
        return getDataFromCell(RssiDB.TABLE_C8_TEST);
    }
    public DataCell getTestDataC9(){
        return getDataFromCell(RssiDB.TABLE_C9_TEST);
    }
    public DataCell getTestDataC10(){
        return getDataFromCell(RssiDB.TABLE_C10_TEST);
    }
    public DataCell getTestDataC11(){
        return getDataFromCell(RssiDB.TABLE_C11_TEST);
    }
    public DataCell getTestDataC12(){
        return getDataFromCell(RssiDB.TABLE_C12_TEST);
    }
    public DataCell getTestDataC13(){
        return getDataFromCell(RssiDB.TABLE_C13_TEST);
    }
    public DataCell getTestDataC14(){
        return getDataFromCell(RssiDB.TABLE_C14_TEST);
    }
    public DataCell getTestDataC15(){
        return getDataFromCell(RssiDB.TABLE_C15_TEST);
    }
    public DataCell getTestDataC16(){
        return getDataFromCell(RssiDB.TABLE_C16_TEST);
    }
    public DataCell getTestDataC17() {
        return getDataFromCell(RssiDB.TABLE_C17_TEST);
    }


    /**************************  Training Data  ******************************/
    public DataCell getTrainingDataC1(){
        return getDataFromCell(RssiDB.TABLE_C1_TRAINING);
    }
    public DataCell getTrainingDataC2(){
        return getDataFromCell(RssiDB.TABLE_C2_TRAINING);
    }
    public DataCell getTrainingDataC3(){
        return getDataFromCell(RssiDB.TABLE_C3_TRAINING);
    }
    public DataCell getTrainingDataC4(){
        return getDataFromCell(RssiDB.TABLE_C4_TRAINING);
    }
    public DataCell getTrainingDataC5(){
        return getDataFromCell(RssiDB.TABLE_C5_TRAINING);
    }
    public DataCell getTrainingDataC6(){
        return getDataFromCell(RssiDB.TABLE_C6_TRAINING);
    }
    public DataCell getTrainingDataC7(){
        return getDataFromCell(RssiDB.TABLE_C7_TRAINING);
    }
    public DataCell getTrainingDataC8(){
        return getDataFromCell(RssiDB.TABLE_C8_TRAINING);
    }
    public DataCell getTrainingDataC9(){
        return getDataFromCell(RssiDB.TABLE_C9_TRAINING);
    }
    public DataCell getTrainingDataC10(){
        return getDataFromCell(RssiDB.TABLE_C10_TRAINING);
    }
    public DataCell getTrainingDataC11(){
        return getDataFromCell(RssiDB.TABLE_C11_TRAINING);
    }
    public DataCell getTrainingDataC12(){
        return getDataFromCell(RssiDB.TABLE_C12_TRAINING);
    }
    public DataCell getTrainingDataC13(){
        return getDataFromCell(RssiDB.TABLE_C13_TRAINING);
    }
    public DataCell getTrainingDataC14(){
        return getDataFromCell(RssiDB.TABLE_C14_TRAINING);
    }
    public DataCell getTrainingDataC15(){
        return getDataFromCell(RssiDB.TABLE_C15_TRAINING);
    }
    public DataCell getTrainingDataC16(){
        return getDataFromCell(RssiDB.TABLE_C16_TRAINING);
    }
    public DataCell getTrainingDataC17() {
        return getDataFromCell(RssiDB.TABLE_C17_TRAINING);
    }


    /************************  General Methods  ******************************/

    /**
     * Get all of the data from a specific cell (in DataCell format)
     * @param tableName - name of the correspondent cell
     * @return a HashMap with ssid as a key and an array with RFData as a value
     */
    public DataCell getDataFromCell(String tableName){
        Cursor cursor = database.query(RssiDB.TABLE_MAC_VALUES, null, null , null, null, null, null);
        cursor.moveToFirst();
        Map<String, ArrayList<RFData>> data = new HashMap<String, ArrayList<RFData>>();
        while(!cursor.isAfterLast()){
            String ssid = cursor.getString(ssidPos);
            ArrayList<RFData> tempD = getDataFrom(tableName, ssid);
            if(tempD.size() > 0) data.put(ssid, tempD);
            cursor.moveToNext();
        }
        close();
        return new DataCell(data);
    }


    /**
     * Get data from a specific cell with a specific ssid
     * if no equal ssid value is found, this method will return an empty array
     * @param tableName - name of the correspondent cell
     * @param ssid - ssid value
     * @return array with RFData (that contains an ssid, rssi and quantity)
     */
    public ArrayList<RFData> getDataFrom(String tableName, String ssid) {
        Cursor cursor = database.query(tableName, null, RssiDB.SSID_VALUE + "=" + ssid , null, null, null, null);
        cursor.moveToFirst();

        ArrayList<RFData> result = new ArrayList<RFData>();
        while(!cursor.isAfterLast()){
            int rssi = cursor.getInt(rssiPos);
            int quantity = cursor.getInt(quantPos);
            RFData tempD = new RFData(ssid, rssi, quantity);
            result.add(tempD);
            cursor.moveToNext();
        }

        return result;
    }


}
