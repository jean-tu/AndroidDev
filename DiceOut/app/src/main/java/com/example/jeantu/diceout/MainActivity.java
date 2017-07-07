package com.example.jeantu.diceout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Text to hold the roll result text
    TextView rollResult;

    // Field to hold the roll button
    Button rollButton;

    //Field to hold the score
    int score;

    Random rand; //random generator for the dice

    //Fields to hold the die value that will be added to the arry list
    int die1, die2, die3;

    //ArrayList to hold the 3 die
    ArrayList<Integer> dice; //must be initialized later on

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Setting the initial score
        score = 0;

        rollResult = (TextView)findViewById(R.id.rollResult); // have to add a cast to convert it to a TextView
        rollButton = (Button)findViewById(R.id.rollButton);

        //Create greeting
        Toast.makeText(getApplicationContext(), "Welcome to DiceOut", Toast.LENGTH_SHORT).show();

        //Initialize the random number generator
        rand = new Random();

        //Create ArrayList container for the dice values
        dice = new ArrayList<Integer>();
    }

    public void rollDice(View v){

        rollResult.setText("Clicked!");

        // Roll dice
        die1 = rand.nextInt(6)+1;
        die2 = rand.nextInt(6)+1;
        die3 = rand.nextInt(6)+1;

        //Set the dice values into the array list (you have to clear the old ones if they have rolled once before)
        dice.clear();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);

        //Build message with the result
        String msg = "You rolled a " + die1 + " and " + die2 + " ,and " + die3;

        //update the app to display result message
        rollResult.setText(msg);
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
}
