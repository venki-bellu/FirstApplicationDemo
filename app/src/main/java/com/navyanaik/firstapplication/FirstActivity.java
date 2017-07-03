package com.navyanaik.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        textView = (TextView) findViewById(R.id.hello_text_view);
    }

    public void display(View view)
    {
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
        finish();
    }

    public void belavadi_display(View view)
    {
        Intent intent=new Intent(this,ThirdActivity.class);
        startActivity(intent);
        finish();
    }

    public void testUpload(){

        int i=1+1;
        int ii=2+2;
        int iii=3+3;

    }
}
