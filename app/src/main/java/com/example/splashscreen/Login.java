package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;


import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {
    Button button_forgetPassword,button_logIn,button_signUp;
    TextInputLayout username,designation,emailId,password;
    ImageView logoImage;
    TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        logoImage=findViewById(R.id.logoImage);
        username=findViewById(R.id.userName);
        textView1=findViewById(R.id.textId);
        emailId=findViewById(R.id.emailId);
        password=findViewById(R.id.passWord);

        textView=findViewById(R.id.textId1);
        button_logIn=findViewById(R.id.logIn);
        button_forgetPassword=findViewById(R.id.forgetPassword);
        button_signUp=findViewById(R.id.signUp);
        button_signUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,SignUp.class);
                Pair[]pairs= new Pair[9];
                pairs[0]=new Pair<View,String>(logoImage,"bull");
                pairs[1]=new Pair<View,String>(textView,"login");
                pairs[2]=new Pair<View,String>(username,"username_transition");
                pairs[3]=new Pair<View,String>(password,"password_transition");
                pairs[4]=new Pair<View,String>(button_forgetPassword,"forget_password_transition");
                pairs[5]=new Pair<View,String>(password,"go_transition");
                pairs[6]=new Pair<View,String>(button_logIn,"go_transition");
                pairs[7]=new Pair<View,String>(button_signUp,"new_user_transition");
                pairs[8]=new Pair<View,String>(textView1,"bullText");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions value = ActivityOptions.makeSceneTransitionAnimation(Login.this,pairs);
                    startActivity(intent,value.toBundle());
                }

            }
        });

    }
}