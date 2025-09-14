package com.example.computerselling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        TextView registerRedirect = findViewById(R.id.twRegister);


    }
    public void registerPageRedirect(View view){
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }
    public void logIn(View view){
        EditText etUsername = findViewById(R.id.txtName);
        EditText etPassword = findViewById(R.id.txtPass);
        String username=etUsername.getText().toString().trim();
        String password=etPassword.getText().toString().trim();
        if (username.equals("admin") && password.equals("1234")) {

            // Gửi dữ liệu sang HomeActivity
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);

            // Đóng LoginActivity để khi bấm Back không quay lại màn hình đăng nhập
            finish();

        } else {
            Toast.makeText(this, "Sai tên đăng nhập hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
        }
    }
}