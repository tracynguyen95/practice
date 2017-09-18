package com.example.sweet.learningfrontend;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TEST", "THIS IS ON CREATE!!!!!!");

        Button testButton = (Button) findViewById(R.id.button);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView test = (TextView) findViewById(R.id.text);
                test.setText("Hello Android!");
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TEST", "THIS IS ON PAUSE!!!!!!");
    }
}
