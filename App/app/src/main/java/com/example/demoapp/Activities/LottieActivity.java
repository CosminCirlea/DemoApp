package com.example.demoapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;
import com.example.demoapp.R;

public class LottieActivity extends AppCompatActivity {

    private LottieAnimationView mAnimationView;
    private boolean isSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
        InitializeViews();
        mAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                if (!isSet && (float)animation.getAnimatedValue()*100 > 80)
                {
//                    changeAnimation();
                    isSet = true;
                }
            }
        });
    }

    private void changeAnimation()
    {
        mAnimationView.setAnimation("lottie-beach-dance.json");
        mAnimationView.playAnimation();
        mAnimationView.setSpeed(1);
    }

    private void InitializeViews()
    {
        mAnimationView = findViewById(R.id.lottie_animation);
    }
}