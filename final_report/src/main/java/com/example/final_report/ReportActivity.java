package com.example.final_report;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        findViewById(R.id.reportspinner1).setOnClickListener(aClickListener);

        findViewById(R.id.reporttask).setOnClickListener(r2ClickListener);
        findViewById(R.id.reportlog).setOnClickListener(r2ClickListener);
        findViewById(R.id.reportmap).setOnClickListener(r2ClickListener);
        findViewById(R.id.reportfinfish).setOnClickListener(r2ClickListener);
    }
    Spinner.OnClickListener aClickListener = new  View.OnClickListener(){

        @Override
        public void onClick(View view) {
            textView = (TextView)findViewById(R.id.reportTextview1);
        }
    };
    Button.OnClickListener r2ClickListener = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.reportspinner1:
                    break;
                case R.id.reporttask:
                    break;
                case R.id.reportlog:
                    break;
                case R.id.reportmap:
                    break;
                case R.id.reportfinfish:
                    break;
            }
        }
    };
}
