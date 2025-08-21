package com.example.brokerapp1.admin;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.brokerapp1.R;

public class ResetPasswordActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        TextView txt = findViewById(R.id.txtReset);
        txt.setText("Reset Agent Password\n\nDummy screen for password reset functionality.");
    }
}
