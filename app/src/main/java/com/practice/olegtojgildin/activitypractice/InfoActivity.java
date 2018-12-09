package com.practice.olegtojgildin.activitypractice;

/**
 * Created by olegtojgildin on 29/11/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by olegtojgildin on 29/11/2018.
 */

public class InfoActivity extends AppCompatActivity{
    Button nextButton;
    Button prevButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        init();
        initListener();
    }
    public void init(){
        nextButton =findViewById(R.id.next);
        prevButton =findViewById(R.id.prev);
    }
    public static final Intent newIntent(Context context){
        Intent intent=new Intent(context, InfoActivity.class);
        return intent;
    }
    public void initListener(){
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MainActivity.newIntent(InfoActivity.this));

            }
        });
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
}
