package com.example.final_report;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class TaskActivity extends AppCompatActivity {
    TaskActivity taskActivity = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

      final TextView tasktv =(TextView)findViewById(R.id.tasktextview1);
        Spinner spinner =(Spinner)findViewById(R.id.taskspinner1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int TaskIndex, long id) {
                tasktv.setText("Task List : ");
                switch (TaskIndex) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                    case  5:

                        break;

                    case 6:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        findViewById(R.id.taskbottombutton1).setOnClickListener(t1ClickListener);
        findViewById(R.id.taskbottombutton2).setOnClickListener(t1ClickListener);
        findViewById(R.id.tasklog).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskreport).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskmap).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskmain).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskfinfish).setOnClickListener(t2ClickListener);
        }
        Button.OnClickListener t1ClickListener = new  View.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.taskbottombutton1:
                    break;
                case R.id.taskbottombutton2:
                    break;
            }
        }
    };
    Button.OnClickListener t2ClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.tasklog:
                    Intent Task_intentLog = new Intent(taskActivity, LogActivity.class);
                    startActivity(Task_intentLog);
                    break;
                case  R.id.taskreport:
                    Intent Task_intentReport = new Intent(taskActivity, NewReportActivity.class);
                    startActivity(Task_intentReport);
                    break;
                case  R.id.taskmap:
                    break;
                case R.id.taskmain:
                    Intent Task_main = new Intent(taskActivity, MainActivity.class);
                    startActivity(Task_main);
                case R.id.taskfinfish:
                    finish();
                    break;
            }
        }
    };
}
