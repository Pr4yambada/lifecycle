package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String tag="Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"In the onCreate()event");
        Toast.makeText(getApplicationContext(),"Oncreate", Toast.LENGTH_SHORT).show();

    }
    public void onStart()
    {
       super.onStart();
       Log.d(tag,"In the onStart()event");
        Toast.makeText(getApplicationContext(),"OnStart", Toast.LENGTH_SHORT).show();
    }
    public void onRestart()
    {
     super.onRestart();
     Log.d(tag,"In the onRestart()event");
        Toast.makeText(getApplicationContext(),"onRestart", Toast.LENGTH_SHORT).show();
    }
    public void onPause()
    {
      super.onPause();
      Log.d(tag,"In the onPause()event");
        Toast.makeText(getApplicationContext(),"onPause", Toast.LENGTH_SHORT).show();
    }
    public void onStop()
{
    super.onStop();
    Log.d(tag,"In the onStop()event");
    Toast.makeText(getApplicationContext(),"onStop", Toast.LENGTH_SHORT).show();
        }
        public void onDestroy()
        {
            super.onDestroy();
            Log.d(tag,"In the onDestroy()event");
            Toast.makeText(getApplicationContext(),"onDestroy", Toast.LENGTH_SHORT).show();
        }
}


