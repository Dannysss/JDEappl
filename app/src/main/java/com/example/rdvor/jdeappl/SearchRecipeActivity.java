package com.example.rdvor.jdeappl;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnKeyListener;

import java.io.IOException;

public class SearchRecipeActivity extends AppCompatActivity {

    private DataBaseHelper mDBHelper;
    private SQLiteDatabase mDb;
    Button button;
    TextView viewRecipes;
    EditText searchRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchrecipe);
        mDBHelper = new DataBaseHelper(this);
        try {
            mDBHelper.updateDataBase();
        } catch (IOException mIOException) {
            throw new Error("UnableToUpdateDatabase");
        }

        try {
            mDb = mDBHelper.getWritableDatabase();
        }
        catch (SQLException mSQLException) {
            throw mSQLException;
        }

        viewRecipes = (TextView)findViewById(R.id.viewRecipes);
       // final EditText searchRecipe = (EditText)findViewById(R.id.searchRecipe);
         button = (Button) findViewById(R.id.button);
// ToDO
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String product = "";
                Cursor cursor = mDb.rawQuery("SELECT * FROM recipes", null);
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    product += cursor.getString(1) + " | ";
                    cursor.moveToNext();
                }
                cursor.close();
                viewRecipes.setText(product);
            }
        });
    }
}
