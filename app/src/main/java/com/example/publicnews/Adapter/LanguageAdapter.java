package com.example.publicnews.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import com.example.publicnews.Model.Language;
import com.example.publicnews.R;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.viewholder> {

    private List<Language> languageList;

    public LanguageAdapter(List<Language> languageList) {
        this.languageList = languageList;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.languages_item,parent,false);
        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
          holder.textView.setText(languageList.get(position).getLanguageName());
    }

    @Override
    public int getItemCount() {
        return languageList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        private TextView textView;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.languageText);
        }
    }
}
