package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.resepmakanan.databinding.ActivityNavigationBarBinding;

public class NavigationBar extends AppCompatActivity {

    private ActivityNavigationBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_bar);

        binding =ActivityNavigationBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new Home());

        binding.Navigation.setOnItemReselectedListener(item -> {
            switch (item.getItemId()){
                case R.id.Home:
                    replaceFragment(new Home());
                    break;
                case R.id.Profil:
                    replaceFragment(new Profile());
                    break;
            }
        });

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.FrameLayout,fragment);
        fragmentTransaction.commit();
    }
}