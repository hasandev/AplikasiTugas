package alhasan.com.tugasujianptssemester2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Soal_4Activity extends AppCompatActivity {

    EditText etxIsiData;
    Button btnKirim1Data;
    @BindView(R.id.etIsiData)
    EditText etIsiData;
    @BindView(R.id.btKirim1Data)
    Button btKirim1Data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_4);
        ButterKnife.bind(this);

        etxIsiData = (EditText) findViewById(R.id.etIsiData);
        btnKirim1Data = (Button) findViewById(R.id.btKirim1Data);

        btnKirim1Data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tampung_isian = etxIsiData.getText().toString();

                Intent PutExtraToSecond = new Intent(Soal_4Activity.this, Soal_6_SecondActivity.class);
                PutExtraToSecond.putExtra("Imputan", tampung_isian);
                startActivity(PutExtraToSecond);
                finish();
            }
        });
    }
}
