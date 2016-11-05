package com.ljj.babycomingin100days.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri uri = Uri.parse("http://r1.ykimg.com/054104085274F02D6A0A40636C798A21");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
        if(draweeView!=null){//if without this as will warn you this may cau nullpointexpt//can you image this
            draweeView.setImageURI(uri);//unbilivable as
            //what is pull?
        }
        Log.d("ff","");
    }
}
