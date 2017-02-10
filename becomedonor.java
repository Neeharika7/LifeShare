package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class becomedonor extends AppCompatActivity {
    private static Button okdonor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_becomedonor);
        OnClickButtonListener();
    }
    public void OnClickButtonListener() {
        okdonor = (Button)findViewById(R.id.okdonor);
        okdonor.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent  = new Intent("com.microsoft.bvrith.lifeshare.donormenu");
                        startActivity(intent);
                    }
                }
        );
    }
}
