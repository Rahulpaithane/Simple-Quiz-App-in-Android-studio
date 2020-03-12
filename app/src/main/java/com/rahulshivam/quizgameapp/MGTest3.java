package com.rahulshivam.quizgameapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MGTest3 extends AppCompatActivity {
    EditText ed1;
    TextView tv1,tv2,tv3;
    RadioButton optional1,optional2,optional3,optional4;
    Button bt;
    RadioGroup rg;
    int q,s,msg;
    String ans;
    AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mgtest3);
        ed1 = (EditText) findViewById(R.id.name);
        tv1 = (TextView) findViewById(R.id.ques);
        tv2 = (TextView) findViewById(R.id.response);
        tv3 = (TextView) findViewById(R.id.score);
        rg = (RadioGroup) findViewById(R.id.optionalGroup);
        optional1 = (RadioButton) findViewById(R.id.optional1);
        optional2 = (RadioButton) findViewById(R.id.optional2);
        optional3 = (RadioButton) findViewById(R.id.optional3);
        optional4 = (RadioButton) findViewById(R.id.optional4);
        bt = (Button) findViewById(R.id.btn);
        q = 0;
        s = 0;
        msg = 0;
        MobileAds.initialize(this, "Your App Ad-Mod ID");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void quiz(View v)
    {
        switch (q) {
            case 0: {
                if(msg==0) {
                    msg();
                    msg=1;
                }
                tv1.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                rg.setVisibility(View.VISIBLE);
                rg.clearCheck();
              /*  optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                tv2.setText("");
                tv3.setText("");
                optional1.setEnabled(true);
                optional2.setEnabled(true);
                optional3.setEnabled(true);
                optional4.setEnabled(true);
                //ed1.setEnabled(true);
                bt.setText("Next");
                s = 0;

                tv1.setText("1.Supervisory management spends most of his/her time in__________");
                optional1.setText("Planning and controlling");
                optional2.setText("Directing and controlling");
                optional3.setText("Planning and organizing");
                optional4.setText("Organizing and controlling");
                q = 1;
                break;
            }
            case 1: {
                ans= (String) optional2.getText();
                tv1.setText("2.Which of the following would be included in the controlling function ?");
                optional1.setText("Measuring results agaist corporate objectives");
                optional2.setText("Giving assignments");
                optional3.setText("Setting standards");
                optional4.setText("Explaining routines");

                if (optional2.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 2;
                rg.clearCheck();
                // optional1.setChecked(false);
                //  optional2.setChecked(false);
                //   optional3.setChecked(false);
                //  optional4.setChecked(false);
                break;
            }
            case 2: {
                ans= (String) optional1.getText();
                tv1.setText("3.________ is deciding in advance what to do and how to do.");
                optional1.setText("Organizing");
                optional2.setText("Controlling");
                optional3.setText("Planning");
                optional4.setText("Directing");
                if (ans=="Measuring results agaist corporate objectives") {
                    s = s + 1;
                    tv2.setText("Right Answer");

                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 3;
                rg.clearCheck();
                //optional1.setChecked(false);
                //optional2.setChecked(false);
                //optional3.setChecked(false);
                //optional4.setChecked(false);
                break;
            }
            case 3: {
                ans= (String) optional3.getText();
                tv1.setText("4.Which is the first and most essential function of management ?");
                optional1.setText("Planning");
                optional2.setText("Organizing ");
                optional3.setText("Controlling");
                optional4.setText("None of these");
                if (optional3.isChecked()) {
                    s = s + 1;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 4;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 4: {
                ans= (String) optional1.getText();
                tv1.setText("5.Planning is _________");
                optional1.setText("Goal-oriented");
                optional2.setText("Objective oriented");
                optional3.setText("Both A and B");
                optional4.setText("None of the above ");
                if (optional1.isChecked()) {
                    s = s + 1;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 5;
                rg.clearCheck();
                /*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);
*/                //bt.setText("Finish");
                break;
            }
            case 5: {
                ans= (String) optional1.getText();
                tv1.setText("6._________ are a guide to decision making.");
                optional1.setText("Procedures");
                optional2.setText("Policies");
                optional3.setText("Activities");
                optional4.setText("None of the above ");

                if (optional1.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 6;
                rg.clearCheck();
                /*optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 6: {
                ans= (String) optional2.getText();
                tv1.setText("7._________are a guide to action only.");
                optional1.setText("Procedures");
                optional2.setText("Policies");
                optional3.setText("Activities");
                optional4.setText("None of the above ");

                if (optional2.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 7;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 7: {
                ans= (String) optional1.getText();
                tv1.setText("8.Which budget includes spending data items ?");
                optional1.setText("Revenue");
                optional2.setText("Project");
                optional3.setText("Flexibility");
                optional4.setText("Expenditure");

                if (optional1.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 8;
                rg.clearCheck();
                /*optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 8: {
                ans= (String) optional4.getText();
                tv1.setText("9.Which among the following is not an element of direction ?");
                optional1.setText("Organising");
                optional2.setText("Supervision");
                optional3.setText("Leadership");
                optional4.setText("Motivation");

                if (ans=="Expenditure") {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 9;
                rg.clearCheck();
               /* optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 9: {
                ans= (String) optional3.getText();
                tv1.setText("10.Controlling function of management is ___________");
                optional1.setText("Forward looking");
                optional2.setText("Backward looking");
                optional3.setText("Forward as well as backward looking");
                optional4.setText("None of these");

                if (ans=="Leadership") {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 10;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 10: {

                ans= (String) optional3.getText();
                tv1.setText("11.Which type of leader allow complete delegation of authority ? ");
                optional1.setText("Creative leaders");
                optional2.setText("Persuasive leaders");
                optional3.setText("Laissez faire leaders");
                optional4.setText("Intellectual leaders");

                if (optional3.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 11;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 11: {
                ans= (String) optional3.getText();
                tv1.setText("12.__________ is the point at which there is no profit or no loss ?");
                optional1.setText("Maximum profit point");
                optional2.setText("Minimum loss point");
                optional3.setText("Break even point");
                optional4.setText("Break down point");

                if (optional3.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 12;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 12: {
                ans= (String) optional3.getText();
                tv1.setText("13.The heart of management is ___________");
                optional1.setText("Planning");
                optional2.setText("Organising");
                optional3.setText("Directing");
                optional4.setText("Controlling");

                if (optional3.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 13;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 13: {
                ans= (String) optional3.getText();
                tv1.setText("14.Which among the following is not an element of direction ?");
                optional1.setText("Motivation");
                optional2.setText("Delegation");
                optional3.setText("Supervision");
                optional4.setText("Communication");

                if (optional3.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 14;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 14: {
                ans= (String) optional2.getText();
                tv1.setText("15.Which of the following is a financial incentive ?");
                optional1.setText("Promotion");
                optional2.setText("Stock incentive");
                optional3.setText("Job security ");
                optional4.setText("Employees participation");

                if (optional2.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 15;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 15: {
                ans= (String) optional2.getText();
                tv1.setText("16.Directing and controlling are the : ");
                optional1.setText("Results of management");
                optional2.setText("Goals of management");
                optional3.setText("Functions of management");
                optional4.setText("All of the above");

                if (optional2.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 16;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 16: {
                ans= (String) optional3.getText();
                tv1.setText("17.Empowerment is related to : ");
                optional1.setText("Planning");
                optional2.setText("Organizing");
                optional3.setText("Controlling");
                optional4.setText("Directing");

                if (optional3.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 17;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 17: {
                ans= (String) optional4.getText();
                tv1.setText("18.Grapevine is _________");
                optional1.setText("Formal communication");
                optional2.setText("Barrier communication");
                optional3.setText("Informal communication");
                optional4.setText("Lateral communication");

                if (optional4.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 18;
                rg.clearCheck();
                /*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 18: {
                ans= (String) optional3.getText();
                tv1.setText("19.Find the odd one out ");
                optional1.setText("Supervision");
                optional2.setText("Leadership");
                optional3.setText("Co-ordination");
                optional4.setText("Communication");

                if (optional3.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 19;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                break;
            }
            case 19: {
                ans= (String) optional1.getText();
                tv1.setText("20.Supervisory management spends most of his/her time:");
                optional1.setText("Planning and Controlling ");
                optional2.setText("Directing and controlling");
                optional3.setText("Planning and organizing");
                optional4.setText("Organizing and controlling");

                if (optional1.isChecked()) {
                    tv2.setText("Right Answer");
                    s = s + 1;
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                q = 20;
                rg.clearCheck();/*
                optional1.setChecked(false);
                optional2.setChecked(false);
                optional3.setChecked(false);
                optional4.setChecked(false);*/
                bt.setText("Finish");
                break;
            }

            case 20: {
                ans= (String) optional2.getText();
                optional1.setEnabled(false);
                optional2.setEnabled(false);
                optional3.setEnabled(false);
                optional4.setEnabled(false);
                if (optional2.isChecked()) {
                    s = s + 1;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer !! "+ans+" was Right Answer");
                }
                tv3.setText(ed1.getText() + "'s final score is " + s+" out of 20");
                bt.setText("Restart");
                q = 0;
                break;
            }
        }

    }

    private void msg() {
        AlertDialog alertDialog = new AlertDialog.Builder(MGTest3.this).create();
        alertDialog.setTitle("Important!");
        alertDialog.setMessage("•Don't Click On Next Button Without Selecting An Option.\n" +
                "•Read Question CareFully.\n" +
                "•1 Question Carry 1 mark.\n" +
                "•There Are Total 20 Questions.\n"+
                "•Please Do not Press Back Button.");
        alertDialog.setCancelable(false);
        //alertDialog.setIcon(R.drawable.welcome);

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MGTest3.this, "Thank You!!!", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.show();
    }
}
