package com.dicoding.picodiploma.kioscupang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_NAME = "NamaCupang";
    public static final String EXTRA_DETAIL = "DetailCupang";
    public static final String EXTRA_HARGA = "HargaCupang";
    public static final String EXTRA_DIAL = "NoDial";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView imgPhoto;
        TextView tvnama,tvdetail,tvharga,tvpos;
        Button btnklik;
        imgPhoto = findViewById(R.id.img_ikan_cupang);
        tvnama = findViewById(R.id.img_ikan_name);
        tvdetail = findViewById(R.id.img_ikan_detail);
        tvharga = findViewById(R.id.img_harga);
        btnklik = findViewById(R.id.btn_dial);

        imgPhoto.setImageResource(getIntent().getIntExtra("photo", 0));

        String nama = getIntent().getStringExtra(EXTRA_NAME);
        tvnama.setText(nama);

        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        tvdetail.setText(detail);
        String harga = getIntent().getStringExtra(EXTRA_HARGA);
        tvharga.setText(harga);

        btnklik.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_dial:
                String phoneNumber = "085708339519";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}