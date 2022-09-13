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
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","A");
            intent.putExtra("imageNameStartsWith","a_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.B_b){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","B");
            intent.putExtra("imageNameStartsWith","b_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.C_c){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","C");
            intent.putExtra("imageNameStartsWith","c_for_");
            startActivity(intent);

        }
        else if(view.getId() == R.id.D_d){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","D");
            intent.putExtra("imageNameStartsWith","d_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.E_e){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","E");
            intent.putExtra("imageNameStartsWith","e_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.F_f){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","F");
            intent.putExtra("imageNameStartsWith","f_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.G_g){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","G");
            intent.putExtra("imageNameStartsWith","g_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.H_h){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","H");
            intent.putExtra("imageNameStartsWith","h_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.I_i){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","I");
            intent.putExtra("imageNameStartsWith","i_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.J_j){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","J");
            intent.putExtra("imageNameStartsWith","j_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.K_k){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","K");
            intent.putExtra("imageNameStartsWith","k_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.L_l){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","L");
            intent.putExtra("imageNameStartsWith","l_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.M_m){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","M");
            intent.putExtra("imageNameStartsWith","m_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.N_n){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","N");
            intent.putExtra("imageNameStartsWith","n_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.O_o){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","O");
            intent.putExtra("imageNameStartsWith","o_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.P_p){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","P");
            intent.putExtra("imageNameStartsWith","p_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.Q_q){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","Q");
            intent.putExtra("imageNameStartsWith","q_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.R_r){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","R");
            intent.putExtra("imageNameStartsWith","r_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.S_s){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","S");
            intent.putExtra("imageNameStartsWith","s_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.T_t){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","T");
            intent.putExtra("imageNameStartsWith","t_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.U_u){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","U");
            intent.putExtra("imageNameStartsWith","u_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.V_v){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","v");
            intent.putExtra("imageNameStartsWith","v_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.W_w){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","W");
            intent.putExtra("imageNameStartsWith","w_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.X_x){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","X");
            intent.putExtra("imageNameStartsWith","x_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.Y_y){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","Y");
            intent.putExtra("imageNameStartsWith","y_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.Z_z){
            Intent intent = new Intent(Letter.this , LetterTutorial.class);
            intent.putExtra("Letter","Z");
            intent.putExtra("imageNameStartsWith","z_for_");
            startActivity(intent);
        }
        else if(view.getId() == R.id.Back){
            Intent intent = new Intent(Letter.this , MainScreen.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.Quiz){
            Intent intent = new Intent(Letter.this , LetterQuiz.class);
            startActivity(intent);
        }
    }
}