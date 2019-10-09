package com.example.ranyass.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    RadioButton RB_his,RB_her,RB_hers,RB_your,RB_atSchool,RB_atEight,RB_forThreHourse,RB_NoHeIsnt;
    Switch switchQ1,switchQ2;
    Button Btn_Checkanswers;
    EditText question6;
    CheckBox ever,once,stop,even;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchQ1 = findViewById(R.id.switch1);
        switchQ2 = findViewById(R.id.switch2);

        RB_his = findViewById(R.id.radioButton_his);
        RB_his.setOnClickListener(this);
        RB_her = findViewById(R.id.radioButton_her);
        RB_her.setOnClickListener(this);
        RB_hers = (RadioButton) findViewById(R.id.radioButton_hers);
        RB_hers.setOnClickListener(this);
        RB_your = (RadioButton) findViewById(R.id.radioButton_your);
        RB_your.setOnClickListener(this);

        RB_atSchool = findViewById(R.id.radioButton_atSchool);
        RB_atSchool.setOnClickListener(this);
        RB_atEight = findViewById(R.id.radioButton_atEight);
        RB_atEight.setOnClickListener(this);
        RB_forThreHourse = findViewById(R.id.radioButton_forThreHours);
        RB_forThreHourse.setOnClickListener(this);
        RB_NoHeIsnt = findViewById(R.id.radioButton_NoHeIsnt);
        RB_NoHeIsnt.setOnClickListener(this);

        even = findViewById(R.id.checkBox_even);
        ever = findViewById(R.id.checkBox_ever);
        once = findViewById(R.id.checkBox_once);
        stop = findViewById(R.id.checkBox_stop);

        question6 = findViewById(R.id.editText2);

        Btn_Checkanswers = findViewById(R.id.button);
        Btn_Checkanswers.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
switch (view.getId())
{
    case R.id.radioButton_his:
        changeSelection("radioButton_his");
        break;
    case R.id.radioButton_her:
        changeSelection("radioButton_her");
        break;
    case R.id.radioButton_hers:
        changeSelection("radioButton_hers");
        break;
    case R.id.radioButton_your:
        changeSelection("radioButton_your");
        break;
    case R.id.radioButton_atSchool:
        changeSelection("radioButton_atSchool");
        break;
    case R.id.radioButton_atEight:
        changeSelection("radioButton_atEight");
        break;
    case R.id.radioButton_forThreHours:
        changeSelection("radioButton_forThreHours");
        break;
    case R.id.radioButton_NoHeIsnt:
        changeSelection("radioButton_NoHeIsnt");
        break;
    case R.id.button:
        checkAnswers();
        break;
}
    }
    public void changeSelection(String selected_RB)
    {
        RadioButton RB1 = findViewById(R.id.radioButton_his);
        RadioButton RB2 = findViewById(R.id.radioButton_her);
        RadioButton RB3 = findViewById(R.id.radioButton_hers);
        RadioButton RB4 = findViewById(R.id.radioButton_your);

        RadioButton RB5 = findViewById(R.id.radioButton_atSchool);
        RadioButton RB6 = findViewById(R.id.radioButton_atEight);
        RadioButton RB7 = findViewById(R.id.radioButton_forThreHours);
        RadioButton RB8 = findViewById(R.id.radioButton_NoHeIsnt);

        switch (selected_RB)
        {
            case "radioButton_his":
                RB1.setChecked(true);
                RB2.setChecked(false);
                RB3.setChecked(false);
                RB4.setChecked(false);
                break;
            case "radioButton_her":
                RB1.setChecked(false);
                RB2.setChecked(true);
                RB3.setChecked(false);
                RB4.setChecked(false);
                break;
            case "radioButton_hers":
                RB1.setChecked(false);
                RB2.setChecked(false);
                RB3.setChecked(true);
                RB4.setChecked(false);
                break;
            case "radioButton_your":
                RB1.setChecked(false);
                RB2.setChecked(false);
                RB3.setChecked(false);
                RB4.setChecked(true);
                break;
            case "radioButton_atSchool":
                RB5.setChecked(true);
                RB6.setChecked(false);
                RB7.setChecked(false);
                RB8.setChecked(false);
                break;
            case "radioButton_atEight":
                RB5.setChecked(false);
                RB6.setChecked(true);
                RB7.setChecked(false);
                RB8.setChecked(false);
                break;
            case "radioButton_forThreHours":
                RB5.setChecked(false);
                RB6.setChecked(false);
                RB7.setChecked(true);
                RB8.setChecked(false);
                break;
            case "radioButton_NoHeIsnt":
                RB5.setChecked(false);
                RB6.setChecked(false);
                RB7.setChecked(false);
                RB8.setChecked(true);
                break;
        }
    }
    public void checkAnswers()
    {
        int Answers=0;

        if(switchQ1.isChecked())
            Answers++;

        if(switchQ2.isChecked())
            Answers++;

        if(RB_her.isChecked())
            Answers++;

        if(RB_atSchool.isChecked())
            Answers++;

        if(question6.getText().toString().matches("years"))
            Answers++;

        if(even.isChecked() && ever.isChecked() && once.isChecked() && !stop.isChecked())
            Answers++;

//you have answer 5 questions correctly out of 6 questions
        Toast.makeText(MainActivity.this,"you have answer "+Integer.toString(Answers)+" questions correctly out of 6 questions", Toast.LENGTH_LONG).show();
    }
}
