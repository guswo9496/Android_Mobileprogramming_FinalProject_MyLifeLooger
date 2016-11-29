package com.example.final_report;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class NewReportActivity extends AppCompatActivity {
    NewReportActivity newReportActivity = this;
    TextView textView;
    TextView reporttv;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_report);
        textView=(TextView)findViewById(R.id.reportTextview1);
        reporttv = (TextView) findViewById(R.id.goalview);
        spinner = (Spinner)findViewById(R.id.reportspinner1);
        //스피너 실행부
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int TaskIndex, long id) {
                reporttv.setText("Report List : ");
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
                    case  4:
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



        findViewById(R.id.reporttask).setOnClickListener(r2ClickListener);
        findViewById(R.id.reportlog).setOnClickListener(r2ClickListener);
        findViewById(R.id.reportmap).setOnClickListener(r2ClickListener);
        findViewById(R.id.reportmain).setOnClickListener(r2ClickListener);
        findViewById(R.id.reportfinfish).setOnClickListener(r2ClickListener);
    }
    //버튼 실행부
    Button.OnClickListener r2ClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.reporttask:
                    Intent Report_intentT = new Intent(newReportActivity,TaskActivity.class);
                    startActivity(Report_intentT);
                    break;
                case R.id.reportlog:
                    Intent Report_intentL = new Intent(newReportActivity,LogActivity.class);
                    startActivity(Report_intentL);
                    break;
                case R.id.reportmap:
                    break;
                case R.id.reportmain:
                    Intent Report_intentMain = new Intent(newReportActivity,MainActivity.class);
                    startActivity(Report_intentMain);
                    break;
                case R.id.reportfinfish:
                    finish();
                    break;
            }
        }
    };
}
