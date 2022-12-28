package com.example.lakshyaapubliceyeapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomepaActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadcomplain;
    CardView uploadinfotip;
    CardView uploadcybercrime;
    CardView uploadtraffic;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepa);
        uploadcomplain=findViewById(R.id.addcomplain);
        uploadcomplain.setOnClickListener(this);

        uploadinfotip=findViewById(R.id.addinfo);
        uploadinfotip.setOnClickListener(this);

        uploadcybercrime=findViewById(R.id.addcybercrime);
        uploadcybercrime.setOnClickListener(this);

        uploadtraffic=findViewById(R.id.addtraffic);
        uploadtraffic.setOnClickListener(this);










    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.addcomplain:
                Intent intent = new Intent(HomepaActivity.this,OnlinecomplainActivity.class);
                startActivity(intent);
                break;

            case R.id.addmycomplain:
                Intent w= new Intent(HomepaActivity.this,OnlinecomplainActivity.class);
                startActivity(w);
                break;



            case R.id.addinfo:
                Intent i = new Intent(HomepaActivity.this,OnlinecomplainActivity.class);
                startActivity(i);
                break;

            case R.id.addcybercrime:
                Intent x = new Intent(HomepaActivity.this,OnlinecomplainActivity.class);
                startActivity(x);
                break;

            case R.id.addtraffic:
                Intent y = new Intent(HomepaActivity.this,OnlinecomplainActivity.class);
                startActivity(y);
                break;
        }

    }
}