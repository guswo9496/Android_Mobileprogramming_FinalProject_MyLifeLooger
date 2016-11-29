package com.example.final_report;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


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

    //main의main버튼 실행
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
                    moveTaskToBack(true);
                    finish();
                    android.os.Process.killProcess(android.os.Process.myPid());
                    break;
            }
        }
    };
}
