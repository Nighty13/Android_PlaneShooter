package com.example.asus.plane_shooter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View v)
    {
       Log.i("ImageButton","Clicked");
       Intent intent= new Intent(this,StartGame.class);
       startActivity(intent);
       finish();
    }
}
