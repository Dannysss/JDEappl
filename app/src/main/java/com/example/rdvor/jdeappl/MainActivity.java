package com.example.rdvor.jdeappl;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton button = findViewById(R.id.jdeButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, UserActivity.class );
                startActivity( intent );
            }
        });

        TextView textView = findViewById(R.id.appName);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "GothamCondensed-Bold.otf");
        textView.setTypeface( typeFace );
    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     *
     */
}
