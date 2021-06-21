package com.example.dualdice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    public ImageView showDice1,showDice2;
    public Random randomNum= new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollBtn = findViewById(R.id.rollButton);
        MediaPlayer song = MediaPlayer.create(getApplicationContext(),R.raw.click);
        showDice1 = findViewById(R.id.imageView1);
        showDice2 = findViewById(R.id.imageView2);
        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.start();
                rollDice();
            }
        });
    }
    public void rollDice(){
        int num1 = randomNum.nextInt(6)+1;
        int num2 = randomNum.nextInt(6)+1;
        switch (num1){
            case 1:
                showDice1.setImageResource(R.drawable.one);
                break;
            case 2:
                showDice1.setImageResource(R.drawable.two);
                break;
            case 3:
                showDice1.setImageResource(R.drawable.three);
                break;
            case 4:
                showDice1.setImageResource(R.drawable.four);
                break;
            case 5:
                showDice1.setImageResource(R.drawable.five);
                break;
            case 6:
                showDice1.setImageResource(R.drawable.six);
                break;
        }
        switch (num2){
            case 1:
                showDice2.setImageResource(R.drawable.one);
                break;
            case 2:
                showDice2.setImageResource(R.drawable.two);
                break;
            case 3:
                showDice2.setImageResource(R.drawable.three);
                break;
            case 4:
                showDice2.setImageResource(R.drawable.four);
                break;
            case 5:
                showDice2.setImageResource(R.drawable.five);
                break;
            case 6:
                showDice2.setImageResource(R.drawable.six);
                break;
        }
    }
}