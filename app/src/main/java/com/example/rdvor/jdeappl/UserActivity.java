package com.example.rdvor.jdeappl;



import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ImageView imageAvatar = findViewById(R.id.imageAvatarId);
        imageAvatar.setImageResource(R.drawable.avatar);

        TextView textView = findViewById(R.id.textElect);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/GothamCondensed-Bold.otf");
        textView.setTypeface( typeFace );

        Button button = findViewById(R.id.buttonRecipe);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( UserActivity.this, RecipeActivity.class );
                startActivity( intent );
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate( R.menu.menu_seacrh, menu );

        MenuItem searchItem = menu.findItem( R.id.search );
        SearchView searchView = (SearchView) MenuItemCompat.getActionView( searchItem );
        searchView.setOnQueryTextListener( this );

        return true;
    }


    @Override
    public boolean onQueryTextSubmit(String query)
    {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText)
    {
        return false;
    }

}
