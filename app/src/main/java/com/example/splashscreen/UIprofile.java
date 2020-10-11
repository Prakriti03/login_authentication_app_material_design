package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class UIprofile extends AppCompatActivity {
    ImageView imageView;
    TextView textView,textView1,textView2;
    CardView cardView,cardView1;
    Animation topAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_iprofile);
        imageView=findViewById(R.id.myLogoImage);
        textView=findViewById(R.id.myRealName);
        textView1=findViewById(R.id.smallLetter);
        cardView=findViewById(R.id.card1);
        cardView1=findViewById(R.id.card2);
        topAnimation= AnimationUtils.loadAnimation(this,R.anim.animation1);
        imageView.setAnimation(topAnimation);
        textView1.setAnimation(topAnimation);
        textView.setAnimation(topAnimation);
        cardView1.setAnimation(topAnimation);
        cardView.setAnimation(topAnimation);


    }
}