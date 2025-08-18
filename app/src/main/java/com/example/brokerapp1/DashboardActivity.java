package com.example.brokerapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class DashboardActivity extends DrawerMenuActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the dashboard content inside the shared drawer host
        setContentLayout(R.layout.activity_dashboard);

        // Highlight this screen in the drawer (ensure this id exists in your menu)
        if (navigationView != null) {
            navigationView.setCheckedItem(R.id.nav_dashboard);
        }

        // ---- Wire up burger (menu) button to open the drawer ----
        View menu = findViewById(R.id.menu_button);
        if (menu != null) {
            menu.setOnClickListener(v -> openDrawer());
        }

        // ---- Card clicks ----
        View otpCard = findViewById(R.id.card_offer_to_purchase);
        if (otpCard != null) {
            otpCard.setOnClickListener(v ->
                    startActivity(new Intent(DashboardActivity.this, OtpDetailActivity.class))
            );
        }

        View salesCard = findViewById(R.id.card_total_sales_value);
        if (salesCard != null) {
            salesCard.setOnClickListener(v ->
                    startActivity(new Intent(DashboardActivity.this, TotalSalesValueActivity.class))
            );
        }



    }
}
