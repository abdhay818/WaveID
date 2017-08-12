package com.example.abdhay.mywaveid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.generateWave);
        final Button qRbtn = (Button) findViewById(R.id.generateQrCode);

        // Click Generate QR Button
        qRbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageView imageView = (ImageView) findViewById(R.id.imageQRCode);
                imageView.setVisibility(View.VISIBLE);
                // qRbtn.setVisibility(View.VISIBLE);
            }

                                 });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                imageView.setVisibility(View.VISIBLE);


                qRbtn.setVisibility(View.VISIBLE);
            }
        });


    }

}


