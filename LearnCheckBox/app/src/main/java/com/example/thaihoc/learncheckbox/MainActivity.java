package com.example.thaihoc.learncheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox chkAndroi, chkWP, chkIOS;
    Button btnChon;
    TextView txtMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addControl();
        addEvent();
    }

    private void addEvent() {
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyChonMonHoc();
            }
        });
    }

    private void xuLyChonMonHoc() {
        String s = "";
        if (chkAndroi.isChecked())
            s+=chkAndroi.getText().toString()+"\n";
        if (chkWP.isChecked())
            s+=chkWP.getText().toString() + "\n";
        if (chkIOS.isChecked())
            s+=chkIOS.getText().toString();

        txtMonHoc.setText(s);
    }

    private void addControl() {
        chkAndroi = (CheckBox) findViewById(R.id.chkAndroid);
        chkWP = (CheckBox) findViewById(R.id.chkWP);
        chkIOS = (CheckBox) findViewById(R.id.chkIOS);
        btnChon = (Button) findViewById(R.id.btnChon);
        txtMonHoc = (TextView) findViewById(R.id.txtMonhoc);
    }
}
