package com.example.mobileappdevelop.datetimepicker;

import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
private Calendar calendar;
    int year,month,day,hour,min;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        day=calendar.get(Calendar.DAY_OF_MONTH);
        hour=calendar.get(Calendar.HOUR_OF_DAY);
        min=calendar.get(Calendar.MINUTE);
    }



    public void selectDate(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                dateSetListener,year,month,day);
        datePickerDialog.show();
    }
   DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
       @TargetApi(Build.VERSION_CODES.N)
       @Override
       public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
           SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
           ((Button)findViewById(R.id.datebuttonid)).setText(sdf.format(new Date()));
       }
   };
    public void selectTime(View view) {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                timeSetListener,hour,min,true);
        timePickerDialog.show();
    }
    TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener() {
        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            calendar.set(0,0,0,hourOfDay,minute);
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
            String time = sdf.format(calendar.getTime());
            ((Button)findViewById(R.id.tiembuttonid)).setText(time);
        }
    };
}
