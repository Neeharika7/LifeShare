package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guestbloodavail extends AppCompatActivity {
    private static Button post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guestbloodavail);
        OnClickButtonListener();
    }

    public void OnClickButtonListener() {
        post = (Button)findViewById(R.id.post);
        post.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent  = new Intent("com.microsoft.bvrith.lifeshare.SignUp");
                        startActivity(intent);
                    }
                }
        );
    }
}
