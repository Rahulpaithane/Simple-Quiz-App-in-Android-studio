package com.rahulshivam.quizgameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Management extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);
        Button test1_Btn,test2_Btn,test3_Btn;
        test1_Btn=findViewById(R.id.test1_Btn);
        test2_Btn=findViewById(R.id.test2_Btn);
        test3_Btn=findViewById((R.id.test3_Btn));

        test3_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_MGTTest3();
            }
        });
        test2_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_MGTTest2();
            }
        });


        test1_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_MGTTest();
            }
        });
        MobileAds.initialize(this, "Your App Ad-Mod ID");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    private void start_MGTTest3() {
        Intent it3 = new Intent(this, MGTest3.class);
        startActivity(it3);
    }

    private void start_MGTTest2() {
        Intent it2 = new Intent(this, MGTest2.class);
        startActivity(it2);
    }

    public void start_MGTTest() {


        Intent it = new Intent(this, MGTest.class);
        startActivity(it);
    }
}
