package com.example.downloadimage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private String url = "https://avatars.mds.yandex.net/get-zen_doc/196027/pub_5df2d3496f5f6f00ae722297_5df2e115027a1500b0ea03cc/scale_1200";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
    }

    public void onClickDownloadButton(View view) {
        DownloadImageTask downloadImageTask = new DownloadImageTask();

        try{
            Bitmap bitmap=downloadImageTask.execute(url).get();
            imageView.setImageBitmap(bitmap);
        }catch (Exception e){
            

        }
    }
}