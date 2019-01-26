package com.kmu.pitapet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView nameText = (TextView) findViewById(R.id.nameText);
        TextView animalText = (TextView) findViewById(R.id.animalText);
        EditText petNameText = (EditText)findViewById(R.id.petNameText);
        EditText birthText = (EditText)findViewById(R.id.birthText);
        EditText speciesText = (EditText)findViewById(R.id.speciesText);

        final String petNameStr = petNameText.getText().toString();
        final String birthStr = birthText.getText().toString();
        final String speciesStr = speciesText.getText().toString();

        Button button = (Button)findViewById(R.id.completeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(petNameStr.getBytes().length <= 0) {
                    Toast.makeText(InfoActivity.this, "이름을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if(birthStr.getBytes().length <= 0) {
                    Toast.makeText(InfoActivity.this, "생일을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if(speciesStr.getBytes().length <= 0) {
                    Toast.makeText(InfoActivity.this, "종을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), LoadingActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
