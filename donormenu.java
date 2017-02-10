package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class donormenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donormenu);
        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.lobb).setOnClickListener(buttonClickListener);
        findViewById(R.id.findblood).setOnClickListener(buttonClickListener);
        findViewById(R.id.req).setOnClickListener(buttonClickListener);
        findViewById(R.id.resp).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.lobb:
                    Intent intent = new Intent("com.microsoft.bvrith.lifeshare.listofbloodbanks");
                    startActivity(intent);
                    break;
                case R.id.findblood:
                    Intent intent1 = new Intent("com.microsoft.bvrith.lifeshare.findblood");
                    startActivity(intent1);
                    break;
                case R.id.req:
                    Intent intent2 = new Intent("com.microsoft.bvrith.lifeshare.requests");
                    startActivity(intent2);
                    break;
                case R.id.resp:
                    Intent intent3 = new Intent("com.microsoft.bvrith.lifeshare.RESPONSES");
                    startActivity(intent3);
            }
        }
    };
}
