package com.example.listviewexample;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("cat",R.mipmap.cat ));
        animals.add(new Animal("dog",R.mipmap.dog ));
        animals.add(new Animal("scorpion",R.mipmap.scorpion));
        animals.add(new Animal("horse",R.mipmap.horse ));
        animals.add(new Animal("canary",R.mipmap.canary));

        final ListView listView = (ListView) findViewById(R.id.list_view);
        AnimalAdapter animalAdapter = new AnimalAdapter(this,animals);
        listView.setAdapter(animalAdapter);
    }
}