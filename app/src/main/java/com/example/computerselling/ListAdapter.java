package com.example.computerselling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ListAdapter extends BaseAdapter {
    private final Context context;
    public ArrayList<PC> aPC;

    public ListAdapter(Context context, ArrayList<PC> aPC) {
        this.context = context;
        this.aPC=aPC;
    }

    @Override
    public int getCount() {
        return aPC.size();
    }

    @Override
    public Object getItem(int position) {
        return aPC.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.img);
        TextView pcName = convertView.findViewById(R.id.txt1);
        TextView price = convertView.findViewById(R.id.txt2);

        imageView.setImageResource(aPC.get(position).img);
        pcName.setText(aPC.get(position).name);
        price.setText(aPC.get(position).price);

        return convertView;
    }

}
