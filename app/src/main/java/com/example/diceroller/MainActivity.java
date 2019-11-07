package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int correct_counter = 1;

    public static int Roll_the_dice() {
        Random r = new Random();
        int number = r.nextInt(6);
        return number;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void on_button_click(View view) {
        int Roll = Roll_the_dice();
        TextView tv3 = this.findViewById(R.id.textView3);
        TextView et = this.findViewById(R.id.editText);
        TextView tv = this.findViewById(R.id.textView2);

        tv.setText(Integer.toString(Roll));
        String value = et.getText().toString();
        int Fvalue = Integer.parseInt(value);

        if (Roll == Fvalue) {

            tv.setText(String.valueOf(Roll) + " " + "Congratulations!");
            tv3.setText(String.valueOf(correct_counter));
            correct_counter++;
        }


    }

    public void on_button_click_icebreaker(View view) {
        int Roll = Roll_the_dice();

        TextView tv = this.findViewById(R.id.textView2);

        if (Roll == 1)
            tv.setText("If you could go anywhere in the world, where would you go?");
        if (Roll == 2)
                tv.setText("If you were stranded on a desert island, what three things would you want to take with you?");
        if (Roll == 3)
                tv.setText("If you could eat only one food for the rest of your life, what would that be?");
        if (Roll == 4)
                tv.setText("If you won a million dollars, what is the first thing you would buy?");
        if (Roll == 5)
                tv.setText("If you could spaned the day with one fictional character, who would it be?");
        if (Roll == 6)
                tv.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");



    }
    public void on_button_click_Finish(View view) {

    }
}
