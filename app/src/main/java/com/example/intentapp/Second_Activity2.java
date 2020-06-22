package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Second_Activity2 extends AppCompatActivity {

    TextView class_ending2, last_class_ending;
    Button btn_swtich2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        class_ending2 = (TextView) findViewById(R.id.class_ending2);
        last_class_ending = (TextView) findViewById(R.id.credit);

        btn_swtich2 = (Button) findViewById(R.id.btn_swtich2);

        Bundle bundle = getIntent().getExtras();
        int self_credit = Integer.parseInt(bundle.getString("credit"));
        int credit = 128 - self_credit;

        last_class_ending.setText(Integer.toString(credit));

        btn_swtich2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Activity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}