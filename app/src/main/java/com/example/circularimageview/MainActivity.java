package com.example.circularimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.jackandphantom.circularimageview.CircleImage;

public class MainActivity extends AppCompatActivity {

    CircleImage image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

image = findViewById(R.id.circleImage);


final Animation animation_rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);

image.startAnimation(animation_rotate);

//animation_rotate.setAnimationListener(new Animation.AnimationListener() {
//    @Override
//    public void onAnimationStart(Animation animation) {
//        //image.startAnimation(animation_rotate);
//    }
//
//    @Override
//    public void onAnimationEnd(Animation animation) {
//
//    }
//
//    @Override
//    public void onAnimationRepeat(Animation animation) {
//        image.startAnimation(animation_rotate);
//    }
//});
//
//
//




    }
}
