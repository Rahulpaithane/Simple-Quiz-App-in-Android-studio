package com.rahulshivam.quizgameapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mgt_Btn, eti_Btn;
        mgt_Btn = findViewById(R.id.mgt_Btn);
        eti_Btn = findViewById(R.id.eti_Btn);

        mgt_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_MGT();

            }
        });
        eti_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg();
            }
        });
    }

    public void start_MGT() {


        Intent it = new Intent(this, Management.class);

        // startActivityForResult(it,Mangement_Act);
        startActivity(it);
    }
    private void msg() {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Important!");
        alertDialog.setMessage("• Will Be Available Soon\n"+"• Thank You");
        alertDialog.setCancelable(false);
        //alertDialog.setIcon(R.drawable.welcome);

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Thank You!!!", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.show();
    }
}
