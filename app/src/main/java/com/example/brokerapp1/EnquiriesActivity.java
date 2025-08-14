package com.example.brokerapp1;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class EnquiriesActivity extends DrawerMenuActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   // <-- this will compile if the name matches and Bundle is imported

        setContentLayout(R.layout.activity_enquiries);

        if (navigationView != null) {
            navigationView.setCheckedItem(R.id.nav_enquiries);
        }

        View menu = findViewById(R.id.menu_button);
        if (menu != null) {
            menu.setOnClickListener(v -> openDrawer());
        }
    }
}
