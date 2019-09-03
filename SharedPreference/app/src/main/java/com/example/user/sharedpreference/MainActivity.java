package com.example.user.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText usernameET,passwordET;
    private Button save,show;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameET = (EditText) findViewById(R.id.idUsername);
        passwordET = (EditText) findViewById(R.id.idPassword);

        save = (Button) findViewById(R.id.idButtonSave);
        show = (Button) findViewById(R.id.idButtonShow);

        textView = (TextView) findViewById(R.id.idTextView);


        save.setOnClickListener(this);
        show.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.idButtonSave){

            String username = usernameET.getText().toString();
            String password = passwordET.getText().toString();

            if(username.equals(" ") && password.equals(" ")){
                Toast.makeText(getApplicationContext(),"Data filed Empty !",Toast.LENGTH_SHORT).show();
            }
            else {
                //writing data to SharedPreferences
                SharedPreferences sp = getSharedPreferences("userDetails", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();

                editor.putString("usernameKey", username);
                editor.putString("passwordKey", password);
                editor.commit();
                Toast.makeText(getApplicationContext(),"Data stored successfully !",Toast.LENGTH_SHORT).show();

                usernameET.setText(" "); //ET field will be empty after saving data
                passwordET.setText(" ");
            }

        }
        else if(v.getId() == R.id.idButtonShow){
            //create class of SharedPreferences
            SharedPreferences sp = getSharedPreferences("userDetails", Context.MODE_PRIVATE);

            if(sp.contains("usernameKey") && sp.contains("passwordKey")){

                String username = sp.getString("usernameKey","Username Not Found !");
                String password =sp.getString("passwordKey","Password Not Found !");

                textView.setText(username +"\n"+ password);
            }

        }


    }
}
