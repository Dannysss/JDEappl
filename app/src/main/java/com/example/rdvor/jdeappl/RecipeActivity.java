package com.example.rdvor.jdeappl;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class RecipeActivity extends AppCompatActivity {

    boolean isPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);


        final ImageButton button = findViewById(R.id.likeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPressed){
                    button.setBackgroundResource(R.drawable.like);
                }else{
                    button.setBackgroundResource(R.drawable.likeadd);
                }
                isPressed=!isPressed;
            }});
    }
}
