package com.example.thaihoc.learnimagebuttonandview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton radHinhNha, radHinhNguoi;
    ImageView imgHinh;
    ImageButton btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }

    private void addEvent() {
        radHinhNguoi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    imgHinh.setImageResource(R.drawable.nguoi);//lay hinh anh tu drawable
                }
            }
        });
        radHinhNha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    imgHinh.setImageResource(R.drawable.nha);//lay hinh anh tu drawable
                }
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void addControl() {
        radHinhNguoi = (RadioButton) findViewById(R.id.radHinhNguoi);
        radHinhNha = (RadioButton) findViewById(R.id.radHinhNha);
        imgHinh = (ImageView) findViewById(R.id.imgHinh);
        btnThoat = (ImageButton) findViewById(R.id.btnThoat);
    }
}
