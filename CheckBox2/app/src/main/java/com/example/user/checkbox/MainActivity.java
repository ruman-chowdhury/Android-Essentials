package com.example.user.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static com.example.user.checkbox.R.id.CB_php;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbPhp,cbJava,cbPython,cbJs;
    private Button btnShow;
    private TextView tvChoice,tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbPhp = (CheckBox) findViewById(CB_php);
        cbJava = (CheckBox) findViewById(R.id.CB_java);
        cbPython = (CheckBox) findViewById(R.id.CB_python);
        cbJs = (CheckBox) findViewById(R.id.CB_js);

        btnShow = (Button) findViewById(R.id.buttonShow);

        tvChoice = (TextView) findViewById(R.id.TVchoice);
        tvDisplay = (TextView) findViewById(R.id.TVdisplay);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder stringBuilder = new StringBuilder();

                String valuePhp = cbPhp.getText().toString();
                String valueJava = cbJava.getText().toString();
                String valuePython = cbPython.getText().toString();
                String valueJs = cbJs.getText().toString();

                if(cbPhp.isChecked()){

                    stringBuilder.append(valuePhp +" is selected\n");
                }
                if(cbJava.isChecked()){

                    stringBuilder.append(valueJava +" is selected\n");
                }
                if(cbPython.isChecked()){

                    stringBuilder.append(valuePython +" is selected\n");
                }
                if(cbJs.isChecked()){

                    stringBuilder.append(valueJs +" is selected\n");
                }

                tvDisplay.setText(stringBuilder);
            }
        });
    }
}
