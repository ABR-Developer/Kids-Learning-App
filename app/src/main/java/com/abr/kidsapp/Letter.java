package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class Letter extends AppCompatActivity implements OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter);
        ArrayList<Button> buttonArrayList = new ArrayList<>();
        Button b;

        ConstraintLayout containerButton = findViewById(R.id.R_layout);
        for(int i =0; i < containerButton.getChildCount(); i++){
            View v = containerButton.getChildAt(i);
            if(v instanceof Button){
                buttonArrayList.add(findViewById(v.getId()));
                b = buttonArrayList.get(i);
                b.setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        if(view.getId() == R.id.A_a){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","A");
            intent.putExtra("imageNameStartsWith","letter_a");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.B_b){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","B");
            intent.putExtra("imageNameStartsWith","letter_b");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.C_c){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","C");
            intent.putExtra("imageNameStartsWith","letter_c");
            startActivity(intent);
            setContentView(R.layout.activity_a);

        }
        else if(view.getId() == R.id.D_d){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","D");
            intent.putExtra("imageNameStartsWith","letter_d");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.E_e){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","D");
            intent.putExtra("imageNameStartsWith","letter_d");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.F_f){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","D");
            intent.putExtra("imageNameStartsWith","letter_d");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.G_g){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","G");
            intent.putExtra("imageNameStartsWith","letter_g");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.H_h){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","H");
            intent.putExtra("imageNameStartsWith","letter_h");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.I_i){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","I");
            intent.putExtra("imageNameStartsWith","letter_i");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.J_j){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","J");
            intent.putExtra("imageNameStartsWith","letter_j");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.K_k){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","K");
            intent.putExtra("imageNameStartsWith","letter_k");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.L_l){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","L");
            intent.putExtra("imageNameStartsWith","letter_l");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.M_m){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","M");
            intent.putExtra("imageNameStartsWith","letter_m");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.N_n){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","N");
            intent.putExtra("imageNameStartsWith","letter_n");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.O_o){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","O");
            intent.putExtra("imageNameStartsWith","letter_o");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.P_p){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","P");
            intent.putExtra("imageNameStartsWith","letter_p");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.Q_q){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","Q");
            intent.putExtra("imageNameStartsWith","letter_q");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.R_r){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","R");
            intent.putExtra("imageNameStartsWith","letter_r");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.S_s){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","S");
            intent.putExtra("imageNameStartsWith","letter_s");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.T_t){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","T");
            intent.putExtra("imageNameStartsWith","letter_t");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.U_u){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","U");
            intent.putExtra("imageNameStartsWith","letter_u");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.V_v){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","v");
            intent.putExtra("imageNameStartsWith","letter_v");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.W_w){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","W");
            intent.putExtra("imageNameStartsWith","letter_w");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.X_x){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","X");
            intent.putExtra("imageNameStartsWith","letter_x");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.Y_y){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","Y");
            intent.putExtra("imageNameStartsWith","letter_y");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.Z_z){
            Intent intent = new Intent(this , A.class);
            intent.putExtra("Letter","Z");
            intent.putExtra("imageNameStartsWith","letter_z");
            startActivity(intent);
            setContentView(R.layout.activity_a);
        }
        else if(view.getId() == R.id.Back){
            Intent intent = new Intent(this , Catagories.class);
            startActivity(intent);
            setContentView(R.layout.activity_catagories2);
        }
        else if(view.getId() == R.id.Quiz){
            Intent intent = new Intent(this , LetterQuiz.class);
            startActivity(intent);
            setContentView(R.layout.activity_letter_quiz);
        }
    }
}