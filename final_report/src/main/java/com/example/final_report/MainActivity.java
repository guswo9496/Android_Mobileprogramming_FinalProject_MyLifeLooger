package com.example.final_report;

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
                break;
            case R.id.log:
                textView.setText("log");
                break;
            case  R.id.map:
                textView.setText("map");
                break;
            case R.id.report:
                textView.setText("report");
                break;
            case R.id.finish:

                break;
        }
    }
}
