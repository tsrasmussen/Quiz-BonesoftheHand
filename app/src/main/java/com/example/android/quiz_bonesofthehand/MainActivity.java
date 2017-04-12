package com.example.android.quiz_bonesofthehand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method evaluates the score when the submit answers button is pressed.
     */

    public void submitAnswers(View view) {
        int score = 0;

        // Evaluate answer for question 1
        RadioButton radioButtonQuestion1 = (RadioButton) findViewById(R.id.os_capitatum);
        if (radioButtonQuestion1.isChecked()) {
            score++;
        }

        // Evaluate answer for question 2
        RadioButton radioButtonQuestion2 = (RadioButton) findViewById(R.id.os_pisiforme);
        if (radioButtonQuestion2.isChecked()) {
            score++;
        }

        // Evaluate answer for question 3
        RadioButton radioButtonQuestion3 = (RadioButton) findViewById(R.id.os_lunatum);
        if (radioButtonQuestion3.isChecked()) {
            score++;
        }

        // Evaluate answer for question 4
        RadioButton radioButtonQuestion4 = (RadioButton) findViewById(R.id.os_lunatum);
        if (radioButtonQuestion4.isChecked()) {
            score++;
        }

        //Evaluate answer for question 5
        CheckBox checkBoxQuestion5Capitatum = (CheckBox) findViewById(R.id.check2_capitatum);
        boolean q5CapitatumIsChecked = checkBoxQuestion5Capitatum.isChecked();

        CheckBox checkBoxQuestion5Hamatum = (CheckBox) findViewById(R.id.check2_hamatum);
        boolean q5HamatumIsChecked = checkBoxQuestion5Hamatum.isChecked();

        CheckBox checkBoxQuestion5Lunatum = (CheckBox) findViewById(R.id.check2_lunatum);
        boolean q5LunatumIsChecked = checkBoxQuestion5Lunatum.isChecked();

        CheckBox checkBoxQuestion5Pisiforme = (CheckBox) findViewById(R.id.check2_pisiforme);
        boolean q5PisiformeIsChecked = checkBoxQuestion5Pisiforme.isChecked();

        CheckBox checkBoxQuestion5Scaphoideum = (CheckBox) findViewById(R.id.check2_scaphoideum);
        boolean q5ScaphoideumIsChecked = checkBoxQuestion5Scaphoideum.isChecked();

        CheckBox checkBoxQuestion5Trapezium = (CheckBox) findViewById(R.id.check2_trapezium);
        boolean q5TrapeziumIsChecked = checkBoxQuestion5Trapezium.isChecked();

        CheckBox checkBoxQuestion5Trapezoideum = (CheckBox) findViewById(R.id.check2_trapezoideum);
        boolean q5TrapezoideumIsChecked = checkBoxQuestion5Trapezoideum.isChecked();

        CheckBox checkBoxQuestion5Triquetrum = (CheckBox) findViewById(R.id.check2_triquetrum);
        boolean q5TriquetrumIsChecked = checkBoxQuestion5Triquetrum.isChecked();

        if (q5CapitatumIsChecked) {
            if (q5HamatumIsChecked) {
                if (!q5LunatumIsChecked) {
                    if (!q5PisiformeIsChecked) {
                        if (!q5ScaphoideumIsChecked) {
                            if (q5TrapeziumIsChecked) {
                                if (q5TrapezoideumIsChecked) {
                                    if (!q5TriquetrumIsChecked) {
                                        score++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //Evalutate answer for question 6
        EditText osTrapezium = (EditText) findViewById(R.id.os_trapezium);
        String answer6 = osTrapezium.getText().toString();
        boolean trapezium = "Os Trapezium".equals(answer6);
        if (trapezium) {
            score++;
        }

        //Evalutate answer for question 7
        EditText osScaphoideum = (EditText) findViewById(R.id.os_scaphoideum);
        String answer7 = osScaphoideum.getText().toString();
        boolean scaphoideum = "Os Scaphoideum".equals(answer7);
        if (scaphoideum) {
            score++;
        }

        //Evalutate answer for question 8
        EditText osTriquetrum = (EditText) findViewById(R.id.os_triquetrum);
        String answer8 = osTriquetrum.getText().toString();
        boolean triquetrum = "Os Triquetrum".equals(answer8);
        if (triquetrum) {
            score++;
        }

        //Evalutate answer for question 9
        EditText osHamatum = (EditText) findViewById(R.id.os_hamatum);
        String answer9 = osHamatum.getText().toString();
        boolean hamatum = "Os Hamatum".equals(answer9);
        if (triquetrum) {
            score++;
        }

        //Evaluate answer for question 10
        CheckBox checkBoxQuestion10Capitatum = (CheckBox) findViewById(R.id.check1_capitatum);
        boolean q10CapitatumIsChecked = checkBoxQuestion10Capitatum.isChecked();

        CheckBox checkBoxQuestion10Hamatum = (CheckBox) findViewById(R.id.check1_hamatum);
        boolean q10HamatumIsChecked = checkBoxQuestion10Hamatum.isChecked();

        CheckBox checkBoxQuestion10Lunatum = (CheckBox) findViewById(R.id.check1_lunatum);
        boolean q10LunatumIsChecked = checkBoxQuestion10Lunatum.isChecked();

        CheckBox checkBoxQuestion10Pisiforme = (CheckBox) findViewById(R.id.check1_pisiforme);
        boolean q10PisiformeIsChecked = checkBoxQuestion10Pisiforme.isChecked();

        CheckBox checkBoxQuestion10Scaphoideum = (CheckBox) findViewById(R.id.check1_scaphoideum);
        boolean q10ScaphoideumIsChecked = checkBoxQuestion10Scaphoideum.isChecked();

        CheckBox checkBoxQuestion10Trapezium = (CheckBox) findViewById(R.id.check1_trapezium);
        boolean q10TrapeziumIsChecked = checkBoxQuestion10Trapezium.isChecked();

        CheckBox checkBoxQuestion10Trapezoideum = (CheckBox) findViewById(R.id.check1_trapezoideum);
        boolean q10TrapezoideumIsChecked = checkBoxQuestion10Trapezoideum.isChecked();

        CheckBox checkBoxQuestion10Triquetrum = (CheckBox) findViewById(R.id.check1_triquetrum);
        boolean q10TriquetrumIsChecked = checkBoxQuestion10Triquetrum.isChecked();

        if (!q10CapitatumIsChecked) {
            if (!q10HamatumIsChecked) {
                if (q10LunatumIsChecked) {
                    if (q10PisiformeIsChecked) {
                        if (q10ScaphoideumIsChecked) {
                            if (!q10TrapeziumIsChecked) {
                                if (!q10TrapezoideumIsChecked) {
                                    if (q10TriquetrumIsChecked) {
                                        score++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Show score
        TextView namefield = (TextView) findViewById(R.id.name_field);
        String name = namefield.getText().toString();

        if (score < 4) {
            Toast.makeText(this, "This is disappointing, " + name + "\nYour scored: " + score + " out of 10" + "\nYou better study some more", Toast.LENGTH_LONG).show();
        } else if (score < 7) {
            Toast.makeText(this, "You need to practice more, " + name + "\nYour scored: " + score + " out of 10" + "\nYou are getting there", Toast.LENGTH_LONG).show();
        } else if (score < 9) {
            Toast.makeText(this, "You are so close to kniwing it all, " + name + "\nYour scored: " + score + " out of 10" + "\nYou nearly got it all sussed out", Toast.LENGTH_LONG).show();
        } else if (score == 10) {
            Toast.makeText(this, name + "!" + "\nYour scored: " + score + " out of 10" + "\nYou are a genius!", Toast.LENGTH_LONG).show();
        }

    }
}

