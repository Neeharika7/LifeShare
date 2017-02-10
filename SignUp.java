package com.microsoft.bvrith.lifeshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    private static Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        OnClickButtonListener();
    }

    public void OnClickButtonListener() {
        ok = (Button)findViewById(R.id.signupok);
        ok.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent  = new Intent("com.microsoft.bvrith.lifeshare.Login");
                        startActivity(intent);
                    }
                }
        );
    }
}
