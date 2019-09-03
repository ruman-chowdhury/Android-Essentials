package com.example.user_pc.sqlitedatabasetest1;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by USER-PC on 7/28/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Information.db";
    private static final String TABLE_NAME = "info_tbl";
    private static final int VERSION_NUMBER = 1;

    private static final String ID = "_id";
    private static final String NAME = "Name";
    private static final String EMAIL = "Email";

    private static final String CREATE_TABLE = "CREATE TABLE " +TABLE_NAME+ "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + NAME + " text," + EMAIL + " text)";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " +TABLE_NAME;
    private static final String SELECT_ALL = "SELECT * FROM " +TABLE_NAME;


    private Context context;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DROP_TABLE);
        onCreate(db);
    }


    //insert data
    public void insert_data(TempData td){

        SQLiteDatabase sqd = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

       // cv.put(ID,td.getStdId());
        cv.put(NAME,td.getStdName());
        cv.put(EMAIL,td.getStdEmail());

        sqd.insert(TABLE_NAME, null, cv);
        sqd.close();

    }

    //Fetch data from db
    ArrayList<TempData> get_data(){

        SQLiteDatabase sqd = this.getReadableDatabase();
        Cursor cursor = sqd.rawQuery(SELECT_ALL,null);

        ArrayList<TempData> listData = new ArrayList<>();
        //cursor.moveToFirst();
        if(cursor.moveToFirst()) {
            do{
                TempData td = new TempData();
               // td.setStdId(cursor.getString(cursor.getColumnIndex(ID)));
                td.setStdName(cursor.getString(cursor.getColumnIndex(NAME)));
               td.setStdEmail(cursor.getString(cursor.getColumnIndex(EMAIL)));

                listData.add(td);
            }while (cursor.moveToNext());
        }
        cursor.close();
        sqd.close();
        return  listData;
    }


    //show data
    TempData show_data(int position){

        SQLiteDatabase sqd = this.getReadableDatabase();

        String VIEW_ALL ="SELECT * FROM "+TABLE_NAME+" WHERE "+ID+"= "+position;
        Cursor cursor = sqd.rawQuery(VIEW_ALL,null);
        TempData td = new TempData();

        cursor.moveToFirst();
        if(cursor.moveToFirst()) {
            do{

                td.setStdId(cursor.getString(cursor.getColumnIndex(ID)));
                td.setStdName(cursor.getString(cursor.getColumnIndex(NAME)));
                td.setStdEmail(cursor.getString(cursor.getColumnIndex(EMAIL)));

            }while (cursor.moveToNext());

        }
        cursor.close();
       return td;

    } //end method


} //end of dh