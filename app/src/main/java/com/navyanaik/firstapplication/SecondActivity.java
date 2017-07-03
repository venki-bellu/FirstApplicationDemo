package com.navyanaik.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Venkatesh Belavadi on 05-Jun-17.
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void mainscreen(View view){
        Intent another_intent=new Intent(this,FirstActivity.class);
        startActivity(another_intent);
        finish();
    }
}
