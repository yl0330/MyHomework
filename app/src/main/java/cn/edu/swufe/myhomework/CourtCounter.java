package cn.edu.swufe.myhomework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CourtCounter extends AppCompatActivity{
    TextView texta;
    TextView textb;
    //String a = texta.getText().toString();
    //String b = textb.getText().toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counter_layout);
        texta = (TextView) findViewById(R.id.textA);
        textb = (TextView) findViewById(R.id.textB);

        Button btna1 = (Button) findViewById(R.id.teamA1);
        Button btna2 = (Button) findViewById(R.id.teamA2);
        Button btna3 = (Button) findViewById(R.id.teamA3);
        Button btnb1 = (Button) findViewById(R.id.teamB1);
        Button btnb2 = (Button) findViewById(R.id.teamB2);
        Button btnb3 = (Button) findViewById(R.id.teamB3);
    }

    public void A3(View btna3){
        String a = texta.getText().toString();
        int na = Integer.parseInt(a);
        texta.setText(String.valueOf(na+3));
    }
    public void A2(View btna2){
        String a = texta.getText().toString();
        int na = Integer.parseInt(a);
        texta.setText(String.valueOf(na+2));
    }
    public void A1(View btna1){
        String a = texta.getText().toString();
        int na = Integer.parseInt(a);
        texta.setText(String.valueOf(na+1));
    }
    public void B3(View btnb3){
        String b = textb.getText().toString();
        int nb = Integer.parseInt(b);
        textb.setText(String.valueOf(nb+3));
    }
    public void B2(View btnb2){
        String b = textb.getText().toString();
        int nb = Integer.parseInt(b);
        textb.setText(String.valueOf(nb+2));
    }
    public void B1(View btnb1){
        String b = textb.getText().toString();
        int nb = Integer.parseInt(b);
        textb.setText(String.valueOf(nb+1));
    }
    public void Reset(View button2){
        texta.setText(String.valueOf(0));
        textb.setText(String.valueOf(0));
    }
}