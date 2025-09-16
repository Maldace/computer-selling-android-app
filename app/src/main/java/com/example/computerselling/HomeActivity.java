package com.example.computerselling;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ArrayList<PC> aPC;
    //    ListView listView;
    GridView gridView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        String username = getIntent().getStringExtra("username");
        TextView textView = findViewById(R.id.txtHi);
        textView.setText("Xin chào "+username);

        gridView = findViewById(R.id.grid_view);
        aPC=new ArrayList<>();
        aPC.add(new PC("ASUS V500MV i5","15.290.000", R.drawable.asus_v500mv_i5));
        aPC.add(new PC("SingPC AIO i5","13.590.000", R.drawable.singpc_aio_m24ei5128m5_w_i5));
        aPC.add(new PC("Acer Nitro V 15 ","19.490.000", R.drawable.acer_nitro_v_15));
        aPC.add(new PC("Logitech G102","410.000", R.drawable.wiremouse_logitech_g102));
        aPC.add(new PC("Asus ROG Azoth","5.950.000", R.drawable.asus_rog_azoth_wireless_key));
        aPC.add(new PC("Enkor S2880","1.500.000", R.drawable.speaker_enkor_s2880));
        ListAdapter adapter = new ListAdapter(this, aPC);
        gridView.setAdapter(adapter);
    }
}
