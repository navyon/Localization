package com.smartapps.Localization;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


/**
 * Created by Maryanne on 22-05-2014.
 */
public class RssiDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 3; //update when changing

    public static final String COLUMN_ID="_id";
    private static final String DATABASE_NAME = "rssivalues.db";

    //Table names
    public static final String TABLE_C1_TEST = "Cell1";
    public static final String TABLE_C2_TEST = "Cell2";
    public static final String TABLE_C3_TEST = "Cell3";
    public static final String TABLE_C4_TEST = "Cell4";
    public static final String TABLE_C5_TEST = "Cell5";
    public static final String TABLE_C6_TEST = "Cell6";
    public static final String TABLE_C7_TEST = "Cell7";
    public static final String TABLE_C8_TEST = "Cell8";
    public static final String TABLE_C9_TEST = "Cell9";
    public static final String TABLE_C10_TEST = "Cell10";
    public static final String TABLE_C11_TEST = "Cell11";
    public static final String TABLE_C12_TEST = "Cell12";
    public static final String TABLE_C13_TEST = "Cell13";
    public static final String TABLE_C14_TEST = "Cell14";
    public static final String TABLE_C15_TEST = "Cell15";
    public static final String TABLE_C16_TEST = "Cell16";
    public static final String TABLE_C17_TEST = "Cell17";

    public static final String TABLE_MAC_VALUES = "MACV";


    public static final String TABLE_C1_TRAINING = "TrainCell1";
    public static final String TABLE_C2_TRAINING = "TrainCell2";
    public static final String TABLE_C3_TRAINING = "TrainCell3";
    public static final String TABLE_C4_TRAINING = "TrainCell4";
    public static final String TABLE_C5_TRAINING = "TrainCell5";
    public static final String TABLE_C6_TRAINING = "TrainCell6";
    public static final String TABLE_C7_TRAINING = "TrainCell7";
    public static final String TABLE_C8_TRAINING = "TrainCell8";
    public static final String TABLE_C9_TRAINING = "TrainCell9";
    public static final String TABLE_C10_TRAINING = "TrainCell10";
    public static final String TABLE_C11_TRAINING = "TrainCell11";
    public static final String TABLE_C12_TRAINING = "TrainCell12";
    public static final String TABLE_C13_TRAINING = "TrainCell13";
    public static final String TABLE_C14_TRAINING = "TrainCell14";
    public static final String TABLE_C15_TRAINING = "TrainCell15";
    public static final String TABLE_C16_TRAINING = "TrainCell16";
    public static final String TABLE_C17_TRAINING = "TrainCell17";


    //Atributtes
    public static final String RSSI_VALUE = "rssiVal";
    public static final String SSID_VALUE = "ssidVal";
    public static final String QUANTITY = "quantVal";


    //Instructions to create tables

    private static final String CREATE_ALL_MAC_VALUES =
            "create table "+ TABLE_MAC_VALUES + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null);";


    /*************************************************************************
     *****************************    TESTING   ******************************
     *************************************************************************/

    private static final String C1_CREATE_TEST =
            "create table "+ TABLE_C1_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";


    private static final String C2_CREATE_TEST =
            "create table "+ TABLE_C2_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C3_CREATE_TEST =
            "create table "+ TABLE_C3_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C4_CREATE_TEST =
            "create table "+ TABLE_C4_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C5_CREATE_TEST =
            "create table "+ TABLE_C5_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C6_CREATE_TEST =
            "create table "+ TABLE_C6_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C7_CREATE_TEST =
            "create table "+ TABLE_C7_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C8_CREATE_TEST =
            "create table "+ TABLE_C8_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C9_CREATE_TEST =
            "create table "+ TABLE_C9_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C10_CREATE_TEST =
            "create table "+ TABLE_C10_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C11_CREATE_TEST =
            "create table "+ TABLE_C11_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C12_CREATE_TEST =
            "create table "+ TABLE_C12_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C13_CREATE_TEST =
            "create table "+ TABLE_C13_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C14_CREATE_TEST =
            "create table "+ TABLE_C14_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C15_CREATE_TEST =
            "create table "+ TABLE_C15_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C16_CREATE_TEST =
            "create table "+ TABLE_C16_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C17_CREATE_TEST =
            "create table "+ TABLE_C17_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";


    /*************************************************************************
     ****************************     TRAINING   *****************************
     *************************************************************************/


    private static final String C1_CREATE_TRAINING =
            "create table "+ TABLE_C1_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C2_CREATE_TRAINING =
            "create table "+ TABLE_C2_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C3_CREATE_TRAINING =
            "create table "+ TABLE_C3_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C4_CREATE_TRAINING =
            "create table "+ TABLE_C4_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C5_CREATE_TRAINING =
            "create table "+ TABLE_C5_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C6_CREATE_TRAINING =
            "create table "+ TABLE_C6_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C7_CREATE_TRAINING =
            "create table "+ TABLE_C7_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C8_CREATE_TRAINING =
            "create table "+ TABLE_C8_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C9_CREATE_TRAINING =
            "create table "+ TABLE_C9_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C10_CREATE_TRAINING =
            "create table "+ TABLE_C10_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C11_CREATE_TRAINING =
            "create table "+ TABLE_C11_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C12_CREATE_TRAINING =
            "create table "+ TABLE_C12_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C13_CREATE_TRAINING =
            "create table "+ TABLE_C13_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C14_CREATE_TRAINING =
            "create table "+ TABLE_C14_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C15_CREATE_TRAINING =
            "create table "+ TABLE_C15_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C16_CREATE_TRAINING =
            "create table "+ TABLE_C16_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C17_CREATE_TRAINING =
            "create table "+ TABLE_C17_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    QUANTITY + " integer not null, "+
                    "foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";





    /*************************************************************************
     *****************************   Le début   ******************************
     *************************************************************************/

    public RssiDB(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    /*
     * Creates all tables
    */
    public void onCreate(SQLiteDatabase database) {

        database.execSQL(C1_CREATE_TEST);
        database.execSQL(C2_CREATE_TEST);
        database.execSQL(C3_CREATE_TEST);
        database.execSQL(C4_CREATE_TEST);
        database.execSQL(C5_CREATE_TEST);
        database.execSQL(C6_CREATE_TEST);
        database.execSQL(C7_CREATE_TEST);
        database.execSQL(C8_CREATE_TEST);
        database.execSQL(C9_CREATE_TEST);
        database.execSQL(C10_CREATE_TEST);
        database.execSQL(C11_CREATE_TEST);
        database.execSQL(C12_CREATE_TEST);
        database.execSQL(C13_CREATE_TEST);
        database.execSQL(C14_CREATE_TEST);
        database.execSQL(C15_CREATE_TEST);
        database.execSQL(C16_CREATE_TEST);
        database.execSQL(C17_CREATE_TEST);

        database.execSQL(CREATE_ALL_MAC_VALUES);

        database.execSQL(C1_CREATE_TRAINING);
        database.execSQL(C2_CREATE_TRAINING);
        database.execSQL(C3_CREATE_TRAINING);
        database.execSQL(C4_CREATE_TRAINING);
        database.execSQL(C5_CREATE_TRAINING);
        database.execSQL(C6_CREATE_TRAINING);
        database.execSQL(C7_CREATE_TRAINING);
        database.execSQL(C8_CREATE_TRAINING);
        database.execSQL(C9_CREATE_TRAINING);
        database.execSQL(C10_CREATE_TRAINING);
        database.execSQL(C11_CREATE_TRAINING);
        database.execSQL(C12_CREATE_TRAINING);
        database.execSQL(C13_CREATE_TRAINING);
        database.execSQL(C14_CREATE_TRAINING);
        database.execSQL(C15_CREATE_TRAINING);
        database.execSQL(C16_CREATE_TRAINING);
        database.execSQL(C17_CREATE_TRAINING);
        insertData(database);

    }




    /*
     * Drops all tables and create new ones
     */
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        Log.w(RssiDB.class.getName(),
                "Upgrading database from version "+ oldVersion + " to " + newVersion + ", which will destroy all old data");

        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C1_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C2_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C3_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C4_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C5_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C6_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C7_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C8_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C9_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C10_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C11_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C12_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C13_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C14_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C15_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C16_TEST);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C17_TEST);

        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_MAC_VALUES);

        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C1_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C2_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C3_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C4_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C5_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C6_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C7_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C8_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C9_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C10_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C11_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C12_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C13_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C14_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C15_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C16_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C17_TRAINING);

        onCreate(db);

    }





    private void insertData(SQLiteDatabase db){

        ContentValues values = new ContentValues();

        /*
                -40	 1c:aa:07:7b:28:06
                -67	 1c:aa:07:7b:37:d6
                -42	 1c:aa:07:7b:28:04
                -79	 00:1b:90:76:ce:14
                -79	 00:1b:90:76:ce:14
                -79	 00:1b:90:76:ce:14
                */
        values.put(RssiDB.RSSI_VALUE, "-67");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-42");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-83");
        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();



        /******************************************************************************/
        /*****************************   MAC IDs   ************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d4");
        //db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        //values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d0");
        //db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        //values = new ContentValues();

        //values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:16");
        //db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        //values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:13");
        //db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        //values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:10");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:06");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();



        /******************************************************************************/
        /******************************************************************************/
        /*****************************    CELL 1   ************************************/
        /******************************************************************************/
        /******************************************************************************/
        /* 00:0e:a6:27:4d:fb */
        values.put(RssiDB.RSSI_VALUE, "-89");
        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-88");
        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.QUANTITY, "9");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-83");
        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.QUANTITY, "9");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-91");
        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();
        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-49");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-41");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.QUANTITY, "10");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-40");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.QUANTITY, "7");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-45");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.QUANTITY, "2");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-49");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-41");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.QUANTITY, "9");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-46");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-76");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-68");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "9");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-67");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "7");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-74");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "2");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-59");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-50");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:046");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-42");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:046");
        values.put(RssiDB.QUANTITY, "17");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();
        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-79");
        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        values.put(RssiDB.QUANTITY, "9");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();
        /******************************************************************************/


        values.put(RssiDB.RSSI_VALUE, "-45");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);

        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 2  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-97");
        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-41");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.QUANTITY, "4");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-44");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-42");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-37");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-43");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-39");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-70");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-69");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-72");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "2");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();


        values.put(RssiDB.RSSI_VALUE, "-76");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-65");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-68");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        /******************************************************************************/


        values.put(RssiDB.RSSI_VALUE, "-89");
        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-91");
        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-92");
        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.QUANTITY, "2");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-41");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-39");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-44");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-45");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-35");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.QUANTITY, "2");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-40");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-44");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.QUANTITY, "3");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();
        values.put(RssiDB.RSSI_VALUE, "-43");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();
        values.put(RssiDB.RSSI_VALUE, "-38");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();
        values.put(RssiDB.RSSI_VALUE, "-42");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.QUANTITY, "2");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-40");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.QUANTITY, "1");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        /******************************************************************************/

        values.put(RssiDB.RSSI_VALUE, "-43");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.QUANTITY, "2");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-47");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.QUANTITY, "2");
        db.insert(RssiDB.TABLE_C2_TEST, null, values);

        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 3  ************************************/
        /******************************************************************************/
        /******************************************************************************/


        /**


         */

        /**


         */

        /**


         */







    }

}

