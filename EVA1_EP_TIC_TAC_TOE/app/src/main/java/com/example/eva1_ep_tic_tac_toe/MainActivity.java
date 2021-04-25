package com.example.eva1_ep_tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnResultado, botones[];
    TextView txtGanador;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarComponentes();


    }
    public void onClickTurno(View view){

        Button btn = (Button)view;

        if((contador%2) == 0){
            btn.setText("x");
            btn.setEnabled(false);
        }else{
            btn.setText("o");
            btn.setEnabled(false);
        }
        detGanador();
        contador++;

        if(contador==9){
            txtGanador.setText("Nadie ganó >:c");
            generarAlert("Nadie ganó >:c");
            txtGanador.setVisibility(View.VISIBLE);
        }
    }

    public void onClickReiniciar(View view){
        reiniciarBotones();
    }

    public void inicializarComponentes(){
        getSupportActionBar().hide();
        botones = new Button[9];

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        botones = new Button[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};

        txtGanador = findViewById(R.id.txtVwResultado);
        txtGanador.setVisibility(View.INVISIBLE);
        btnResultado = findViewById(R.id.btnResultado);

        contador = 0;
    }

    public void detGanador(){
        //comparamos todos los renglones de x

        if(btn1.getText().toString().equals("x") && btn2.getText().toString().equals("x") && btn3.getText().toString().equals("x")){
            txtGanador.setText("Ganó: x");
            generarAlert("Ganó: x");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        else if(btn4.getText().toString().equals("x") && btn5.getText().toString().equals("x") && btn6.getText().toString().equals("x")){
            txtGanador.setText("Ganó: x");
            generarAlert("Ganó: x");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        else if(btn7.getText().toString().equals("x") && btn8.getText().toString().equals("x") && btn9.getText().toString().equals("x")){
            txtGanador.setText("Ganó: x");
            generarAlert("Ganó: x");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        //comparamos todas las columnas de x
        else if(btn1.getText().toString().equals("x") && btn4.getText().toString().equals("x") && btn7.getText().toString().equals("x")){
            txtGanador.setText("Ganó: x");
            generarAlert("Ganó: x");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        else if(btn2.getText().toString().equals("x") && btn5.getText().toString().equals("x") && btn8.getText().toString().equals("x")){
            txtGanador.setText("Ganó: x");
            generarAlert("Ganó: x");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

       else if(btn3.getText().toString().equals("x") && btn6.getText().toString().equals("x") && btn9.getText().toString().equals("x")){
            txtGanador.setText("Ganó: x");
            generarAlert("Ganó: x");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

       //comparamos diagonales de x
        else if(btn1.getText().toString().equals("x") && btn5.getText().toString().equals("x") && btn9.getText().toString().equals("x")){
            txtGanador.setText("Ganó: x");
            generarAlert("Ganó: x");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        else if(btn3.getText().toString().equals("x") && btn5.getText().toString().equals("x") && btn7.getText().toString().equals("x")){
            txtGanador.setText("Ganó: x");
            generarAlert("Ganó: x");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }


        //comparamos todos los renglones de o

        if(btn1.getText().toString().equals("o") && btn2.getText().toString().equals("o") && btn3.getText().toString().equals("o")){
            txtGanador.setText("Ganó: o");
            generarAlert("Ganó: o");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        else if(btn4.getText().toString().equals("o") && btn5.getText().toString().equals("o") && btn6.getText().toString().equals("o")){
            txtGanador.setText("Ganó: o");
            generarAlert("Ganó: o");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        else if(btn7.getText().toString().equals("o") && btn8.getText().toString().equals("o") && btn9.getText().toString().equals("o")){
            txtGanador.setText("Ganó: o");
            generarAlert("Ganó: o");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        //comparamos todas las columnas de o
        else if(btn1.getText().toString().equals("o") && btn4.getText().toString().equals("o") && btn7.getText().toString().equals("o")){
            txtGanador.setText("Ganó: o");
            generarAlert("Ganó: o");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        else if(btn2.getText().toString().equals("o") && btn5.getText().toString().equals("o") && btn8.getText().toString().equals("o")){
            txtGanador.setText("Ganó: o");
            generarAlert("Ganó: o");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        else if(btn3.getText().toString().equals("o") && btn6.getText().toString().equals("o") && btn9.getText().toString().equals("o")){
            txtGanador.setText("Ganó: o");
            generarAlert("Ganó: o");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        //comparamos diagonales de o
        else if(btn1.getText().toString().equals("o") && btn5.getText().toString().equals("o") && btn9.getText().toString().equals("o")){
            txtGanador.setText("Ganó: o");
            generarAlert("Ganó: o");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }

        else if(btn3.getText().toString().equals("o") && btn5.getText().toString().equals("o") && btn7.getText().toString().equals("o")){
            txtGanador.setText("Ganó: o");
            generarAlert("Ganó: o");
            txtGanador.setVisibility(View.VISIBLE);
            for(int i =0; i<9; i++){
                botones[i].setEnabled(false);
            }

            contador=0;
        }
    }

    public void reiniciarBotones(){
        txtGanador.setVisibility(View.INVISIBLE);

        for(int i =0; i<9; i++){
            botones[i].setEnabled(true);
            botones[i].setText(R.string.guion);
        }

        contador=0;
    }

    public void generarAlert(String ganador){
        new AlertDialog.Builder(this).
                setTitle("Terminó la partida").
                setMessage(ganador).
                setPositiveButton("Ver resultados",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).setNeutralButton("Reiniciar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reiniciarBotones();
            }
        }).show();
    }

}