package com.example.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void btn_click(View view){
        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText2);

        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("Click Status","You clicked me");
        Log.i("Username", usernameEditText.getText().toString());

        Log.i("Password", passwordEditText.getText().toString());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}