package com.smartapps.Localization;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    private Button btnCollect1;
     private TextView txtviewwifi;
    private List<ScanResult> wifiList;
    private ArrayList<RFData> fingerprintingData;

    IntentFilter intentFilter = new IntentFilter();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnCollect1 = (Button) findViewById(R.id.btnScanC1);
        //txtWifi = (TextView) findViewById(R.id.txtviewwifi);

        btnCollect1.setOnClickListener(this);

        fingerprintingData  = new ArrayList<RFData>();
        intentFilter.addAction(WifiManager.RSSI_CHANGED_ACTION);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnScanC1:
                registerReceiver(myRssiChangeReceiver , intentFilter);

                break;
            //case R.id.btnstop:
            //    unregisterReceiver(myRssiChangeReceiver);
            //    break;

        }
    }

    private BroadcastReceiver myRssiChangeReceiver
            = new BroadcastReceiver(){

        @Override
        public void onReceive(Context arg0, Intent arg1) {
            // TODO Auto-generated method stub
            int rssi = 0;
            String  ssid = "";
            StringBuilder sb = new StringBuilder();
            int newRssi = arg1.getIntExtra(WifiManager.EXTRA_NEW_RSSI, 0);
            WifiManager w = (WifiManager) arg0.getSystemService(Context.WIFI_SERVICE);
            long timestamp = System.currentTimeMillis();
            wifiList = w.getScanResults(); // Returns a <list> of scanResults
            for(int i = 0; i < wifiList.size(); i++){
                sb.append(new Integer(fingerprintingData.size()).toString() + ".");
                sb.append((wifiList.get(i).SSID));
                sb.append((wifiList.get(i).level));
                sb.append("\n");
                ssid = wifiList.get(i).SSID;
                rssi = wifiList.get(i).level;

                RFData rfData = new RFData(timestamp,ssid,rssi);
                fingerprintingData.add(rfData);
                fingerprintingData.add(rfData);

            }
            StringBuilder lsttext =  new StringBuilder();
            lsttext.append(txtviewwifi.getText() + "\n" + sb);
            txtviewwifi.setText(lsttext);

        }};



}
