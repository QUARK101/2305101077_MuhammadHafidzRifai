package com.example.college_scheduler_main_modul_3;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(this,
                        getString(R.string.toast_gambar, position + 1),
                        Toast.LENGTH_SHORT).show());
    }
}