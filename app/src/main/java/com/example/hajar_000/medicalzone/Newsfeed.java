package com.example.hajar_000.medicalzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Newsfeed extends AppCompatActivity {
Button bt1,bt2;
        InsertDBAdapter dbAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_newsfeed);
            bt1=(Button)findViewById(R.id.button2);
            bt2=(Button)findViewById(R.id.button4);
            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(getApplicationContext(),UploadPost.class);
                    startActivity(intent);
                }
            });
bt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent in=new Intent(getApplicationContext(),ViewPost.class);
        startActivity(in);
    }
});
            dbAdapter = new InsertDBAdapter(getApplicationContext());
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            dbAdapter.closeConnection();
        }

    }



