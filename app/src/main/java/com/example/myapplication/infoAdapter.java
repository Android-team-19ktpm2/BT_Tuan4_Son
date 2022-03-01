package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class infoAdapter extends ArrayAdapter<Info> {

    private Activity context;
    private int resource ;
    private List<Info> objects;



    public infoAdapter(@NonNull Activity context, int resource, @NonNull List<Info> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View row = layoutInflater.inflate(this.resource,null);

        TextView txtTen = row.findViewById(R.id.txtTen);
        TextView txtTel = row.findViewById(R.id.txtSDT);
        ImageView img = row.findViewById(R.id.img);


        Info info = objects.get(position);
        txtTen.setText(info.getTen());
        txtTel.setText(info.getTel());
        img.setImageResource(info.getImg());



        return row;




    }
}
