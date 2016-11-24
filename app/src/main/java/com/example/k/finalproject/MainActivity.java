package com.example.k.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
   TextView textView;
    /*Button taskbtn = (Button) findViewById(R.id.task);
    Button logbtn = (Button) findViewById(R.id.log);
    Button mapbtn = (Button) findViewById(R.id.map);
    Button reportbtn = (Button) findViewById(R.id.report);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.task:

                break;
            case R.id.log:
                textView.setText("log");
                break;
            case  R.id.map:
                textView.setText("map");
                break;
            case R.id.report:
                textView.setText("report");
                break;
        }
    }
}
