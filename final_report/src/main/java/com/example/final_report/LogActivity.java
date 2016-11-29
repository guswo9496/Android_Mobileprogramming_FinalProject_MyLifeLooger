package com.example.final_report;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class LogActivity extends AppCompatActivity {
    LogActivity logActivity = this;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        textView=(TextView)findViewById(R.id.logtextview1);

        //log의 스피너실행부
        final TextView logtv = (TextView)findViewById(R.id.logintenttexview);
        Spinner spinner = (Spinner)findViewById(R.id.logspinner1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int TaskIndex, long id) {
                logtv.setText("Log List : ");
                switch (TaskIndex) {
                    case 0:
                        textView.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 1:
                        textView.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 2:
                        textView.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 3:
                        textView.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 4:
                        textView.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 5:
                        textView.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 6:
                        textView.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        findViewById(R.id.logreport).setOnClickListener(L1ClickListener);
        findViewById(R.id.logmap).setOnClickListener(L1ClickListener);
        findViewById(R.id.logtask).setOnClickListener(L1ClickListener);
        findViewById(R.id.logfinfish).setOnClickListener(L1ClickListener);
        findViewById(R.id.logmain).setOnClickListener(L1ClickListener);
    }
    //log의 메인 버튼 실행
    Button.OnClickListener L1ClickListener = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.logtask:
                    Intent Log_intentT = new Intent(logActivity,TaskActivity.class);
                    startActivity(Log_intentT);
                    break;
                case R.id.logmap:
                    break;
                case R.id.logreport:
                    Intent Log_intentR = new Intent(logActivity,NewReportActivity.class);
                    startActivity(Log_intentR);
                    break;
                case R.id.logmain:
                    Intent Log_intentM = new Intent(logActivity,MainActivity.class);
                    startActivity(Log_intentM);
                    break;
                case R.id.logfinfish:
                    finish();
                    break;
            }
        }
    };

}
