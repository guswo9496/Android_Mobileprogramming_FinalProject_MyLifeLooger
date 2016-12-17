package com.example.final_report;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {

  Button button;
  ImageView imageView = null;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);


    findViewById(R.id.carmere_btn_preciew).setOnClickListener(mainClickListener);

    setup();
  }

  Button.OnClickListener mainClickListener = new View.OnClickListener() {

    @Override
    public void onClick(View view) {
      switch (view.getId()) {
        case R.id.carmere_btn_preciew:
          finish();
          break;
      }
    }
  };


  private void setup() {
    button = (Button) findViewById(R.id.carmerebtn);
    imageView = (ImageView) findViewById(R.id.ImageView1);

    button.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 1);
      }
    });
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    imageView.setImageURI(data.getData());
  }
}

