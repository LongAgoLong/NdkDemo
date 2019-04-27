package com.leo.ndkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView testTv;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testTv = findViewById(R.id.testTv);
        testTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i % 2 == 0) {
                    testTv.setText(JniTestUtil.getHelloStr());
                } else {
                    testTv.setText(JniTestUtil.getHelloStr2());
                }
                i++;
            }
        });
    }
}
