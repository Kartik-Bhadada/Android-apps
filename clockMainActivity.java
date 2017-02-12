package com.example.clock; // Clock package for analog and digital clocks in this project
import android.app.Activity; // Required to create an activity.
import android.os.Bundle; // A mapping from String values to various Parcelable types.
import android.widget.AnalogClock;  // Required to create an analog clock
import android.widget.DigitalClock;  // Required to create an digital clock
 public class Clock extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState) {  // all classes should extend activity
                super.onCreate(savedInstanceState); // Create a new activity
                setContentView(R.layout.activity_clock);// Displays the main screen for Clocks
                AnalogClock analog = (AnalogClock) findViewById(R.id.analog_clock);
                //analog clock
                DigitalClock digital = (DigitalClock) findViewById(R.id.digital_clock);
                //digital clock
        }
 }