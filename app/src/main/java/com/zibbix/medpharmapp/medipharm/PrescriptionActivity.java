package com.zibbix.medpharmapp.medipharm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PrescriptionActivity extends AppCompatActivity {
    EditText prescriptiontxt;
Button nxtbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescription);

        prescriptiontxt=(EditText)findViewById(R.id.prestxt);
nxtbutton=(Button)findViewById(R.id.button2);


    }
}
