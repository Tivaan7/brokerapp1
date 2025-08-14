package com.example.brokerapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class DashboardActivity extends DrawerMenuActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Use the dashboard layout inside the drawer container
        setContentLayout(R.layout.activity_dashboard);

        // Optional: highlight Dashboard in the drawer if you have such a menu id
        if (navigationView != null) {
            navigationView.setCheckedItem(R.id.nav_dashboard);
        }

        // Hook up the card click -> OTP detail screen
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
        View enquiriesCard = findViewById(R.id.card_enquiries);
        if (enquiriesCard != null) {
            enquiriesCard.setOnClickListener(v ->
                    startActivity(new Intent(DashboardActivity.this, EnquiriesActivity.class))
            );
        }


        // If your dashboard has the burger/menu button in the toolbar area:
        View menu = findViewById(R.id.menu_button);
        if (menu != null) {
            menu.setOnClickListener(v -> openDrawer());
        }
    }
}
