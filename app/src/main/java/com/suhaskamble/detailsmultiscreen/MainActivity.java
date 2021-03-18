package com.suhaskamble.detailsmultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String DETAIL = "com.suhaskamble.detailsmultiscreen.DETAIL";
    EditText name;
    EditText email;
    EditText phone;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        button = findViewById(R.id.button);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String nameVal = name.getText().toString();
//                String emailVal = email.getText().toString();
//                String phoneVal = phone.getText().toString();
//                String message = nameVal +" " + emailVal +" "+ phoneVal;
//                Intent intent = new Intent(getBaseContext(),DetailActivity.class);
//                intent.putExtra(DETAIL,message);
//
//                startActivity(intent);
//            }
//        });
    }

    public void sendDetail(View view){
        String nameVal = name.getText().toString();
        String emailVal = email.getText().toString();
        String phoneVal = phone.getText().toString();
        String message = nameVal +" " + emailVal +" "+ phoneVal;
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra(DETAIL,message);

        startActivity(intent);
    }
}