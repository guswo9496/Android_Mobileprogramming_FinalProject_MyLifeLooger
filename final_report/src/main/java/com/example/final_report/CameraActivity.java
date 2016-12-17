package com.example.final_report;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {

  Button btn;
  ImageView iv = null;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);
    findViewById(R.id.carmere_btn_preciew).setOnClickListener(mainClickListener);
    setup();
  }
  private void setup()
  {
    btn = (Button)findViewById(R.id.btn);
    iv = (ImageView)findViewById(R.id.iv);
    btn.setOnClickListener(new View.OnClickListener()
    {
      @Override
      public void onClick(View v)
      {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
      }
    });
  }
  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data)
  {
    iv.setImageURI(data.getData());
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
}

