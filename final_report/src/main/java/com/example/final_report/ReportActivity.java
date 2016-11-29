package com.example.final_report;

import android.content.Intent;
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
        findViewById(R.id.reportmain).setOnClickListener(r2ClickListener);
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
                    Intent Report_intentT = new Intent(ReportActivity.this,TaskActivity.class);
                    startActivity(Report_intentT);
                case R.id.reportlog:
                    Intent Report_intentL = new Intent(ReportActivity.this,LogActivity.class);
                    startActivity(Report_intentL);
                case R.id.reportmap:
                    /*Intent Report_intentM = new Intent(ReportActivity.this,TaskActivity.class);
                    startActivity(Report_intentM);*/
                    break;
                case R.id.reportmain:
                    Intent Report_intentMain = new Intent(ReportActivity.this,MainActivity.class);
                    startActivity(Report_intentMain);
                case R.id.reportfinfish:
                    finish();
                    break;
            }
        }
    };
}
