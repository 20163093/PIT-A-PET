package com.kmu.pitapet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        final EditText editText = (EditText)findViewById(R.id.nameText);
        final String nameStr = editText.getText().toString();

        Button nextButton = (Button)findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nameStr.getBytes().length <= 0) {
                    Toast.makeText(NameActivity.this, "이름을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(NameActivity.this, AnimalSelectActivity.class);
                    intent.putExtra("user_name", editText.getText().toString());

                    startActivity(intent);
                }

            }
        });
    }
}
