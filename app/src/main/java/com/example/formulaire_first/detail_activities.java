package com.example.formulaire_first;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class detail_activities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_activities);

        TextView txtFullName = findViewById(R.id.txtFullName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtPhone = findViewById(R.id.txtPhone);
        TextView txtAddress = findViewById(R.id.txtAddress);
        TextView txtCity = findViewById(R.id.txtCity);

        Intent intent = getIntent();
        if (intent != null) {
            txtFullName.setText("Nom : " + intent.getStringExtra("FULL_NAME"));
            txtEmail.setText("Email : " + intent.getStringExtra("EMAIL"));
            txtPhone.setText("Phone : " + intent.getStringExtra("PHONE"));
            txtAddress.setText("Adresse : " + intent.getStringExtra("ADDRESS"));
            txtCity.setText("Ville : " + intent.getStringExtra("CITY"));
        }
    }
}