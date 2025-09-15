package com.example.computerselling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }
    public void homePage(View view){
        Intent intent = new Intent(ProfileActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
