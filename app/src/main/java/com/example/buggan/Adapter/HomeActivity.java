package com.example.buggan.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.buggan.Model.model_items;
import com.example.buggan.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        RecyclerView recyclerView=findViewById(R.id.recycleView);
        ArrayList<model_items> list =new ArrayList<>();
        list.add(new model_items(R.drawable.img_1));
        list.add(new model_items(R.drawable.img_2));
        list.add(new model_items(R.drawable.img_3));
        list.add(new model_items(R.drawable.img_4));
        list.add(new model_items(R.drawable.img_5));
        list.add(new model_items(R.drawable.img_6));
        list.add(new model_items(R.drawable.img_7));
        list.add(new model_items(R.drawable.img_8));
        list.add(new model_items(R.drawable.img_9));
        list.add(new model_items(R.drawable.img_10));
        list.add(new model_items(R.drawable.img_11));
        list.add(new model_items(R.drawable.img_12));
        list.add(new model_items(R.drawable.img_13));
        list.add(new model_items(R.drawable.img_14));
        list.add(new model_items(R.drawable.img_15));
        list.add(new model_items(R.drawable.img_16));
        list.add(new model_items(R.drawable.img_17));
        list.add(new model_items(R.drawable.img_18));
        list.add(new model_items(R.drawable.img_19));
        list.add(new model_items(R.drawable.img_20));
        list.add(new model_items(R.drawable.img_21));
        list.add(new model_items(R.drawable.img_22));
        list.add(new model_items(R.drawable.img_23));
        list.add(new model_items(R.drawable.img_24));



        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(list, this);
        recyclerView.setAdapter(recyclerAdapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }
}