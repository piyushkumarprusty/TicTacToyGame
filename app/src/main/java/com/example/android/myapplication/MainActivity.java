package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Buclick(View view) {
        Button buSelected = (Button) view;
        buSelected.setBackgroundColor(Color.RED);
        int cellId = 0;
        switch ((buSelected.getId())) {

            case R.id.bu1:
                cellId = 1;
                break;

            case R.id.bu2:
                cellId = 2;
                break;

            case R.id.bu3:
                cellId = 3;
                break;

            case R.id.bu4:
                cellId = 4;
                break;

            case R.id.bu5:
                cellId = 5;
                break;

            case R.id.bu6:
                cellId = 6;
                break;

            case R.id.bu7:
                cellId = 7;
                break;

            case R.id.bu8:


                cellId = 8;
                break;

            case R.id.bu9:
                cellId = 9;
                break;

        }
        playGame(cellId, buSelected);
    }

    int activePlayer = 1;  //1- for first , 2- for second

    void playGame(int cellId, Button buSelected) {
        ArrayList<Integer> player1 = new ArrayList<>(); // hold player 1 data
        ArrayList<Integer> player2 = new ArrayList<>(); // hold player 2 data

        if (activePlayer == 1) {
            buSelected.setText("X");
            buSelected.setBackgroundColor(Color.GREEN);
            player1.add(cellId);
            activePlayer = 2;
        }
        else if (activePlayer == 2) {
            buSelected.setText("0");
            buSelected.setBackgroundColor(Color.BLUE);
            player2.add(cellId);
            activePlayer = 1;
        }

    }

}