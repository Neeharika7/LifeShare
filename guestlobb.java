package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guestlobb extends AppCompatActivity {
    private static Button findblood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guestlobb);
        OnClickButtonListener();
    }

    public void OnClickButtonListener() {
        findblood = (Button)findViewById(R.id.findblood);
        findblood.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent  = new Intent("com.microsoft.bvrith.lifeshare.guestfb");
                        startActivity(intent);
                    }
                }
        );
    }
}
