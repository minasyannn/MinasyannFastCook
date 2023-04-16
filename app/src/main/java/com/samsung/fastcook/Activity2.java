package com.samsung.fastcook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Activity2 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_item1:
                        Intent intent1 = new Intent(Activity2.this, Activity2.class);
                        startActivity(intent1);
                        return true;
                    case R.id.navigation_item2:
                        Intent intent2 = new Intent(Activity2.this, FavPage.class);
                        startActivity(intent2);
                        return true;
                    case R.id.navigation_item3:
                        Intent intent3 = new Intent(Activity2.this, UserActivity.class);
                        startActivity(intent3);
                        return true;
                }
                return false;
            }
        });
    }
}