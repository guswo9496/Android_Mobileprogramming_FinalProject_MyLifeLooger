package com.example.final_report;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskActivity extends AppCompatActivity {
    TaskActivity taskActivity = this;
    EditText editText;
    Spinner spinner;
    TextView textViewSpinner_show;
    TextView textViewSpinner_show2;
   int time =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        editText = (EditText) findViewById(R.id.add_Task);
        findViewById(R.id.taskbottombutton_add).setOnClickListener(t1ClickListener);
        findViewById(R.id.taskbottombutton_Cancle).setOnClickListener(t1ClickListener);
        findViewById(R.id.tasklog).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskreport).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskmap).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskmain).setOnClickListener(t2ClickListener);
        findViewById(R.id.taskfinfish).setOnClickListener(t2ClickListener);
        textViewSpinner_show=(TextView)findViewById(R.id.task_spinner_ShowTextview);

        //스피너실행부
        final TextView tasktv =(TextView)findViewById(R.id.tasktextview1);
        spinner =(Spinner)findViewById(R.id.taskspinner1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int TaskIndex, long id) {
                tasktv.setText("Task List : ");
                switch (TaskIndex) {
                    case 0:
                        textViewSpinner_show.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 1:
                        textViewSpinner_show.setText(""+parent.getItemAtPosition(TaskIndex));
                        Intent stopwatch = new Intent(taskActivity,StopWatch.class);
                        startActivityForResult(stopwatch,time);
                        break;
                    case 2:
                        textViewSpinner_show.setText(""+parent.getItemAtPosition(TaskIndex));
                        Intent stopwatch1 = new Intent(taskActivity,StopWatch.class);
                        startActivityForResult(stopwatch1,time);
                        break;
                    case 3:
                        textViewSpinner_show.setText(""+parent.getItemAtPosition(TaskIndex));
                        Intent stopwatch2 = new Intent(taskActivity,StopWatch.class);
                        startActivityForResult(stopwatch2,time);
                        break;
                    case 4:
                        textViewSpinner_show.setText(""+parent.getItemAtPosition(TaskIndex));
                        Intent stopwatch3 = new Intent(taskActivity,StopWatch.class);
                        startActivityForResult(stopwatch3,time);
                        break;
                    case  5:
                        textViewSpinner_show.setText(""+parent.getItemAtPosition(TaskIndex));
                        Intent stopwatch4 = new Intent(taskActivity,StopWatch.class);
                        startActivityForResult(stopwatch4,time);
                        break;
                    case 6:
                        textViewSpinner_show.setText(""+parent.getItemAtPosition(TaskIndex));
                        Intent stopwatch5 = new Intent(taskActivity,StopWatch.class);
                        startActivityForResult(stopwatch5,time);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        textViewSpinner_show2 =(TextView)findViewById(R.id.task_spinner_ShowTextview2);
        final TextView tasktv2 =(TextView)findViewById(R.id.tasktextView2);
        spinner =(Spinner)findViewById(R.id.taskspinner2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int TaskIndex, long id) {
                tasktv2.setText("Task List : ");
                switch (TaskIndex) {
                    case 0:
                        textViewSpinner_show2.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 1:
                        textViewSpinner_show2.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 2:
                        textViewSpinner_show2.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 3:
                        textViewSpinner_show2.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 4:
                        textViewSpinner_show2.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case  5:
                        textViewSpinner_show2.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                    case 6:
                        textViewSpinner_show2.setText(""+parent.getItemAtPosition(TaskIndex));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode!=RESULT_OK){
            finish();
        }
        if(requestCode == RESULT_OK){
            String resultMsg = String.valueOf(data.getStringArrayExtra(String.valueOf(data)));
            textViewSpinner_show.setText(resultMsg);
        }
    }
        //임무추가버튼 실행부->스피너의arrays에 저장하나 저장구조는 tree
       /* ArrayList<String> entries = new ArrayList<String>(Arrays.asList(""));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.mr_chooser_list_item,entries);*/
        Button.OnClickListener t1ClickListener = new  View.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.taskbottombutton_add:
                    spinner.setAdapter(new SpinnerAdapter() {
                        @Override
                        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                            return null;
                        }

                        @Override
                        public void registerDataSetObserver(DataSetObserver dataSetObserver) {

                        }

                        @Override
                        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

                        }

                        @Override
                        public int getCount() {
                            return 0;
                        }

                        @Override
                        public Object getItem(int i) {
                            return null;
                        }

                        @Override
                        public long getItemId(int i) {
                            return 0;
                        }

                        @Override
                        public boolean hasStableIds() {
                            return false;
                        }

                        @Override
                        public View getView(int i, View view, ViewGroup viewGroup) {
                            return null;
                        }

                        @Override
                        public int getItemViewType(int i) {
                            return 0;
                        }

                        @Override
                        public int getViewTypeCount() {
                            return 0;
                        }

                        @Override
                        public boolean isEmpty() {
                            return false;
                        }
                    });
                    break;
                case R.id.taskbottombutton_Cancle:
                    break;
            }
        }
    };
    //task의 main 버튼 실행
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
                    Intent Task_maps = new Intent(taskActivity, MapsActivity.class);
                    startActivity(Task_maps);
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
