package com.example.damadama;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView main_ani,aways;
    ImageButton but_love, but_food, but_hi;
    AnimationDrawable ani;
    ProgressBar hungry,like;
    Button reset;
    int full=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_ani=(ImageView)findViewById(R.id.main_ani);
        hungry=(ProgressBar)findViewById(R.id.progress_hungry);
        reset=(Button)findViewById(R.id.reset);
        ani=(AnimationDrawable)main_ani.getDrawable();
    }
    public void resetClick(View v){
        full=0;
        hungry.setProgress(full);
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
                full+=20;
                if(full<=100){
                    hungry.setProgress(full) ;
                    main_ani.setVisibility(View.VISIBLE);
                    if(ani.isRunning()) ani.stop();
                    main_ani.setImageResource(R.drawable.food_ani);
                    ani=(AnimationDrawable)main_ani.getDrawable();
                    ani.start();
                }else{
                    Toast.makeText(getApplicationContext(), "00(이)가 배가 불러요!", Toast.LENGTH_SHORT).show();
                }
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
