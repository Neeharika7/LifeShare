package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);
        defineButtons();
    }
    public void defineButtons() {
        findViewById(R.id.listofbloodbanks).setOnClickListener(buttonClickListener);
        findViewById(R.id.findblood).setOnClickListener(buttonClickListener);
        findViewById(R.id.requests).setOnClickListener(buttonClickListener);
        findViewById(R.id.becomedonor).setOnClickListener(buttonClickListener);
    }
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.listofbloodbanks:
                    Intent intent = new Intent("com.microsoft.bvrith.lifeshare.listofbloodbanks");
                    startActivity(intent);
                    break;
                case R.id.findblood:
                    Intent intent1 = new Intent("com.microsoft.bvrith.lifeshare.findblood");
                    startActivity(intent1);
                    break;
                case R.id.requests:
                    Intent intent2 = new Intent("com.microsoft.bvrith.lifeshare.requests");
                    startActivity(intent2);
                    break;
                case R.id.becomedonor:
                    Intent intent3 = new Intent("com.microsoft.bvrith.lifeshare.becomedonor");
                    startActivity(intent3);
                    break;
            }
        }
    };
}
