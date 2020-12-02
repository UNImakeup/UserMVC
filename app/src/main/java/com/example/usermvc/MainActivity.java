package com.example.usermvc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = findViewById(R.id.editTextTextPersonName);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        final User user = new User(MainActivity.this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setUser(name.getText().toString());
                Intent homeScreen = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(homeScreen);
            }
        });


    }
}