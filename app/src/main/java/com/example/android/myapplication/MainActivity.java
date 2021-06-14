package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
    ArrayList<Integer> player1 = new ArrayList<>(); // hold player 1 data
    ArrayList<Integer> player2 = new ArrayList<>(); // hold player 2 data

    void playGame(int cellId, Button buSelected) {
        if (activePlayer == 1) {
            buSelected.setText("X");
            buSelected.setBackgroundColor(Color.GREEN);
            player1.add(cellId);
            activePlayer = 2;
        } else if (activePlayer == 2) {
            buSelected.setText("0");
            buSelected.setBackgroundColor(Color.BLUE);
            player2.add(cellId);
            activePlayer = 1;
        }
        CheckWinner();

    }

    void CheckWinner() {
        int winner = -1;

        //row 1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1;
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2;
        }

        //row 2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1;
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2;
        }

        //row 3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1;
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2;
        }


        //col 1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1;
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2;
        }


        //col 2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1;
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2;
        }


        //col 3
        if (player2.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1;
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2;
        }


        if (winner != -1){
            // We have Winner
            if (winner == 1){
                Toast.makeText(this, "Player 1 is Winner", Toast.LENGTH_SHORT).show();
            }
            if (winner == 2){
                Toast.makeText(this, "Player 2 is Winner", Toast.LENGTH_SHORT).show();
            }




        }

    }

}