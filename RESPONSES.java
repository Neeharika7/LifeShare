package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RESPONSES extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responses);
        defineButtons();
    }
    public void defineButtons() {
        findViewById(R.id.myresponses).setOnClickListener(buttonClickListener);
        findViewById(R.id.resptomyreq).setOnClickListener(buttonClickListener);
    }
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.myresponses:
                    Intent intent = new Intent("com.microsoft.bvrith.lifeshare.myresponses");
                    startActivity(intent);
                    break;
                case R.id.resptomyreq:
                    Intent intent1 = new Intent("com.microsoft.bvrith.lifeshare.resptomyreq");
                    startActivity(intent1);
                    break;

            }
        }
    };
}
