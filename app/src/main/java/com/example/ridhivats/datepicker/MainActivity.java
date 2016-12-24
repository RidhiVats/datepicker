package com.example.ridhivats.datepicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePicker.OnDateChangedListener {
    DatePicker dp=null;
    Calendar  cal=null;
    TextView mcDate=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       dp=(DatePicker)findViewById(R.id.mydatepicker);
       cal=Calendar.getInstance();
      mcDate=(TextView)findViewById(R.id.mychosendate);
        dp.init(dp.getYear(),dp.getMonth(),dp.getDayOfMonth(),this);
    }

    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        cal.set(year,monthOfYear,dayOfMonth);
        java.util.Date d=cal.getTime();
        mcDate.setText("String.valueOf(d.getMonth()+1)"+"/"+"String.valueOf(d.getDate())"+"/"+"String.valueOf(d.getYear()+1900)");
    }
}

