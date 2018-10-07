package com.decastro.ean;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);
        Log.d("logs", "onCreate has executed..");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("logs", "onStart has executed..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("logs", "onResume has executed..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("logs", "onStop has executed..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("logs", "onPause has executed..");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("logs", "onRestart has executed..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("logs", "onDestroy has executed.");
    }

    public void display3(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        Toast.makeText(this, "Going to last screen", Toast.LENGTH_LONG).show();
        Log.d("logs", "Toast has executed..");
    }

    public void process(View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnMap1){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:35.7188,139.7765"));
            chooser = Intent.createChooser(i, "Select app");
            startActivity(chooser);
        }
    }
}
