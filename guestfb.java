package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guestfb extends AppCompatActivity {
    private static Button findb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guestfb);
        OnClickButtonListener();
    }
    public void OnClickButtonListener() {
        findb = (Button)findViewById(R.id.findb);
        findb.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent  = new Intent("com.microsoft.bvrith.lifeshare.guestbloodavail");
                        startActivity(intent);
                    }
                }
        );
    }
}
