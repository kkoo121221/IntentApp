package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button click;
    TextView swtich_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        click = (Button) findViewById(R.id.btn_swtich);
        swtich_txt = (TextView) findViewById(R.id.class_over);
        final EditText num1 = (EditText) findViewById(R.id.num1);
        final Toast toast = Toast.makeText(this, "請輸入學分數", Toast.LENGTH_LONG);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!("".equals(num1.getText().toString()))) {
                    Intent intent = new Intent(MainActivity.this, Second_Activity2.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("credit", num1.getText().toString());
                    intent.putExtras(bundle);

                    startActivity(intent);
                    num1.setText("");
                }else{
                    toast.show();
                }
            }
        });
    }
}
