package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class requests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests);
        defineButtons();
    }
    public void defineButtons() {
        findViewById(R.id.allreq).setOnClickListener(buttonClickListener);
        findViewById(R.id.myreq).setOnClickListener(buttonClickListener);

    }
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.allreq:
                    Intent intent = new Intent("com.microsoft.bvrith.lifeshare.allrequests");
                    startActivity(intent);
                    break;
                case R.id.myreq:
                    Intent intent1 = new Intent("com.microsoft.bvrith.lifeshare.myrequests");
                    startActivity(intent1);
                    break;

            }
        }
    };
}
