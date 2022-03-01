package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    TextView txtMsg;
    ListView lvInfo;
    ArrayList<Info> list;
    infoAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMsg = findViewById(R.id.txtMsg);
        lvInfo = findViewById(R.id.lvInfo);


        list = new ArrayList<>();

        list.add(new Info("Nguyễn Văn A","0912312389",R.drawable.ic_launcher_foreground));
        list.add(new Info("Nguyễn Văn B","0234879239",R.drawable.ic_launcher_foreground));
        list.add(new Info("Nguyễn Văn C","0912234129",R.drawable.ic_launcher_foreground));
        list.add(new Info("Nguyễn Văn D","0909183209",R.drawable.ic_launcher_foreground));
        list.add(new Info("Nguyễn Văn E","0198234098",R.drawable.ic_launcher_foreground));
        list.add(new Info("Nguyễn Văn F","0813290489",R.drawable.ic_launcher_foreground));



        System.out.println(list);

        adapter = new infoAdapter(MainActivity.this,R.layout.object_layout,list);

        lvInfo.setAdapter(adapter);


        lvInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtMsg.setText("You Choose : "+list.get(position).getTen());
            }
        });
    }
}