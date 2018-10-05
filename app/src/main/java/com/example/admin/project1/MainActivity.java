package com.example.admin.project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.admin.project1.R.layout.activity_main;

public class MainActivity extends Activity {
    private EditText edtSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        edtSignIn=(EditText) findViewById(R.id.tvSignIn);

        edtSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,SignIn.class);
                startActivity(intent);
            }
        });
    }
}
