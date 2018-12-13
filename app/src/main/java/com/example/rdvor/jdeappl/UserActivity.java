package com.example.rdvor.jdeappl;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class UserActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ImageView imageAvatar = findViewById(R.id.imageAvatarId);
        imageAvatar.setImageResource(R.drawable.avatar);


        //Переход на рецепт
        ImageButton buttonRecipe = findViewById(R.id.buttonRecipeOne);
        buttonRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( UserActivity.this, RecipeActivity.class );
                startActivity( intent );
            }
        });


        //Поиск по рецептам
        Button buttonSearchRecipe = findViewById(R.id.buttonSearchRecipe);
        buttonSearchRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( UserActivity.this, SearchRecipeActivity.class );
                startActivity( intent );
            }
        });


        //Поиск по ингредиентам
        Button buttonSearchIngred = findViewById(R.id.buttonSearchIngred);
        buttonSearchIngred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }

}
