package com.smartapps.Localization;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
//import android.net.ConnectivityManager;
//import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    private int time = 20;
    private Timer t;
    private TimerTask task;

    private Button btnCollect1,btnCollect2,btnCollect3,btnCollect4,btnCollect5,btnCollect6,btnCollect7,btnCollect8,btnCollect9,btnCollect10,btnCollect11,btnCollect12,btnCollect13,btnCollect14,btnCollect15,btnCollect16,btnCollect17,btnSave;
    private boolean btn1Used, btn2Used, btn3Used, btn4Used, btn5Used, btn6Used, btn7Used, btn8Used, btn9Used, btn10Used, btn11Used,btn12Used, btn13Used, btn14Used, btn15Used, btn16Used, btn17Used;
    private TextView txtviewwifi;
    private List<ScanResult> wifiList;
    private ArrayList<RFData> dataC1, dataC2, dataC3, dataC4, dataC5, dataC6, dataC7, dataC8, dataC9, dataC10, dataC11, dataC12, dataC13, dataC14,dataC15, dataC16, dataC17, fingerprintingData;

    private enum ButtonClicked{
        btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17
    };
    private ButtonClicked btnClickedIs;

    IntentFilter intentFilter = new IntentFilter();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnCollect1 = (Button) findViewById(R.id.btnScanC1);
        btnCollect2 = (Button) findViewById(R.id.btnScanC2);
        btnCollect3 = (Button) findViewById(R.id.btnScanC3);
        btnCollect4 = (Button) findViewById(R.id.btnScanC4);
        btnCollect5 = (Button) findViewById(R.id.btnScanC5);
        btnCollect6 = (Button) findViewById(R.id.btnScanC6);
        btnCollect7 = (Button) findViewById(R.id.btnScanC7);
        btnCollect8 = (Button) findViewById(R.id.btnScanC8);
        btnCollect9 = (Button) findViewById(R.id.btnScanC9);
        btnCollect10 = (Button) findViewById(R.id.btnScanC10);
        btnCollect11 = (Button) findViewById(R.id.btnScanC11);
        btnCollect12 = (Button) findViewById(R.id.btnScanC12);
        btnCollect13 = (Button) findViewById(R.id.btnScanC13);
        btnCollect14 = (Button) findViewById(R.id.btnScanC14);
        btnCollect15 = (Button) findViewById(R.id.btnScanC15);
        btnCollect16 = (Button) findViewById(R.id.btnScanC16);
        btnCollect17 = (Button) findViewById(R.id.btnScanC17);
        btnSave =(Button) findViewById(R.id.btnSave);
        txtviewwifi = (TextView) findViewById(R.id.RSS_DATA);

        btnCollect1.setOnClickListener(this);
        btnCollect2.setOnClickListener(this);
        btnCollect3.setOnClickListener(this);
        btnCollect4.setOnClickListener(this);
        btnCollect5.setOnClickListener(this);
        btnCollect6.setOnClickListener(this);
        btnCollect7.setOnClickListener(this);
        btnCollect8.setOnClickListener(this);
        btnCollect9.setOnClickListener(this);
        btnCollect10.setOnClickListener(this);
        btnCollect11.setOnClickListener(this);
        btnCollect12.setOnClickListener(this);
        btnCollect13.setOnClickListener(this);
        btnCollect14.setOnClickListener(this);
        btnCollect15.setOnClickListener(this);
        btnCollect16.setOnClickListener(this);
        btnCollect17.setOnClickListener(this);
        btnSave.setOnClickListener(this);

        dataC1  = new ArrayList<RFData>();
        dataC2  = new ArrayList<RFData>();
        dataC3  = new ArrayList<RFData>();
        dataC4  = new ArrayList<RFData>();
        dataC5  = new ArrayList<RFData>();
        dataC6  = new ArrayList<RFData>();
        dataC7  = new ArrayList<RFData>();
        dataC8  = new ArrayList<RFData>();
        dataC9  = new ArrayList<RFData>();
        dataC10  = new ArrayList<RFData>();
        dataC11  = new ArrayList<RFData>();
        dataC12  = new ArrayList<RFData>();
        dataC13  = new ArrayList<RFData>();
        dataC14  = new ArrayList<RFData>();
        dataC15  = new ArrayList<RFData>();
        dataC16  = new ArrayList<RFData>();
        dataC17  = new ArrayList<RFData>();
        fingerprintingData  = new ArrayList<RFData>();
        intentFilter.addAction(WifiManager.RSSI_CHANGED_ACTION);

        initializeBoolValues();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnScanC1:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn1;
                btn1Used = true;
                startTimer();
                break;
            case R.id.btnScanC2:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver , intentFilter);
                btnClickedIs = ButtonClicked.btn2;
                btn2Used = true;
                startTimer();
                break;
            case R.id.btnScanC3:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn3;
                btn3Used = true;
                startTimer();
                break;
            case R.id.btnScanC4:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn4;
                btn4Used = true;
                startTimer();

                break;
            case R.id.btnScanC5:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn5;
                btn5Used = true;
                startTimer();

                break;
            case R.id.btnScanC6:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn6;
                btn6Used = true;
                startTimer();

                break;
            case R.id.btnScanC7:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn7;
                btn7Used = true;

                startTimer();
                break;
            case R.id.btnScanC8:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn8;
                btn8Used = true;
                startTimer();

                break;
            case R.id.btnScanC9:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn9;
                btn9Used = true;
                startTimer();

                break;
            case R.id.btnScanC10:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn10;
                btn10Used = true;
                startTimer();

                break;
            case R.id.btnScanC11:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn11;
                btn11Used = true;
                startTimer();

                break;
            case R.id.btnScanC12:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn12;
                btn12Used = true;
                startTimer();

                break;
            case R.id.btnScanC13:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn13;
                btn13Used = true;
                startTimer();

                break;
            case R.id.btnScanC14:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn14;
                btn14Used = true;
                startTimer();

                break;
            case R.id.btnScanC15:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn15;
                btn15Used = true;
                startTimer();

                break;
            case R.id.btnScanC16:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn16;
                btn16Used = true;
                startTimer();

                break;
            case R.id.btnScanC17:
                this.disableButtons();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                btnClickedIs = ButtonClicked.btn17;
                btn17Used = true;
                startTimer();

                break;
            default:
                break;
            case R.id.btnSave:
                saveData();
               break;

        }
    }


    /***************************************************************************************
     ********************************* Broadcast Receiver **********************************
     ***************************************************************************************/

    private BroadcastReceiver myRssiChangeReceiver
            = new BroadcastReceiver(){

        @Override
        public void onReceive(Context arg0, Intent arg1) {

            int rssi;
            String  ssid;
            StringBuilder sb = new StringBuilder();
            //int newRssi = arg1.getIntExtra(WifiManager.EXTRA_NEW_RSSI, 0);
            WifiManager w = (WifiManager) arg0.getSystemService(Context.WIFI_SERVICE);

            wifiList = w.getScanResults(); // Returns a <list> of scanResults
            for (ScanResult aWifiList : wifiList) {
                sb.append(Integer.toString(fingerprintingData.size())).append(".");
                sb.append(aWifiList.SSID);
                sb.append(aWifiList.level);
                sb.append("\n");
                ssid = aWifiList.SSID;
                rssi = aWifiList.level;

                RFData rfData = new RFData(ssid, rssi);
                fingerprintingData.add(rfData);

            }
            StringBuilder lsttext =  new StringBuilder();
            lsttext.append(txtviewwifi.getText()).append("\n").append(sb);
            txtviewwifi.setText(lsttext);

        }};


    /***************************************************************************************
     *************************************** Timer  ****************************************
     ***************************************************************************************/
    public void startTimer(){
        time = 0;
        t = new Timer();
        task = new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    //Called each time when 1000 milliseconds (1 second) (the period parameter)
                    @Override
                    public void run() {
                        TextView tv = (TextView) findViewById(R.id.timer);

                        time += 1;

                        int seconds = time % 60;
                        int minutes = time / 60;
                        String stringTime = String.format("%02d:%02d", minutes, seconds);
                        tv.setText(stringTime);

                        if(minutes >= 2){
                            stopTime();
                        }
                    }
                });
            }
        };
        t.scheduleAtFixedRate(task, 0, 1000);
        //Second param. - Set how long before to start calling the TimerTask (in milliseconds)
        //Third param. - Set the amount of time between each execution (in milliseconds)
    }


    private void stopTime(){


        System.out.println(fingerprintingData);
        activateButtons();
        switch (this.btnClickedIs){
            case btn1:
                this.dataC1 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn2:
                this.dataC2 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn3:
                this.dataC3 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn4:
                this.dataC4 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn5:
                this.dataC5 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn6:
                this.dataC6 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn7:
                this.dataC7 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn8:
                this.dataC8 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn9:
                this.dataC9 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn10:
                this.dataC10 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn11:
                this.dataC11 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn12:
                this.dataC12 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn13:
                this.dataC13 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn14:
                this.dataC14 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn15:
                this.dataC15 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn16:
                this.dataC16 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn17:
                this.dataC17 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
        }
        task.cancel();
    }




    /***************************************************************************************
     ************************* Buttons - Enable and Disable options*************************
     ***************************************************************************************/

    private void disableButtons(){
        this.btnCollect1.setEnabled(false);
        this.btnCollect2.setEnabled(false);
        this.btnCollect3.setEnabled(false);
        this.btnCollect4.setEnabled(false);
        this.btnCollect5.setEnabled(false);
        this.btnCollect6.setEnabled(false);
        this.btnCollect7.setEnabled(false);
        this.btnCollect8.setEnabled(false);
        this.btnCollect9.setEnabled(false);
        this.btnCollect10.setEnabled(false);
        this.btnCollect11.setEnabled(false);
        this.btnCollect12.setEnabled(false);
        this.btnCollect13.setEnabled(false);
        this.btnCollect14.setEnabled(false);
        this.btnCollect15.setEnabled(false);
        this.btnCollect16.setEnabled(false);
        this.btnCollect17.setEnabled(false);
    }

    private void activateButtons(){
        if(!btn1Used)this.btnCollect1.setEnabled(true);
        if(!btn2Used)this.btnCollect2.setEnabled(true);
        if(!btn3Used)this.btnCollect3.setEnabled(true);
        if(!btn4Used)this.btnCollect4.setEnabled(true);
        if(!btn5Used)this.btnCollect5.setEnabled(true);
        if(!btn6Used)this.btnCollect6.setEnabled(true);
        if(!btn7Used)this.btnCollect7.setEnabled(true);
        if(!btn8Used)this.btnCollect8.setEnabled(true);
        if(!btn9Used)this.btnCollect9.setEnabled(true);
        if(!btn10Used)this.btnCollect10.setEnabled(true);
        if(!btn11Used)this.btnCollect11.setEnabled(true);
        if(!btn12Used)this.btnCollect12.setEnabled(true);
        if(!btn13Used)this.btnCollect13.setEnabled(true);
        if(!btn14Used)this.btnCollect14.setEnabled(true);
        if(!btn15Used)this.btnCollect15.setEnabled(true);
        if(!btn16Used)this.btnCollect16.setEnabled(true);
        if(!btn17Used)this.btnCollect17.setEnabled(true);
    }

    private void initializeBoolValues(){
        this.btn1Used = false;
        this.btn2Used = false;
        this.btn3Used = false;
        this.btn4Used = false;
        this.btn5Used = false;
        this.btn6Used = false;
        this.btn7Used = false;
        this.btn8Used = false;
        this.btn9Used = false;
        this.btn10Used = false;
        this.btn11Used = false;
        this.btn12Used = false;
        this.btn13Used = false;
        this.btn14Used = false;
        this.btn15Used = false;
        this.btn16Used = false;
        this.btn17Used = false;
    }
    void saveData()
    {

        ArrayList<ArrayList<RFData>> tempArrayList = new ArrayList<ArrayList<RFData>>();
        tempArrayList.add(0,dataC1);
        tempArrayList.add(1,dataC2);
        tempArrayList.add(2,dataC3);
        tempArrayList.add(3,dataC4);
        tempArrayList.add(4,dataC5);
        tempArrayList.add(5,dataC6);
        tempArrayList.add(6,dataC7);
        tempArrayList.add(7,dataC8);
        tempArrayList.add(8,dataC9);
        tempArrayList.add(9,dataC10);
        tempArrayList.add(10,dataC11);
        tempArrayList.add(11,dataC12);
        tempArrayList.add(12,dataC13);
        tempArrayList.add(13,dataC14);
        tempArrayList.add(14,dataC15);
        tempArrayList.add(15,dataC16);
        tempArrayList.add(16,dataC17);


        try {


            String fullPath = Environment.getExternalStorageDirectory().getAbsolutePath();
            FileOutputStream outStream = new FileOutputStream(fullPath +"/rfdata.txt");
            ObjectOutputStream objectOutStream = new ObjectOutputStream(outStream);
            objectOutStream.writeInt(tempArrayList.size()); // Save size first


            for(int i=0; i<tempArrayList.size(); i++)
            {
                objectOutStream.writeBytes(" Cell Nr " + (i) + "\n");
                ArrayList<RFData> rfDataList = tempArrayList.get(i);
                for(int j=0; j<rfDataList.size(); j++)
                {
                    objectOutStream.writeBytes(rfDataList.get(j).toString() + "\n");
                }
            }
            objectOutStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
