package com.example.hajar_000.medicalzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Signin extends AppCompatActivity {

    EditText uname,pswd;
    Button login, reg;
    DBOpenHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        uname=(EditText)findViewById(R.id.editText);
        pswd=(EditText)findViewById(R.id.editText2);
        reg=(Button)findViewById(R.id.button3);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent up=new Intent(Signin.this,Signup.class);
                startActivity(up);
            }
        });
        login=(Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=uname.getText().toString();
                String password=pswd.getText().toString();
                int id= checkUser(new DBAdapter(name, password));
                if(id==-1)
                {
                    Toast.makeText(Signin.this,"User Does Not Exist", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    // Toast.makeText(MainActivity.this,"User Exist "+name,Toast.LENGTH_SHORT).show();
                    Intent in=new Intent(getApplicationContext(),Circle.class);
                    startActivity(in);
                }
            }
        });
        db=new DBOpenHelper(Signin.this);
    }
    public int checkUser(DBAdapter user)
    {
        return db.checkUser(user);
    }

}


