package com.example.college_scheduler_main_modul_4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate dipanggil");

        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(this,
                        getString(R.string.toast_item, position + 1),
                        Toast.LENGTH_SHORT).show());
    }

    // ===== Menu =====
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_second) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu_about) {
            Toast.makeText(this, R.string.toast_about, Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // ===== Siklus hidup activity =====
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart dipanggil");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume dipanggil");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause dipanggil");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop dipanggil");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart dipanggil");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy dipanggil");
    }
}