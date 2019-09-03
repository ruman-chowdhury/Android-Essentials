package com.bitm.mobileappdevelop.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String>languages; //String type language
    private String selectedLanguage;

    private RadioGroup genderRG;
    private String gender="";

    private Spinner citySP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languages = new ArrayList<>();
        genderRG = (RadioGroup) findViewById(R.id.genderRG);
    }

    public void setSelectLanguage(View view){

        CheckBox cb = (CheckBox) view;
        boolean status = cb.isChecked();

        selectedLanguage = cb.getText().toString();

        switch (view.getId()){

            case R.id.javaCB:
                if(status){
                    languages.add(selectedLanguage);
                }
                else {
                    languages.remove(selectedLanguage);
                }

            case R.id.phpCB:
                if(status){
                    languages.add(selectedLanguage);
                }
                else {
                    languages.remove(selectedLanguage);
                }

            case R.id.pythonCB:
                if(status){
                    languages.add(selectedLanguage);
                }
                else {
                    languages.remove(selectedLanguage);
                }
        }

    }
}
