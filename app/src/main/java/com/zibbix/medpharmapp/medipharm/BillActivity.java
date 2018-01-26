package com.zibbix.medpharmapp.medipharm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BillActivity extends AppCompatActivity {
    EditText name;
    EditText id ;
    EditText large;
    Button paybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        name = (EditText) findViewById(R.id.name_id);
        id = (EditText) findViewById(R.id.id_1);
        large = (EditText) findViewById(R.id.textfield);
        paybutton =(Button)findViewById(R.id.payment);
    }
}
