package com.example.publicnews.AllActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.publicnews.Adapter.LanguageAdapter;
import com.example.publicnews.Model.Language;
import com.example.publicnews.R;

import java.util.ArrayList;
import java.util.List;

public class ChooseLanguageActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LanguageAdapter adapter;
    private List<Language> languageList;
    private CardView submitBtncard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        
        recyclerView = findViewById(R.id.languageListRecyclerView);
        submitBtncard = findViewById(R.id.submitCardBtn);


        loadData();

        submitBtncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseLanguageActivity.this,MainActivity.class));
            }
        });


    }

    private void loadData() {
        languageList = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        languageList.add(new Language("Marathi"));
        languageList.add(new Language("Hindi"));
        languageList.add(new Language("English"));

        adapter = new LanguageAdapter(languageList);
        recyclerView.setAdapter(adapter);

    }
}