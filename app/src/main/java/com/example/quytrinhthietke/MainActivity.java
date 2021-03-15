package com.example.quytrinhthietke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtNoiDung; // biến toàn cục

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);wsq
        setContentView(R.layout.activity_main);

        // ánh xạ
        txtNoiDung = (TextView) findViewById(R.id.textview1);

        // viết code
        txtNoiDung.setText("lập trình android");

    }
}