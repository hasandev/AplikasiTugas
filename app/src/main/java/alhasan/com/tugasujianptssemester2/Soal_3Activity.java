package alhasan.com.tugasujianptssemester2;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Soal_3Activity extends AppCompatActivity {

    Button btSnackbar;
    CoordinatorLayout clSoal9;
    Snackbar snackbarSoal9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_3);

        btSnackbar = (Button)findViewById(R.id.btSnackbar);
        clSoal9 = (CoordinatorLayout)findViewById(R.id.clCase9);

        btSnackbar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                snackbarSoal9 = Snackbar.make(clSoal9, "Hello Rabbannii", Snackbar.LENGTH_LONG);
                snackbarSoal9.show();
            }
        });

    }
}
