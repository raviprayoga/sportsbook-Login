package com.example.android.tubesSportsBook.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.tubesSportsBook.R;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        String Username = getIntent().getStringExtra("username");
        TextView txtview = findViewById(R.id.usertampil);
        txtview.setText(Username);
    }
}
