package com.example.eva1_2_layouts;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtNomb, edtTxtApell, edtTxtEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTxtNomb = findViewById(R.id.edtTxtNomb);
        edtTxtApell = findViewById(R.id.edtTxtApell);
        edtTxtEd= findViewById(R.id.edtTxtEd);

        edtTxtApell.setText("hola Mmndo");
    }
}
