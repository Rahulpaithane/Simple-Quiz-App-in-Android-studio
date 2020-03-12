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

public class MGTest2 extends AppCompatActivity {
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
        setContentView(R.layout.activity_mgtest2);
        ed1=(EditText)findViewById(R.id.name);
        tv1=(TextView)findViewById(R.id.ques);
        tv2=(TextView)findViewById(R.id.response);
        tv3=(TextView)findViewById(R.id.score);
        rg=(RadioGroup)findViewById(R.id.optionalGroup);
        optional1=(RadioButton)findViewById(R.id.optional1);
        optional2=(RadioButton)findViewById(R.id.optional2);
        optional3=(RadioButton)findViewById(R.id.optional3);
        optional4=(RadioButton)findViewById(R.id.optional4);
        bt=(Button)findViewById(R.id.btn);
        q=0;
        s=0;
        msg=0;
        MobileAds.initialize(this, "Your App Ad-Mod ID");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }


    public void quiz(View v) {
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

                tv1.setText("1.Which of the following is a single use plan ?");
                optional1.setText("Objectives");
                optional2.setText("Policies");
                optional3.setText("Rules");
                optional4.setText("Budget");
                q = 1;
                break;
            }
            case 1: {
                ans= (String) optional4.getText();
                tv1.setText("2.Budget is an  instrument of__________");
                optional1.setText("Planning Only");
                optional2.setText("Control Only");
                optional3.setText("Planning And Control");
                optional4.setText("None Of These");

                if (optional4.isChecked()) {
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
                ans= (String) optional3.getText();
                tv1.setText("3.Planning Process began with _____________");
                optional1.setText("Setting Objectives");
                optional2.setText("Identity alternatives");
                optional3.setText("Developing planning premise");
                optional4.setText("Selecting alternatives");
                if (ans=="Setting Objectives") {
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
                ans= (String) optional1.getText();
                tv1.setText("4.Which of the following is not the principles of organization ?");
                optional1.setText("Unity of Objectives");
                optional2.setText("Specialization ");
                optional3.setText("Span of control");
                optional4.setText("Initiative ");
                if (optional1.isChecked()) {
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
                ans= (String) optional4.getText();
                tv1.setText("5._______is the decision making body of an organization ?");
                optional1.setText("Decentralisation");
                optional2.setText("Administration ");
                optional3.setText("Functional Organization");
                optional4.setText("Leadership");
                if (optional3.isChecked()) {
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
                ans= (String) optional2.getText();
                tv1.setText("6.MBO offers the basis for assessing the_________");
                optional1.setText("Operations");
                optional2.setText("Performance ");
                optional3.setText("Equality");
                optional4.setText("None Of these ");

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
                tv1.setText("7.Effective control depends on____________");
                optional1.setText("Organisation structure");
                optional2.setText("Proper Direction");
                optional3.setText("Flow of direction");
                optional4.setText("All ");

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
                ans= (String) optional4.getText();
                tv1.setText("8.Planning is _________ process");
                optional1.setText("Directing");
                optional2.setText("Thinking");
                optional3.setText("Fore casting");
                optional4.setText("None of these");

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
                ans= (String) optional2.getText();
                tv1.setText("9.Delegation is_________");
                optional1.setText("Getting things done by others");
                optional2.setText("Fixing of responsibility");
                optional3.setText("Assigning the task");
                optional4.setText("Unity of command");

                if (ans=="Assigning the task") {
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
                tv1.setText("10.Planning is________");
                optional1.setText("forward looking");
                optional2.setText("Backward looking");
                optional3.setText("Both");
                optional4.setText("None of these");

                if (ans=="Foreward looking") {
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

                ans= (String) optional1.getText();
                tv1.setText("11.Responsibility always flow from __________");
                optional1.setText("Superior to subordinate");
                optional2.setText("Subordinate to superior");
                optional3.setText("Both");
                optional4.setText("None of these");

                if (optional4.isChecked()) {
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
                ans= (String) optional1.getText();
                tv1.setText("12._______Subordination must be avoided");
                optional1.setText("Dual");
                optional2.setText("Single");
                optional3.setText("Multiple");
                optional4.setText("Triple");

                if (optional2.isChecked()) {
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
                ans= (String) optional1.getText();
                tv1.setText("13.A sequence of activity to implement the policy is__________");
                optional1.setText("Program");
                optional2.setText("Budget");
                optional3.setText("Plan");
                optional4.setText("Procedure");

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
                ans= (String) optional1.getText();
                tv1.setText("14.Organising deals with _________");
                optional1.setText("Division of  work");
                optional2.setText("Decentralising activities ");
                optional3.setText("Centralisation activites");
                optional4.setText("LL of these ");

                if (optional4.isChecked()) {
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
                ans= (String) optional1.getText();
                tv1.setText("15.Which of the following is not a function of management ?");
                optional1.setText("Planning");
                optional2.setText("Staffing");
                optional3.setText("Co-operation ");
                optional4.setText("Controlling ");

                if (optional1.isChecked()) {
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
                ans= (String) optional3.getText();
                tv1.setText("16.The purpose and the aim for which the organization is set up and operate is called _________");
                optional1.setText("objectives");
                optional2.setText("Strategy ");
                optional3.setText("Policy");
                optional4.setText("Procedure ");

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
                ans= (String) optional1.getText();
                tv1.setText("17.Which among the following is a single use plan ?");
                optional1.setText("Objectives");
                optional2.setText("Policies");
                optional3.setText("Rules");
                optional4.setText("Budget");

                if (optional1.isChecked()) {
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
                tv1.setText("18._________ are prescribe guidelines for conducting and action");
                optional1.setText("Rules");
                optional2.setText("Method");
                optional3.setText("Budget");
                optional4.setText("Policy");

                if (optional2.isChecked()) {
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
                tv1.setText("19.Planning provides __________");
                optional1.setText("Information to outsider");
                optional2.setText("Basis for recruitment and selections ");
                optional3.setText("Purpose and direction of the all person");
                optional4.setText("None of these ");

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
                ans= (String) optional3.getText();
                tv1.setText("20.Effective control depends on _________");
                optional1.setText("Organsation structure ");
                optional2.setText("Proper direction");
                optional3.setText("Flow of communication ");
                optional4.setText("All");

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
                ans= (String) optional4.getText();
                optional1.setEnabled(false);
                optional2.setEnabled(false);
                optional3.setEnabled(false);
                optional4.setEnabled(false);
                if (optional4.isChecked()) {
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
        AlertDialog alertDialog = new AlertDialog.Builder(MGTest2.this).create();
        alertDialog.setTitle("Important!");
        alertDialog.setMessage("•Don't Click On Next Button Without Selecting An Option.\n" +
                "•Read Question CareFully.\n" +
                "•1 Question Carry 1 mark.\n" +
                "•There Are Total 20 Questions.\n"+
                "•Please Do Not Press Back Button.");
        alertDialog.setCancelable(false);
        //alertDialog.setIcon(R.drawable.welcome);

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MGTest2.this, "Thank You!!!", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.show();
    }

}
