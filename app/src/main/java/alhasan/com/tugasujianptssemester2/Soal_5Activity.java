package alhasan.com.tugasujianptssemester2;

import android.content.DialogInterface;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Soal_5Activity extends AppCompatActivity {

    EditText etInputSoal5;
    Button btAlertDialogSoal5, btSnackbarSoal5, btToastSoal5;
    AlertDialog.Builder AlertDialogSoal5;
    Snackbar SnackbarSoal5;
    CoordinatorLayout clSoal5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_5);

        clSoal5 = (CoordinatorLayout)findViewById(R.id.clSoal5);
        etInputSoal5 = (EditText)findViewById(R.id.etInputSoal5);
        btAlertDialogSoal5 = (Button)findViewById(R.id.btAlertDialogSoal5);
        btSnackbarSoal5 = (Button)findViewById(R.id.btSnackbarSoal5);
        btToastSoal5 = (Button)findViewById(R.id.btToastSoal5);
        AlertDialogSoal5 = new AlertDialog.Builder(this);

        btAlertDialogSoal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialogSoal5.setTitle("Tampilkan").setMessage(etInputSoal5.getText().toString()).setNegativeButton("Tutup", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                AlertDialog runDialog = AlertDialogSoal5.create();
                runDialog.show();

            }
        });

        btSnackbarSoal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SnackbarSoal5.make(clSoal5,etInputSoal5.getText().toString(), Snackbar.LENGTH_LONG).show();

            }
        });

        btToastSoal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Soal_5Activity.this,etInputSoal5.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });

    }
}
