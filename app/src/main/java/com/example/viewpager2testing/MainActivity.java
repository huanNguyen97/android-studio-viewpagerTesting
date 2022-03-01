package com.example.viewpager2testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiating ViewPager
        ViewPager viewPager = findViewById(R.id.viewPagery);

        // Setting the Adapter
        viewPager.setAdapter(new CustomPagerAdapter(this));
    }
}