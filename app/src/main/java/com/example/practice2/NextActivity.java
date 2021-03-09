package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Button b1 = (Button) findViewById(R.id.Button_get_next);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent get_info = getIntent();
                String data = get_info.getStringExtra("extra_data");
                Log.d("上一个活动传来的数据", data);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent get_info = getIntent();
        String data = get_info.getStringExtra("extra_data");
        Log.d("上一个活动传来的数据", data);
        finish();
    }
}