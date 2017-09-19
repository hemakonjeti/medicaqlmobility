package com.example.hajar_000.medicalzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    EditText uname,pswd;
    Button login,cancel;
    DBOpenHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        uname=(EditText)findViewById(R.id.editText);
        pswd=(EditText)findViewById(R.id.editText2);
        login=(Button)findViewById(R.id.button);
        cancel=(Button)findViewById(R.id.button2);
        cancel.setOnClickListener(new View.OnClickListener() {
            @ Override
            public void onClick(View v) {
                uname.setText("");
                pswd.setText("");
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = uname.getText().toString();
                String password = pswd.getText().toString();
                db=new DBOpenHelper(Signup.this);
                db.addUser(new DBAdapter(name,password));
                if(uname.equals("")||password.equals(""))
                {
                    Toast.makeText(Signup.this,"Please Enter Username and Password",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    db.addUser(new DBAdapter(name,password));

                    Toast.makeText(Signup.this,"User was Successfully added to Database",Toast.LENGTH_SHORT).show();
                    Intent in=new Intent(getApplicationContext(),Signin.class);
                    startActivity(in);
                }
            }
        });
    }

}
