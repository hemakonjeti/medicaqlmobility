package com.example.hajar_000.medicalzone;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

public class Circle extends AppCompatActivity {
    CircleMenu c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle2);



            c=(CircleMenu)findViewById(R.id.circle);
            c.setMainMenu(Color.parseColor("#CDCDCD"),R.mipmap.heart,R.mipmap.hospital);
            c.addSubMenu(Color.parseColor("#258CFF"),R.mipmap.icon);
            c.addSubMenu(Color.parseColor("#30A400"),R.mipmap.cal);
            c.addSubMenu(Color.parseColor("#FF4B32"),R.mipmap.newspaper);
            c.addSubMenu(Color.parseColor("#BA39FF"),R.mipmap.placeholder);
            c.addSubMenu(Color.parseColor("#FF6A00"),R.mipmap.phonereceiver);

            c.setOnMenuSelectedListener(new OnMenuSelectedListener() {
                @Override
                public void onMenuSelected(int index) {
                    switch (index){
                        case 0:
                            Toast.makeText(Circle.this,"Pharmacy ONline stores ",Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(Circle.this,Grid.class);
                            startActivity(i);

                            break;
                        case 1:
                            Toast.makeText(Circle.this,"BMI Calculator ",Toast.LENGTH_SHORT).show();
                            Intent b = new Intent(Circle.this,BmiCalculator.class);
                            startActivity(b);
                            break;
                        case 2:
                            Toast.makeText(Circle.this,"News feed page ",Toast.LENGTH_SHORT).show();
                            Intent c = new Intent(Circle.this,Newsfeed.class);
                            startActivity(c);
                            break;
                        case 3:
                            Toast.makeText(Circle.this,"Map page ",Toast.LENGTH_SHORT).show();
                            Intent e = new Intent(Circle.this,MapsActivity.class);
                            startActivity(e);

                            break;
                        case 4:
                            Toast.makeText(Circle.this,"Telephonic page ",Toast.LENGTH_SHORT).show();
                            Intent f = new Intent(Circle.this,Telephonic.class);
                            startActivity(f);
                            break;
                    }

                }
            });
            c.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {
                @Override
                public void onMenuOpened() {
                    Toast.makeText(Circle.this,"menu opened",Toast.LENGTH_SHORT).show();

                }

                @Override
                public void onMenuClosed() {
                    Toast.makeText(Circle.this,"menu closed",Toast.LENGTH_SHORT).show();

                }
            });
        }

        @Override
        public void onBackPressed() {
            if (c.isOpened())
                c.closeMenu();
            else
                finish();
        }
    }


