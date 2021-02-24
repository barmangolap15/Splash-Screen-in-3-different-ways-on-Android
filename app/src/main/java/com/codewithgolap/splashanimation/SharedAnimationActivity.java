package com.codewithgolap.splashanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class SharedAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_animation);

        final Button button = findViewById(R.id.button);

        button.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_up));
    }
}