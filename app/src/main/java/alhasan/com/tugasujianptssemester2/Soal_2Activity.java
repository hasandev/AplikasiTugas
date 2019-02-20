package alhasan.com.tugasujianptssemester2;

import android.content.DialogInterface;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Soal_2Activity extends AppCompatActivity {

    Button btAlertDialog;
    AlertDialog.Builder alertCase8;
    CoordinatorLayout clCase8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_2);

        btAlertDialog = (Button)findViewById(R.id.btAlertDialog);
        clCase8 = (CoordinatorLayout)findViewById(R.id.clCase8);
        alertCase8 = new AlertDialog.Builder(this);

        btAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertCase8.setTitle("Alert Dialog").setMessage("Hello Rabbannii").setNegativeButton("Tutup", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                AlertDialog runDialog = alertCase8.create();
                runDialog.show();

            }
        });

    }
}
