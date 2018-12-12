package com.example.rdvor.jdeappl;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ImageView imageAvatar = findViewById(R.id.imageAvatarId);
        imageAvatar.setImageResource(R.drawable.avatar);

        TextView textView = findViewById(R.id.textElect);

        ImageButton button = findViewById(R.id.buttonRecipeOne);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( UserActivity.this, RecipeActivity.class );
                startActivity( intent );
            }
        });

    }

}
