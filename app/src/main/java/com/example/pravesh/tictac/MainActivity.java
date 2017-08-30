package com.example.pravesh.tictac;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int c=2;



    public void click1(View view){
        if(c%2==0)
        {
            display1("X");
            c++;

        }
        else
        {
            display1("0");
            c++;
        }
    }
    public void click2(View view){
        if(c%2==0)
        {
            display2("X");
            c++;
        }
        else
        {
            display2("0");
            c++;
        }
    }
    public void click3(View view){
        if(c%2==0)
        {
            display3("X");
            c++;
        }
        else
        {
            display3("0");
            c++;
        }
    }
    public void click4(View view){
        if(c%2==0)
        {
            display4("X");
            c++;
        }
        else
        {
            display4("0");
            c++;
        }
    }
    public void click5(View view){
        if(c%2==0)
        {
            display5("X");
            c++;
        }
        else
        {
            display5("0");
            c++;
        }
    }
    public void click6(View view){
        if(c%2==0)
        {
            display6("X");
            c++;
        }
        else
        {
            display6("0");
            c++;
        }
    }
    public void click7(View view){
        if(c%2==0)
        {
            display7("X");
            c++;
        }
        else
        {
            display7("0");
            c++;
        }
    }
    public void click8(View view){
        if(c%2==0)
        {
            display8("X");
            c++;
        }
        else
        {
            display8("0");
            c++;
        }
    }
    public void click9(View view){
        if(c%2==0)
        {
            display9("X");
            c++;
        }
        else
        {
            display9("0");
            c++;
        }
    }





    public void reset(View view){
         c=2;
        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);
        Button b4=(Button) findViewById(R.id.button4);
        Button b5=(Button) findViewById(R.id.button5);
        Button b6=(Button) findViewById(R.id.button6);
        Button b7=(Button) findViewById(R.id.button7);
        Button b8=(Button) findViewById(R.id.button8);
        Button b9=(Button) findViewById(R.id.button9);
        display1("");
        display2("");
        display3("");
        display4("");
        display5("");
        display6("");
        display7("");
        display8("");
        display9("");
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

    }

    private void display1(String s) {

        Button b1=(Button) findViewById(R.id.button1);
        b1.setText(s);
        b1.setEnabled(false);
        endgame();
    }
    private void display2(String s) {

        Button b2=(Button) findViewById(R.id.button2);

        b2.setText(s);
        b2.setEnabled(false);
        endgame();
    }
    private void display3(String s) {
        Button b3=(Button) findViewById(R.id.button3);

        b3.setText(s);
       b3.setEnabled(false);
        endgame();
    }
    private void display4(String s) {
        Button b4=(Button) findViewById(R.id.button4);

        b4.setText(s);
       b4.setEnabled(false);
        endgame();
    }
    private void display5(String s) {

        Button b5=(Button) findViewById(R.id.button5);

        b5.setText(s);
        b5.setEnabled(false);
        endgame();
    }
    private void display6(String s) {
        Button b6=(Button) findViewById(R.id.button6);

        b6.setText(s);
        b6.setEnabled(false);
        endgame();
    }
    private void display7(String s) {
        Button b7=(Button) findViewById(R.id.button7);

        b7.setText(s);
        b7.setEnabled(false);
        endgame();
    }
    private void display8(String s) {

        Button b8=(Button) findViewById(R.id.button8);

        b8.setText(s);
        b8.setEnabled(false);
        endgame();
    }
    private void display9(String s) {

        Button b9=(Button) findViewById(R.id.button9);
        b9.setText(s);
        b9.setEnabled(false);
        endgame();
    }
    public void disable(){
        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);
        Button b4=(Button) findViewById(R.id.button4);
        Button b5=(Button) findViewById(R.id.button5);
        Button b6=(Button) findViewById(R.id.button6);
        Button b7=(Button) findViewById(R.id.button7);
        Button b8=(Button) findViewById(R.id.button8);
        Button b9=(Button) findViewById(R.id.button9);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);


    }
    public void endgame(){
        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);
        Button b4=(Button) findViewById(R.id.button4);
        Button b5=(Button) findViewById(R.id.button5);
        Button b6=(Button) findViewById(R.id.button6);
        Button b7=(Button) findViewById(R.id.button7);
        Button b8=(Button) findViewById(R.id.button8);
        Button b9=(Button) findViewById(R.id.button9);
        String a,b,c,d,e,f,g,h,i;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        if (a.equals("X")&& b.equals("X") && c.equals("X")){

            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            disable();


        }

        if (d.equals("X")&& e.equals("X") && f.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (g.equals("X")&& h.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (a.equals("X")&& d.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (b.equals("X")&& e.equals("X") && h.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (c.equals("X")&& f.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (a.equals("X")&& e.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (c.equals("X")&& e.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            disable();
        }


        if (a.equals("0")&& b.equals("0") && c.equals("0")){

            Toast.makeText(MainActivity.this, "Winner Player 0!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (d.equals("0")&& e.equals("0") && f.equals("0")){
            Toast.makeText(MainActivity.this, "Winner Player 0!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (g.equals("0")&& h.equals("0") && i.equals("0")){
            Toast.makeText(MainActivity.this, "Winner Player 0!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (a.equals("0")&& d.equals("0") && g.equals("0")){
            Toast.makeText(MainActivity.this, "Winner Player 0!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (b.equals("0")&& e.equals("0") && h.equals("0")){
            Toast.makeText(MainActivity.this, "Winner Player 0!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (c.equals("0")&& f.equals("0") && i.equals("0")){
            Toast.makeText(MainActivity.this, "Winner Player 0!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (a.equals("0")&& e.equals("0") && i.equals("0")){
            Toast.makeText(MainActivity.this, "Winner Player 0!", Toast.LENGTH_LONG).show();
            disable();
        }

        if (c.equals("0")&& e.equals("0") && g.equals("0")){
            Toast.makeText(MainActivity.this, "Winner Player 0!", Toast.LENGTH_LONG).show();
            disable();
        }

    }
}
