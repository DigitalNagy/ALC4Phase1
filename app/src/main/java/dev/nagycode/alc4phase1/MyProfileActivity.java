package dev.nagycode.alc4phase1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_my_profile);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("My Profile");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}