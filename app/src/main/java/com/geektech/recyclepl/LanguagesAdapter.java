package com.geektech.recyclepl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LanguagesAdapter extends RecyclerView.Adapter<LanguagesAdapter.LanguagesViewHolder> {
    public ArrayList<String> data;

    public LanguagesAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public LanguagesAdapter.LanguagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LanguagesViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_languages, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LanguagesAdapter.LanguagesViewHolder holder, int position) {
holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class LanguagesViewHolder extends RecyclerView.ViewHolder {

        private TextView languages;

        public LanguagesViewHolder(@NonNull View itemView){
            super(itemView);
            languages = itemView.findViewById(R.id.languages);
        }

        public void bind(String s) {
            languages.setText(s);
        }
    }
}
