package com.example.resepmakanan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resepmakanan.Adapter.AdapterMenuList;
import com.example.resepmakanan.Adapter.Menu;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    private RecyclerView recyclerView;
    private Menu menu;
    private List<Menu> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.RecycleView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        for (int i = 0; i < namaMenu.length; i++) {
            menu = new Menu(namaMenu[i],"","");
            list.add(menu);
        }
        recyclerView.setAdapter(new AdapterMenuList(getContext(),list));

        return view;
    }

    private String[] namaMenu = {
      "Nasi Goreng", "Ayam Bakar", "Bakso", "Sate", "Mie Ayam",
    };
}