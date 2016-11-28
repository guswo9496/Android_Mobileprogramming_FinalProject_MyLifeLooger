package com.example.final_report;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        findViewById(R.id.logreport).setOnClickListener(L1ClickListener);
        findViewById(R.id.logmap).setOnClickListener(L1ClickListener);
        findViewById(R.id.logtask).setOnClickListener(L1ClickListener);
        findViewById(R.id.logfinfish).setOnClickListener(L1ClickListener);
    }
    Button.OnClickListener L1ClickListener = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.logtask:
                    break;
                case R.id.logmap:
                    break;
                case R.id.logreport:
                    break;
                case R.id.logfinfish:
                    break;
            }
        }
    };




}
