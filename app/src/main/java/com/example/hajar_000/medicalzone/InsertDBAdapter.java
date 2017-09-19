package com.example.hajar_000.medicalzone;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by hajar_000 on 3/9/2017.
 */

public class InsertDBAdapter {
    SQLiteDatabase database;

    public InsertDBAdapter(Context context) {
        InsertDBOpenHelper openHelper = new InsertDBOpenHelper(context);
        database = openHelper.getWritableDatabase();
    }

    public void closeConnection(){
        database.close();
    }
    public long insertValues(String uploadpost) {
        ContentValues values = new ContentValues();
        values.put("uploadpost", uploadpost);

        return database.insert(InsertDBOpenHelper.SAMPLE_TABLE_NAME, null, values);
    }
    public Cursor getAllValues(){
        return database.rawQuery("select * from sample_table", null);
    }

}

