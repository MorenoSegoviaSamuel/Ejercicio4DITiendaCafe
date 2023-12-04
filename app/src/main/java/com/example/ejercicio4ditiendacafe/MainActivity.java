package com.example.ejercicio4ditiendacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       List<Integer> images = Arrays.asList(
                R.drawable.images,
                R.drawable.images1,
                R.drawable.images2,
                R.drawable.images3,
                R.drawable.images4,
                R.drawable.images5,
                R.drawable.images6
        );
        List<String> names = Arrays.asList(
                "Restaurant 1",
                "Restaurant 2",
                "Restaurant 3",
                "Restaurant 4",
                "Restaurant 5",
                "Restaurant 6",
                "Restaurant 7"
        );
        List<String> locations = Arrays.asList(
                "Location 1",
                "Location 2",
                "Location 3",
                "Location 4",
                "Location 5",
                "Location 6",
                "Location 7"
        );
        final List<Float> ratings = Arrays.asList(1f, 2f, 3f, 3.5f, 4f, 4.5f, 5f);
    }

}