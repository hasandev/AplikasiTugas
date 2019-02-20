package alhasan.com.tugasujianptssemester2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Soal_6_SecondActivity extends AppCompatActivity {

    TextView tvwLoading;
    Button btnIntentBiasa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_6__second);


        getSupportActionBar().setTitle("Second Activity");

        tvwLoading = (TextView) findViewById(R.id.tvLoading);

        Intent getData = getIntent();
        String getNamaSiswa = getData.getStringExtra("Imputan");

        tvwLoading.setText(getNamaSiswa);
        btnIntentBiasa = (Button) findViewById(R.id.btSecondToIntent);


        btnIntentBiasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SecondToMain;
                SecondToMain = new Intent(Soal_6_SecondActivity.this, MainActivity.class);
                startActivity(SecondToMain);
                finish();

            }
        });

    }

}