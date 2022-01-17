package com.example.a12_recyclerviewtoolbarscrolleffectjava.activivty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.a12_recyclerviewtoolbarscrolleffectjava.R;
import com.example.a12_recyclerviewtoolbarscrolleffectjava.adapter.CustomAdapter;
import com.example.a12_recyclerviewtoolbarscrolleffectjava.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        List<Member> members = prepareMember();
        refreshAdapter(members);
    }

    private void refreshAdapter(List<Member> members) {
        CustomAdapter adapter = new CustomAdapter(context, members);
        recyclerView.setAdapter(adapter);
    }

    private List<Member> prepareMember() {
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < 30; i++){
            members.add(new Member("Odilbek " + i, "+998-97-775-17-79"));
        }

        return members;
    }

    void initViews(){
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
    }
}