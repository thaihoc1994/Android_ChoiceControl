package com.example.thaihoc.learnradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radRatTuyetVoi, radTuyetVoi, radChapNhan, radKhongTot;
    Button btnBinhChon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adControl();
        addEvent();
    }

    private void addEvent() {
        btnBinhChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyBinhChon();
            }
        });
    }

    private void xuLyBinhChon() {
        String s = "";
        if (radRatTuyetVoi.isChecked())
            s = radRatTuyetVoi.getText().toString();
        else if (radTuyetVoi.isChecked())
            s = radTuyetVoi.getText().toString();
        else if (radChapNhan.isChecked())
            s = radChapNhan.getText().toString();
        else if (radKhongTot.isChecked())
            s = radKhongTot.getText().toString();
        Toast.makeText(MainActivity.this,"Bạn chọn: " + s, Toast.LENGTH_SHORT).show();
    }

    private void adControl() {
        radRatTuyetVoi = (RadioButton) findViewById(R.id.radRatTuyetVoi);
        radTuyetVoi = (RadioButton) findViewById(R.id.radTuyetVoi);
        radKhongTot = (RadioButton) findViewById(R.id.radKhongTot);
        radChapNhan = (RadioButton) findViewById(R.id.radTamChapNhan);

        btnBinhChon = (Button) findViewById(R.id.btnBinhChon);
    }
}
