package com.example.final_report;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        findViewById(R.id.taskbottombutton1).setOnClickListener(t1ClickListener);
        findViewById(R.id.taskbottombutton2).setOnClickListener(t1ClickListener);


        findViewById(R.id.tasklog).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskreport).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskmap).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskmain).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskfinfish).setOnClickListener(t2ClickListener);

        /*findViewById(R.id.taskspinner1).setOnClickListener(t3ClickListener);*/

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
    Button.OnClickListener t2ClickListener =new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.tasklog:
                    Intent Task_intentLog = new Intent(TaskActivity.this, LogActivity.class);
                    startActivity(Task_intentLog);

                case  R.id.taskreport:
                    Intent Task_intentReport = new Intent(TaskActivity.this, TaskActivity.class);
                    startActivity(Task_intentReport);

                case  R.id.taskmap:
                   /* Intent Task_intentMap = new Intent(TaskActivity.this, MapsActivity.class);
                    startActivity(Task_intentMap);*/
                    break;
                case R.id.taskmain:
                    Intent Task_main = new Intent(TaskActivity.this, MainActivity.class);
                    startActivity(Task_main);
                case R.id.taskfinfish:
                    finish();
                    break;
            }
        }
    };
}
