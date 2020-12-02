package com.example.usermvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView welcomeMessage = findViewById(R.id.welcome);
        Button logout = findViewById(R.id.logoutButton);
        final User user = new User(this);

        welcomeMessage.setText(user.getUser());

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.logOut();
                welcomeMessage.setText(user.getUser());
            }
        });
    }
}