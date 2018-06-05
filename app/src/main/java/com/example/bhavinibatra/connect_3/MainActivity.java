package com.example.bhavinibatra.connect_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
// 0=yellow, 1=red;
    int activePlayer=0;

    //2 means unplayed
    int[] gamestate={2,2,2,2,2,2,2,2,2};



   public void dropIn(View view) {


       ImageView counter = (ImageView) view;
       counter.getTag();
       int tappedCounter = Integer.parseInt(counter.getTag().toString());

       if (gamestate[tappedCounter] == 2) {
           gamestate[tappedCounter]=activePlayer;


           counter.setTranslationY(-1000f);

           if (activePlayer == 0) {
               //set image in the particular image view
               counter.setImageResource(R.drawable.yellow);
               activePlayer = 1;

           } else {
               counter.setImageResource(R.drawable.red);
               activePlayer = 0;


           }

           //animate it back in again
           counter.animate().translationYBy(1000f).rotation(360).setDuration(300);


       }

   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
