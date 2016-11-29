package com.example.final_report;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void onClick(View view){
        switch (view.getId()){
            case R.id.task:
                Intent intent1 = new Intent(this, TaskActivity.class);
                startActivity(intent1);

            case R.id.log:
                Intent intent2 = new Intent(this, LogActivity.class);
                startActivity(intent2);

            case  R.id.map:
                /*textView.setText("map");*/
                break;
            case R.id.report:
                Intent intentreport = new Intent(this,ReportActivity.class);
                startActivity(intentreport);

            case R.id.finish:
                finish();
                break;
        }
    }
}
