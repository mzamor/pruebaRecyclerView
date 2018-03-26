package com.example.marian.pruebarecyclerview3;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v4.app.Fragment;


import com.example.marian.pruebarecyclerview3.fragments.ProfileFragment;
import com.example.marian.pruebarecyclerview3.fragments.SearchFragment;
import com.example.marian.pruebarecyclerview3.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.botNavView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedItem = null;
                switch (item.getItemId()) {
                    case R.id.item_home:
                        selectedItem = new HomeFragment();
                        break;
                    case R.id.item_profile:
                        selectedItem = new ProfileFragment();
                        break;
                    case R.id.item_search:
                        selectedItem = new SearchFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.container, selectedItem)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();

                return true;
            }
        });

    }
}