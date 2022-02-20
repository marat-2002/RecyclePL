package com.geektech.recyclepl;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MainFragment extends Fragment {
private RecyclerView recyclerView;
private LanguagesAdapter languagesAdapter;
private ArrayList<String> languages;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler);
        languagesAdapter = new LanguagesAdapter(languages);
        recyclerView.setAdapter(languagesAdapter);

    }

    private void loadData() {
        languages = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
           languages.add("Python" + i);
        }
    }

}