// app/src/main/java/com/example/brokerapp1/DashboardActivity.java
package com.example.brokerapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends DrawerMenuActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentLayout(R.layout.activity_dashboard);

        // Highlight the current item (optional)
        if (navigationView != null) {
            navigationView.setCheckedItem(R.id.nav_dashboard);
        }

// Wire burger to open the drawer
        View menuBtn = findViewById(R.id.menu_button);
        if (menuBtn != null) {
            menuBtn.setOnClickListener(v -> openDrawer());
        }

    }
}
