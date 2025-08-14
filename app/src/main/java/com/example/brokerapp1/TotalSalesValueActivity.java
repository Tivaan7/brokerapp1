package com.example.brokerapp1;

import android.os.Bundle;
import androidx.annotation.Nullable;

public class TotalSalesValueActivity extends DrawerMenuActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the screen content into the drawer container
        setContentLayout(R.layout.activity_total_sales_value);

        // Optional: highlight a drawer item if you have one
        if (navigationView != null) {
            // navigationView.setCheckedItem(R.id.nav_sales_value);
        }

        // Wire the burger menu if your layout has a menu button
        if (findViewById(R.id.menu_button) != null) {
            findViewById(R.id.menu_button).setOnClickListener(v -> openDrawer());
        }
    }
}
