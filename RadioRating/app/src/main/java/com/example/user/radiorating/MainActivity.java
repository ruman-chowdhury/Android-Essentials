package com.example.user.radiorating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    private TextView tvResultRadio,tvResultRating;
    private Button buttonShow;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.RG);

        tvResultRadio = (TextView) findViewById(R.id.tvRadio);
        tvResultRating = (TextView) findViewById(R.id.tvRating);

        buttonShow = (Button) findViewById(R.id.btnDisplay);
        ratingBar = (RatingBar) findViewById(R.id.ratingbar);

        //Radiobutton
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);

                String value = radioButton.getText().toString();
                tvResultRadio.setText(value +" is selected");

            }
        });


        //Ratingbar
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                tvResultRating.setText("Value: "+v);
            }
        });

    }
}
