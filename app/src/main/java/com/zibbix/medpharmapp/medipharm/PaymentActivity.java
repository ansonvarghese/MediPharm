package com.zibbix.medpharmapp.medipharm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {
EditText bill;
EditText utext;
EditText ptext;
EditText amtext;
Button pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        bill=findViewById(R.id.billid);
        utext=findViewById(R.id.username_id);
        ptext=findViewById(R.id.pwd_id);
        amtext=findViewById(R.id.amount_id);
        pay=findViewById(R.id.pay_button);

        pay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
           //firebase sent these data

            }
        });

    }
}
