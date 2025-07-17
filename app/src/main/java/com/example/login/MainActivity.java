package com.example.login;

import android.os.Bundle
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText Username, Password;
        Button Login;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = findViewById(R.id.et1);
        Password = findViewById(R.id.et2);
        Login = findViewById(R.id.Button);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Objects.equals(Username.getText().toString(), "admin") &&
                        Objects.equals(Password.getText().toString(), "murali")) {
                    Toast.makeText(MainActivity.this, "Authentication Success", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}