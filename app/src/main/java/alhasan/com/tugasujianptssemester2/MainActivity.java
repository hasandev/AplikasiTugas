package alhasan.com.tugasujianptssemester2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btToSoal1, btToSoal2, btToSoal3, btToSoal4, btToSoal5, btToSoal6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Home Activity");

        btToSoal1 = (Button)findViewById(R.id.btToSoal1);
        btToSoal2 = (Button)findViewById(R.id.btToSoal2);
        btToSoal3 = (Button)findViewById(R.id.btToSoal3);
        btToSoal4 = (Button)findViewById(R.id.btToSoal4);
        btToSoal5 = (Button)findViewById(R.id.btToSoal5);
        btToSoal6 = (Button)findViewById(R.id.btToSoal6);

        btToSoal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToSoal1 = new Intent(MainActivity.this, Soal_1Activity.class);
                startActivity(ToSoal1);

            }
        });
        btToSoal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToSoal2 = new Intent(MainActivity.this, Soal_2Activity.class);
                startActivity(ToSoal2);

            }
        });
        btToSoal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToSoal3 = new Intent(MainActivity.this, Soal_3Activity.class);
                startActivity(ToSoal3);

            }
        });
        btToSoal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent btToSoal4 = new Intent(MainActivity.this, Soal_4Activity.class);
                startActivity(btToSoal4);

            }
        });
        btToSoal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToSoal5 = new Intent(MainActivity.this, Soal_5Activity.class);
                startActivity(ToSoal5);

            }
        });
        btToSoal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToSoal6 = new Intent(MainActivity.this, Soal_6Activity.class);
                startActivity(ToSoal6);

            }
        });

    }
}
