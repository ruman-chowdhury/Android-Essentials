package com.example.user.singlelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class ShowDetails extends AppCompatActivity {

    ImageView imageView;
    TextView textViewHeading;
    JustifyTextView justifyTextView;

    // https://github.com/ufo22940268/android-justifiedtextview
    //Link for justify textview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        imageView = (ImageView) findViewById(R.id.idImg);
        textViewHeading = (TextView) findViewById(R.id.idTvHeading);
        justifyTextView = (JustifyTextView) findViewById(R.id.idTv);



        Bundle b = getIntent().getExtras(); //get string from another activity

        if (b != null){

            String cName = b.getString("name");

            displayName(cName); //pass the string
        }


    } //end onCreate



    public void displayName(String countryName){

       if(countryName.equals("america")){

           imageView.setImageResource(R.drawable.america);
           textViewHeading.setText(R.string.america_heading);
           justifyTextView.setText(R.string.america_text);
       }
        if(countryName.equals("bangladesh")){

            imageView.setImageResource(R.drawable.bd);
            textViewHeading.setText(R.string.bangladesh_heading);
            justifyTextView.setText(R.string.bangladesh_text);
        }

        if(countryName.equals("canada")){

            imageView.setImageResource(R.drawable.canada);
            textViewHeading.setText(R.string.canada_heading);
            justifyTextView.setText(R.string.canada_text);
        }

        if(countryName.equals("japan")){

            imageView.setImageResource(R.drawable.japan);
            textViewHeading.setText(R.string.japan_heading);
            justifyTextView.setText(R.string.japan_text);
        }

        if(countryName.equals("london")){

            imageView.setImageResource(R.drawable.london);
            textViewHeading.setText(R.string.london_heading);
            justifyTextView.setText(R.string.london_text);
        }

        if(countryName.equals("pakistan")){

            imageView.setImageResource(R.drawable.pakistan);
            textViewHeading.setText(R.string.pakistan_heading);
            justifyTextView.setText(R.string.pakistan_text);
        }

    }



}
