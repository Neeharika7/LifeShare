package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.su).setOnClickListener(buttonClickListener);
        findViewById(R.id.cont).setOnClickListener(buttonClickListener);
        findViewById(R.id.login).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.su:
                    Intent intent = new Intent("com.microsoft.bvrith.lifeshare.SignUp");
                    startActivity(intent);
                    break;
                case R.id.login:
                    Intent intent1 = new Intent("com.microsoft.bvrith.lifeshare.Login");
                    startActivity(intent1);
                    break;
                case R.id.cont:
                    Intent intent2 = new Intent("com.microsoft.bvrith.lifeshare.guestlobb");
                    startActivity(intent2);
            }
        }
    };
}
