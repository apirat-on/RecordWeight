package apirat.krirk.in.th.recordweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import apirat.krirk.in.th.recordweight.Utility.MyManager;

public class MainActivity extends AppCompatActivity {

    private MyManager myManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myManager = new MyManager(MainActivity.this);


    }
}
