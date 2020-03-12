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


public class MGTest extends AppCompatActivity {
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
        setContentView(R.layout.activity_mgtest);
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

                tv1.setText("1._______ Serve important roles in organisation.");
                optional1.setText("Supervisors");
                optional2.setText("Subordinates");
                optional3.setText("Managers");
                optional4.setText("Employees");
                q = 1;
                break;
            }
            case 1: {
                ans= (String) optional3.getText();
                tv1.setText("2.Manager is responsible for activities of his/her_______ ");
                optional1.setText("Employee");
                optional2.setText("Ordinators");
                optional3.setText("Subordinates");
                optional4.setText("Supervisor");

                if (optional3.isChecked()) {
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
                tv1.setText("3.Decision roles include ________");
                optional1.setText("Negotiators");
                optional2.setText("Monitor");
                optional3.setText("Disseminator");
                optional4.setText("Spokesperson");
                if (ans=="Subordinates") {
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
                tv1.setText("4.Administrative is also called as_________ ");
                optional1.setText("Middle level management");
                optional2.setText("Low level management ");
                optional3.setText("Top level management");
                optional4.setText("None of the above ");
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
                ans= (String) optional3.getText();
                tv1.setText("5.Executive is also called as_________");
                optional1.setText("Middle level management");
                optional2.setText("Low level management ");
                optional3.setText("Top level management");
                optional4.setText("None of the above ");
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
                ans= (String) optional1.getText();
                tv1.setText("6.Supervisory is also called as_________");
                optional1.setText("Middle level management");
                optional2.setText("Low level management ");
                optional3.setText("Top level management");
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
                tv1.setText("7.Top management includes _________");
                optional1.setText("President");
                optional2.setText("Superintendents");
                optional3.setText("Branch managers");
                optional4.setText("General foreman ");

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
                tv1.setText("8._________is the function of management");
                optional1.setText("Organising");
                optional2.setText("Managing");
                optional3.setText("Execution");
                optional4.setText("None of above");

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
                ans= (String) optional1.getText();
                tv1.setText("9.__________ is one of the managerial skills");
                optional1.setText("Technical skills");
                optional2.setText("Managing skill");
                optional3.setText("Communication skill");
                optional4.setText("None of above");

                if (ans=="Organising") {
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
                ans= (String) optional1.getText();
                tv1.setText("10.__________ is not element of managerial skills ");
                optional1.setText("Conceptual skill");
                optional2.setText("Human relation skill");
                optional3.setText("Technical skill");
                optional4.setText("Communication skill");

                if (ans=="Technical skills") {
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

                ans= (String) optional4.getText();
                tv1.setText("11.__________ is related with the the purchase of various materials required by the organisation ");
                optional1.setText("Material management");
                optional2.setText("Purchasing");
                optional3.setText("Taxation");
                optional4.setText("Costing");

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
                ans= (String) optional2.getText();
                tv1.setText("12.__________ involves giving information about products to buyers through different media.");
                optional1.setText("Marketing");
                optional2.setText("Costing");
                optional3.setText("Advertising");
                optional4.setText("Financial accounting");

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
                ans= (String) optional3.getText();
                tv1.setText("13.Lower manager is also called as ___________");
                optional1.setText("Foreman");
                optional2.setText("Inspector");
                optional3.setText("Director");
                optional4.setText("Supervisor");

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
                ans= (String) optional4.getText();
                tv1.setText("14.Executory level is nothing but the ________");
                optional1.setText("Middle level management");
                optional2.setText("Low level management ");
                optional3.setText("Top level management");
                optional4.setText("None of the above ");

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
                tv1.setText("15.Which type of issue are first level managers routinely influenced by _______");
                optional1.setText("Long range issue");
                optional2.setText("Short range issue");
                optional3.setText("Strategic issue ");
                optional4.setText("Shareholder issues ");

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
                ans= (String) optional2.getText();
                tv1.setText("16.What two major end results are manager seeking on a daily basis _______");
                optional1.setText("A product or service");
                optional2.setText("Management and efficiency ");
                optional3.setText("Energy and utilities");
                optional4.setText("Facilities and equipment ");

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
                tv1.setText("17.Which type of managers are responsible for reporting to middle managers ?");
                optional1.setText("Employees");
                optional2.setText("Managers");
                optional3.setText("Executive managers");
                optional4.setText("Second level managers");

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
                ans= (String) optional2.getText();
                tv1.setText("18.Which influential thought leader who is known as father of scientific management ?");
                optional1.setText("Peter f drucker");
                optional2.setText("Dale camegie");
                optional3.setText("Frederick W. Taylor");
                optional4.setText("W. Edwards Deming");

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
                tv1.setText("19.Which management principles states that the work should be divided so that each person will perform a specified portion ?");
                optional1.setText("Unity of direction");
                optional2.setText("Chain of command");
                optional3.setText("Division of work ");
                optional4.setText("Unity of command ");

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
                tv1.setText("20.Lower manager includes _____________");
                optional1.setText("President ");
                optional2.setText("Forman");
                optional3.setText("Managing directors ");
                optional4.setText("Chief executives");

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
        AlertDialog alertDialog = new AlertDialog.Builder(MGTest.this).create();
        alertDialog.setTitle("Important!");
        alertDialog.setMessage("•Don't Click On Next Button Without Selecting An Option.\n" +
                "•Read Question CareFully.\n" +
                "•1 Question Carry 1 mark.\n" +
                "•There Are Total 20 Questions.\n"+
                "•Please Do Not Press Back Button."
                );
        alertDialog.setCancelable(false);
        //alertDialog.setIcon(R.drawable.welcome);

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MGTest.this, "Thank You!!!", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.show();
    }


}
