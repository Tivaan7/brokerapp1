package com.example.brokerapp1.admin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.brokerapp1.R;

public class AdminDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        // Step 3: Wire up all buttons here
        Button btnFinancial = findViewById(R.id.btnFinancial);
        Button btnMandates = findViewById(R.id.btnMandates);
        Button btnListings = findViewById(R.id.btnListings);
        Button btnAgents = findViewById(R.id.btnAgents);
        Button btnResetPassword = findViewById(R.id.btnResetPassword);
        Button btnEnquiries = findViewById(R.id.btnEnquiries);

        btnFinancial.setOnClickListener(v ->
                startActivity(new Intent(AdminDashboardActivity.this, FinancialBreakdownActivity.class)));

        btnMandates.setOnClickListener(v ->
                startActivity(new Intent(AdminDashboardActivity.this, AdminMandatesActivity.class)));

        btnListings.setOnClickListener(v ->
                startActivity(new Intent(AdminDashboardActivity.this, ListingsActivity.class)));

        btnAgents.setOnClickListener(v ->
                startActivity(new Intent(AdminDashboardActivity.this, ManageAgentsActivity.class)));

        btnResetPassword.setOnClickListener(v ->
                startActivity(new Intent(AdminDashboardActivity.this, ResetPasswordActivity.class)));

        btnEnquiries.setOnClickListener(v ->
                startActivity(new Intent(AdminDashboardActivity.this, EnquiriesActivity.class)));
    }
}
