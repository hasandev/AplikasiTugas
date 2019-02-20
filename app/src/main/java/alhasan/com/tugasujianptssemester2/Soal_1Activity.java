package alhasan.com.tugasujianptssemester2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Soal_1Activity extends AppCompatActivity {

    Button btToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_1);

        btToast = (Button)findViewById(R.id.btToast);

        btToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Soal_1Activity.this, "Hello Rabbannii", Toast.LENGTH_LONG).show();
            }
        });

    }
}
