package alhasan.com.tugasujianptssemester2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Soal_6Activity extends AppCompatActivity {

    //EditText etxNamaLengkap, etxAlamat, etxNoTelp, etxjeniskelamin;
    //Button btnKirim;
    AlertDialog.Builder builder;
    @BindView(R.id.etNamaLengkap)
    EditText etNamaLengkap;
    @BindView(R.id.etAlamat)
    EditText etAlamat;
    @BindView(R.id.etNoTelp)
    EditText etNoTelp;
    @BindView(R.id.etJenisKelamin)
    EditText etJenisKelamin;
    @BindView(R.id.btKirim)
    Button btKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_6);
        ButterKnife.bind(this);

        etNamaLengkap = (EditText) findViewById(R.id.etNamaLengkap);
        etAlamat = (EditText) findViewById(R.id.etAlamat);
        etNoTelp = (EditText) findViewById(R.id.etNoTelp);
        etJenisKelamin = (EditText) findViewById(R.id.etJenisKelamin);
        btKirim = (Button) findViewById(R.id.btKirim);

        builder = new AlertDialog.Builder(this);

        btKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final String NamaLengkap, ALamat, NoTelp, JenisKelamin;

                NamaLengkap = etNamaLengkap.getText().toString();
                ALamat = etAlamat.getText().toString();
                NoTelp = etNoTelp.getText().toString();
                JenisKelamin = etJenisKelamin.getText().toString();

                //Toast.makeText(PutExtrasActivity.this, , Toast.LENGTH_SHORT).show();
                builder
                        .setTitle("Informasi Inputan")
                        .setMessage("Nama Lengkap : " + NamaLengkap + "\n" +
                                "Alamat : " + ALamat + "\n" +
                                "No Telp : " + NoTelp + "\n" +
                                "Jenis Kelamin : " + JenisKelamin)
                        .setPositiveButton("Kirim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
    }
}
