package com.example.final_report;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MainActivity mainActivity = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_task_btn).setOnClickListener(mainClickListener);
        findViewById(R.id.main_log_btn).setOnClickListener(mainClickListener);
        findViewById(R.id.main_map_btn).setOnClickListener(mainClickListener);
        findViewById(R.id.main_report_btn).setOnClickListener(mainClickListener);
        findViewById(R.id.main_finish_btn).setOnClickListener(mainClickListener);
    }

    Button.OnClickListener mainClickListener = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.main_task_btn:
                    Intent main_Task_Intent = new Intent(mainActivity,TaskActivity.class);
                    startActivity(main_Task_Intent);
                    break;
                case R.id.main_log_btn:
                    Intent main_Log_Intent = new Intent(mainActivity,LogActivity.class);
                    startActivity(main_Log_Intent);
                    break;
                case R.id.main_map_btn:
                    break;

                case R.id.main_report_btn:
                    Intent main_Report_Intent = new Intent(mainActivity,NewReportActivity.class);
                    startActivity(main_Report_Intent);
                    break;
                case R.id.main_finish_btn:
                    finish();
                    break;
            }
        }
    };
    /*public void onClick(View view){
        switch (view.getId()){
            case R.id.task:
                Intent intent1 = new Intent(MainActivity.this, TaskActivity.class);
                startActivity(intent1);

            case R.id.log:
                Intent intent2 = new Intent(MainActivity.this, LogActivity.class);
                startActivity(intent2);

            case  R.id.map:
                *//*textView.setText("map");*//*
                break;
            case R.id.report:
                Intent intentreport = new Intent(MainActivity.this,ReportActivity.class);
                startActivity(intentreport);

            case R.id.finish:
                finish();
                break;
        }
    }*/
}
