package com.example.brokerapp1.admin;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.brokerapp1.R;

public class FinancialBreakdownActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_breakdown);

        TextView txt = findViewById(R.id.txtFinancial);
        txt.setText("Dummy Sale Breakdown:\n\n" +
                "Sale Price: R1,200,000\n" +
                "Commission: R72,000\n" +
                "VAT: R10,800\n" +
                "Net: R61,200");
    }
}
