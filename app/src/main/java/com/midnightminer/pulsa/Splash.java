package com.midnightminer.pulsa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    SharedPreferences prefs = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        prefs = getSharedPreferences("com.mycompany.myAppName", MODE_PRIVATE);

        /*new Timer().schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        Intent Opening = new Intent(Splash.this, MainActivity.class);
                        startActivity(Opening);
                        finish();
                    }
                },
                3000
        );*/
    }
    @Override
    protected void onResume() {
        super.onResume();

        if (prefs.getBoolean("firstrun", true)) {
            Intent Opening = new Intent(Splash.this, MainActivity.class);
            startActivity(Opening);
            finish();
            prefs.edit().putBoolean("firstrun", false).commit();
        }else{
            Intent Opening = new Intent(Splash.this, Transaksi.class);
            startActivity(Opening);
            finish();
        }
    }

}
