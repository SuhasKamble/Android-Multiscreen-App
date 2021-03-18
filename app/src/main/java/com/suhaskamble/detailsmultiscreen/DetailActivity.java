package com.suhaskamble.detailsmultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textView = findViewById(R.id.textVal);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.DETAIL);
        textView.setText(message);
    }
}