package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class listofbloodbanks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofbloodbanks);
        defineButtons();
    }
    public void defineButtons() {

        findViewById(R.id.findblood).setOnClickListener(buttonClickListener);
    }
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {

                case R.id.findblood:
                    Intent intent1 = new Intent("com.microsoft.bvrith.lifeshare.findblood");
                    startActivity(intent1);
                    break;

            }
        }
    };
}
