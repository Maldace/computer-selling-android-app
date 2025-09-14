package com.example.computerselling;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        String username = getIntent().getStringExtra("username");
        TextView textView = findViewById(R.id.txtHi);
        textView.setText("Xin chào "+username);
    }
}
