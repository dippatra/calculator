package com.wgs.librsryupload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.wgs.calulationlibrary.Calculus;


public class MainActivity extends AppCompatActivity {
    private Calculus calculus;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculus=new Calculus(10,5);
        text=(TextView) findViewById(R.id.textview);
        text.setText(String.valueOf(calculus.getMultiplyData()));


    }
}