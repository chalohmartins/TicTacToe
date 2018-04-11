package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FiveByFive extends AppCompatActivity implements View.OnClickListener{

  private final static String TAG = MainActivity.class.getSimpleName();
    boolean PLAYER_X = true;

    int TURN_COUNT = 0;

    Button c00;
    Button c01;
    Button c02;
    Button c03;
    Button c04;

    Button c10;
    Button c11;
    Button c12;
    Button c13;
    Button c14;

    Button c20;
    Button c21;
    Button c22;
    Button c23;
    Button c24;

    Button c30;
    Button c31;
    Button c32;
    Button c33;
    Button c34;

    Button c40;
    Button c41;
    Button c42;
    Button c43;
    Button c44;

    Button cReset;

    TextView tvInfo;

    int[][] boardStatus = new int[5][5];

    private Button changeBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a5by5_activity);
        changeBoard = (Button) findViewById(R.id.button_change_to_3by3);

        changeBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open3By3Board();
            }
        });


        c00 = (Button) c00.findViewById(R.id.c00);
        c01 = (Button) c01.findViewById(R.id.c01);
        c02 = (Button) c02.findViewById(R.id.c02);
        c03 = (Button) c03.findViewById(R.id.c03);
        c04 = (Button) c04.findViewById(R.id.c04);

        c10 = (Button) c10.findViewById(R.id.c10);
        c11 = (Button) c11.findViewById(R.id.c11);
        c12 = (Button) c12.findViewById(R.id.c12);
        c13 = (Button) c13.findViewById(R.id.c13);
        c14 = (Button) c14.findViewById(R.id.c14);

        c20 = (Button) c20.findViewById(R.id.c20);
        c21 = (Button) c21.findViewById(R.id.c21);
        c22 = (Button) c22.findViewById(R.id.c22);
        c23 = (Button) c23.findViewById(R.id.c23);
        c24 = (Button) c24.findViewById(R.id.c24);

        c30 = (Button) c30.findViewById(R.id.c30);
        c31 = (Button) c31.findViewById(R.id.c31);
        c32 = (Button) c32.findViewById(R.id.c32);
        c33 = (Button) c33.findViewById(R.id.c33);
        c34 = (Button) c34.findViewById(R.id.c34);

        c40 = (Button) c40.findViewById(R.id.c40);
        c41 = (Button) c41.findViewById(R.id.c41);
        c42 = (Button) c42.findViewById(R.id.c42);
        c43 = (Button) c43.findViewById(R.id.c43);
        c44 = (Button) c44.findViewById(R.id.c44);

        cReset = (Button) cReset.findViewById(R.id.bReset);
        tvInfo = (TextView) tvInfo.findViewById(R.id.tvInfo);

        cReset.setOnClickListener((View.OnClickListener) this);

        c00.setOnClickListener(this);
        c01.setOnClickListener(this);
        c02.setOnClickListener(this);
        c03.setOnClickListener(this);
        c04.setOnClickListener(this);

        c10.setOnClickListener(this);
        c11.setOnClickListener(this);
        c12.setOnClickListener(this);
        c13.setOnClickListener(this);
        c14.setOnClickListener(this);

        c20.setOnClickListener(this);
        c21.setOnClickListener(this);
        c22.setOnClickListener(this);
        c23.setOnClickListener(this);
        c24.setOnClickListener(this);

        c30.setOnClickListener(this);
        c31.setOnClickListener(this);
        c32.setOnClickListener(this);
        c33.setOnClickListener(this);
        c34.setOnClickListener(this);

        c40.setOnClickListener(this);
        c41.setOnClickListener(this);
        c42.setOnClickListener(this);
        c43.setOnClickListener(this);
        c44.setOnClickListener(this);

        initializeBoardStatus();

    }

    public void open3By3Board(){
        Intent intent = new Intent(this, com.example.android.tictactoe.MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "Inside onClick");

        boolean resetButtonPressed = false;

        switch (view.getId()){
            case R.id.c00:
                if(PLAYER_X){
                    c00.setText("X");
                    boardStatus[0][0] = 1;
                }
                else{
                    c00.setText("0");
                    boardStatus[0][0] = 0;
                }
                c00.setEnabled(false);
                break;

            case R.id.c01:
                if(PLAYER_X){
                    c01.setText("X");
                    boardStatus[0][1] = 1;
                }
                else{
                    c01.setText("0");
                    boardStatus[0][1] = 0;
                }
                c01.setEnabled(false);
                break;

            case R.id.c02:
                if(PLAYER_X){
                    c02.setText("X");
                    boardStatus[0][2] = 1;
                }
                else{
                    c02.setText("0");
                    boardStatus[0][2] = 0;
                }
                c02.setEnabled(false);
                break;

            case R.id.c03:
                if(PLAYER_X){
                    c03.setText("X");
                    boardStatus[0][3] = 1;
                }
                else{
                    c03.setText("0");
                    boardStatus[0][3] = 0;
                }
                c03.setEnabled(false);
                break;

            case R.id.c04:
                if(PLAYER_X){
                    c04.setText("X");
                    boardStatus[0][4] = 1;
                }
                else{
                    c04.setText("0");
                    boardStatus[0][4] = 0;
                }
                c04.setEnabled(false);
                break;



            case R.id.c10:
                if(PLAYER_X){
                    c10.setText("X");
                    boardStatus[1][0] = 1;
                }
                else{
                    c10.setText("0");
                    boardStatus[1][0] = 0;
                }
                c10.setEnabled(false);
                break;

            case R.id.c11:
                if(PLAYER_X){
                    c11.setText("X");
                    boardStatus[1][1] = 1;
                }
                else{
                    c11.setText("0");
                    boardStatus[1][1] = 0;
                }
                c11.setEnabled(false);
                break;

            case R.id.c12:
                if(PLAYER_X){
                    c12.setText("X");
                    boardStatus[1][2] = 1;
                }
                else{
                    c12.setText("0");
                    boardStatus[1][2] = 0;
                }
                c12.setEnabled(false);
                break;

            case R.id.c13:
                if(PLAYER_X){
                    c13.setText("X");
                    boardStatus[1][3] = 1;
                }
                else{
                    c13.setText("0");
                    boardStatus[1][3] = 0;
                }
                c13.setEnabled(false);
                break;

            case R.id.c14:
                if(PLAYER_X){
                    c14.setText("X");
                    boardStatus[1][4] = 1;
                }
                else{
                    c14.setText("0");
                    boardStatus[1][4] = 0;
                }
                c14.setEnabled(false);
                break;



            case R.id.c20:
                if(PLAYER_X){
                    c20.setText("X");
                    boardStatus[2][0] = 1;
                }
                else{
                    c20.setText("0");
                    boardStatus[2][0] = 0;
                }
                c20.setEnabled(false);
                break;

            case R.id.c21:
                if(PLAYER_X){
                    c21.setText("X");
                    boardStatus[2][1] = 1;
                }
                else{
                    c21.setText("0");
                    boardStatus[2][1] = 0;
                }
                c21.setEnabled(false);
                break;

            case R.id.c22:
                if(PLAYER_X){
                    c22.setText("X");
                    boardStatus[2][2] = 1;
                }
                else{
                    c22.setText("0");
                    boardStatus[2][2] = 0;
                }
                c22.setEnabled(false);
                break;

            case R.id.c23:
                if(PLAYER_X){
                    c23.setText("X");
                    boardStatus[2][3] = 1;
                }
                else{
                    c23.setText("0");
                    boardStatus[2][3] = 0;
                }
                c23.setEnabled(false);
                break;

            case R.id.c24:
                if(PLAYER_X){
                    c24.setText("X");
                    boardStatus[2][4] = 1;
                }
                else{
                    c24.setText("0");
                    boardStatus[2][4] = 0;
                }
                c24.setEnabled(false);
                break;

            case R.id.c30:
                if(PLAYER_X){
                    c30.setText("X");
                    boardStatus[3][0] = 1;
                }
                else{
                    c30.setText("0");
                    boardStatus[3][0] = 0;
                }
                c30.setEnabled(false);
                break;

            case R.id.c31:
                if(PLAYER_X){
                    c31.setText("X");
                    boardStatus[3][1] = 1;
                }
                else{
                    c31.setText("0");
                    boardStatus[3][1] = 0;
                }
                c31.setEnabled(false);
                break;

            case R.id.c32:
                if(PLAYER_X){
                    c32.setText("X");
                    boardStatus[3][2] = 1;
                }
                else{
                    c32.setText("0");
                    boardStatus[3][2] = 0;
                }
                c32.setEnabled(false);
                break;

            case R.id.c34:
                if(PLAYER_X){
                    c34.setText("X");
                    boardStatus[3][4] = 1;
                }
                else{
                    c34.setText("0");
                    boardStatus[3][4] = 0;
                }
                c34.setEnabled(false);
                break;

            case R.id.c40:
                if(PLAYER_X){
                    c40.setText("X");
                    boardStatus[4][0] = 1;
                }
                else{
                    c40.setText("0");
                    boardStatus[4][0] = 0;
                }
                c40.setEnabled(false);
                break;


            case R.id.c41:
                if(PLAYER_X){
                    c41.setText("X");
                    boardStatus[4][1] = 1;
                }
                else{
                    c41.setText("0");
                    boardStatus[4][1] = 0;
                }
                c41.setEnabled(false);
                break;


            case R.id.c42:
                if(PLAYER_X){
                    c42.setText("X");
                    boardStatus[4][2] = 1;
                }
                else{
                    c42.setText("0");
                    boardStatus[4][2] = 0;
                }
                c42.setEnabled(false);
                break;

            case R.id.c43:
                if(PLAYER_X){
                    c43.setText("X");
                    boardStatus[4][3] = 1;
                }
                else{
                    c43.setText("0");
                    boardStatus[4][3] = 0;
                }
                c43.setEnabled(false);
                break;

            case R.id.c44:
                if(PLAYER_X){
                    c44.setText("X");
                    boardStatus[4][4] = 1;
                }
                else{
                    c44.setText("0");
                    boardStatus[4][4] = 0;
                }
                c44.setEnabled(false);
                break;



            case R.id.bReset:
                resetButtonPressed = true;
                break;

            default:
                break;

        }

        if(resetButtonPressed){
            resetBoard();
        }
        else{
            TURN_COUNT ++;
            PLAYER_X = !PLAYER_X;

            if(PLAYER_X){
                setInfo("Player X turn");
            }
            else {
                setInfo("Player 0 turn");
            }

            if(TURN_COUNT==25){
                result("Game Draw");
            }

            checkWinner();
        }
    }

    private void checkWinner(){

        Log.d(TAG, "Inside checkWinner");

        //Horizontal --- rows
        for(int i=0; i<5; i++){
            if(boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2] && boardStatus[i][0] == boardStatus[i][3] && boardStatus[i][0] == boardStatus[i][4]){
                if (boardStatus[i][0]==1){
                    result("Player X winner\n" + (i+1)+" row");
                    break;
                }
                else if (boardStatus[i][0]==0) {
                    result("Player 0 winner\n" + (i+1)+" row");
                    break;
                }
            }
        }

        //Vertical --- columns
        for(int i=0; i<5; i++){
            if(boardStatus[0][i] == boardStatus[1][i] && boardStatus[0][i] == boardStatus[2][i] && boardStatus[0][i] == boardStatus[3][i] && boardStatus[0][i] == boardStatus[4][i]){
                if (boardStatus[0][i]==1){
                    result("Player X winner\n" + (i+1)+" column");
                    break;
                }
                else if (boardStatus[0][i]==0) {
                    result("Player 0 winner\n" + (i+1)+" column");
                    break;
                }
            }
        }

        //First diagonal
        if(boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2] && boardStatus[0][0] == boardStatus[3][3] && boardStatus[0][0] == boardStatus[4][4]){
            if (boardStatus[0][0]==1){
                result("Player X winner\nFirst Diagonal");
            }
            else if (boardStatus[0][0]==0) {
                result("Player 0 winner\nFirst Diagonal");
            }
        }

        //Second diagonal
        if(boardStatus[0][4] == boardStatus[1][3] && boardStatus[0][4] == boardStatus[2][2] && boardStatus[0][4] == boardStatus[3][1] && boardStatus[0][4] == boardStatus[4][0]){
            if (boardStatus[0][4]==1){
                result("Player X winner\nSecond Diagonal");
            }
            else if (boardStatus[0][4]==0) {
                result("Player 0 winner\nSecond Diagonal");
            }
        }
    }

    private void enableAllBoxes(boolean value){
        Log.d(TAG, "Inside enableAllBoxes");
        c00.setEnabled(value);
        c01.setEnabled(value);
        c02.setEnabled(value);
        c03.setEnabled(value);
        c04.setEnabled(value);

        c10.setEnabled(value);
        c11.setEnabled(value);
        c12.setEnabled(value);
        c13.setEnabled(value);
        c14.setEnabled(value);

        c20.setEnabled(value);
        c21.setEnabled(value);
        c22.setEnabled(value);
        c23.setEnabled(value);
        c24.setEnabled(value);

        c30.setEnabled(value);
        c31.setEnabled(value);
        c32.setEnabled(value);
        c33.setEnabled(value);
        c34.setEnabled(value);

        c40.setEnabled(value);
        c41.setEnabled(value);
        c42.setEnabled(value);
        c43.setEnabled(value);
        c44.setEnabled(value);
    }

    private void result(String winner){
        Log.d(TAG, "Inside result");

        setInfo(winner);
        enableAllBoxes(false);
    }

    private void resetBoard(){
        Log.d(TAG, "Inside resetBoard");
        c00.setText("");
        c01.setText("");
        c02.setText("");
        c03.setText("");
        c04.setText("");

        c10.setText("");
        c11.setText("");
        c12.setText("");
        c13.setText("");
        c14.setText("");


        c20.setText("");
        c21.setText("");
        c22.setText("");
        c23.setText("");
        c24.setText("");

        c30.setText("");
        c31.setText("");
        c32.setText("");
        c33.setText("");
        c34.setText("");

        c40.setText("");
        c41.setText("");
        c42.setText("");
        c43.setText("");
        c44.setText("");



        enableAllBoxes(true);

        PLAYER_X = true;
        TURN_COUNT = 0;

        initializeBoardStatus();

        setInfo("Start Again!!!");

        Toast.makeText(this,"Board Reset",Toast.LENGTH_SHORT).show();
    }

    private void setInfo(String text){
        tvInfo.setText(text);
    }

    private void initializeBoardStatus(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                boardStatus[i][j] = -1;
            }
        }

    }


}
