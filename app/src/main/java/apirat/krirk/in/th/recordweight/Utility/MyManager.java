package apirat.krirk.in.th.recordweight.Utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by playn on 1/30/2018.
 */

public class MyManager {

    private Context context;
    private MyOpenHelperSQLite myOpenHelperSQLite;
    private SQLiteDatabase sqLiteDatabase;


    public  MyManager(Context context){
        this.context=context;

        myOpenHelperSQLite = new MyOpenHelperSQLite(context);
        sqLiteDatabase = myOpenHelperSQLite.getWritableDatabase();


    }// Constructor
}// Main Class
