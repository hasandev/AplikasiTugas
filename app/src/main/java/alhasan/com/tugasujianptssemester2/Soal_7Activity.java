package alhasan.com.tugasujianptssemester2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Soal_7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_7);
        Handler TahanSplash = new Handler();
        TahanSplash.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pindahke_home = new Intent(Soal_7Activity.this, MainActivity.class);
                startActivity(pindahke_home);

            }
        }, 5000);
    }
}
