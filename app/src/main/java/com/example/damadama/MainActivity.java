package com.example.damadama;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView main_ani,aways;
    ImageButton but_love, but_food, but_hi;
    AnimationDrawable ani;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_ani=(ImageView)findViewById(R.id.main_ani);
        ani=(AnimationDrawable)main_ani.getDrawable();
    }

    public void OnClick(View v) {
        switch(v.getId()) {
            case R.id.love:
                main_ani.setVisibility(View.VISIBLE);
                if(ani.isRunning()) ani.stop();
                main_ani.setImageResource(R.drawable.happy_ani);
                ani=(AnimationDrawable)main_ani.getDrawable();
                ani.start();
                break;
            case R.id.food:
                main_ani.setVisibility(View.VISIBLE);
                if(ani.isRunning()) ani.stop();
                main_ani.setImageResource(R.drawable.food_ani);
                ani=(AnimationDrawable)main_ani.getDrawable();
                ani.start();
                break;
            case R.id.hi:
                main_ani.setVisibility(View.VISIBLE);
                if(ani.isRunning()) ani.stop();
                main_ani.setImageResource(R.drawable.hi_ani);
                ani=(AnimationDrawable)main_ani.getDrawable();
                ani.start();
                break;
        }
    }
}
