package com.cars.whereismycar.API.DB;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DBClass {
    private Cursor userCursor;
    private SQLiteDatabase db;
    private String geo;

    public String getGeo(Context context){
        DBHelper dbHelper = new DBHelper(context);

        db = dbHelper.getWritableDatabase();

        userCursor = db.query(DBHelper.TABLE_USER_VALUES, null, null, null, null, null, null);
        if (userCursor.moveToFirst()) {
            int HashIndex = userCursor.getColumnIndex(DBHelper.KEY_GEO);
            int ActiveIndex = userCursor.getColumnIndex(DBHelper.KEY_ACTIVE);
            do {
                if (userCursor.getInt(ActiveIndex) == 1) {
                    geo = userCursor.getString(HashIndex);
                }
            } while (userCursor.moveToNext());
        } else
            return "0 rows";

        userCursor.close();
        db.close();

        return geo;
    }
}
