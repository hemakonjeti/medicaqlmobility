package com.example.hajar_000.medicalzone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UploadPost extends AppCompatActivity {
    EditText editText_post;
    String uploadpost;
    InsertDBAdapter dbAdapter;
    Button submit,cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_post);
        submit = (Button) findViewById(R.id.button5);
        cancel = (Button) findViewById(R.id.button6);
        editText_post = (EditText) findViewById(R.id.insert_editText_post);
        dbAdapter = new InsertDBAdapter(getApplicationContext());
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                uploadpost = editText_post.getText().toString();


                long response = dbAdapter.insertValues(uploadpost);
                if (response == -1) {
                    Toast.makeText(getApplicationContext(), "Data failed to Uploaded ",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Data Uploaded successfully", Toast.LENGTH_LONG).show();
                }
                finish();
            }
        });


        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbAdapter.closeConnection();
    }

}





