package com.example.brokerapp1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.PopupMenu;

public class MandatesActivity extends DrawerMenuActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentLayout(R.layout.activity_mandates);

        if (navigationView != null) {
            navigationView.setCheckedItem(R.id.nav_mandates);
        }

        // Burger
        View menu = findViewById(R.id.menu_button);
        if (menu != null) menu.setOnClickListener(v -> openDrawer());

        // Bind Type (TextViews styled like "Price")
        bindTypePopup((TextView) findViewById(R.id.tv_type_1));
        bindTypePopup((TextView) findViewById(R.id.tv_type_2));
        bindTypePopup((TextView) findViewById(R.id.tv_type_3));

        // Bind Signed (TextViews styled like "Price")
        bindSignedPopup((TextView) findViewById(R.id.tv_signed_1));
        bindSignedPopup((TextView) findViewById(R.id.tv_signed_2));
        bindSignedPopup((TextView) findViewById(R.id.tv_signed_3));
    }

    private void bindTypePopup(final TextView tv) {
        if (tv == null) return;
        tv.setOnClickListener(v -> {
            PopupMenu pm = new PopupMenu(this, v);
            pm.getMenu().add("For Sale");
            pm.getMenu().add("For Rent");
            pm.setOnMenuItemClickListener(item -> {
                tv.setText("Type: " + item.getTitle());
                return true;
            });
            pm.show();
        });
    }

    private void bindSignedPopup(final TextView tv) {
        if (tv == null) return;
        tv.setOnClickListener(v -> {
            PopupMenu pm = new PopupMenu(this, v);
            pm.getMenu().add("Yes");
            pm.getMenu().add("No");
            pm.setOnMenuItemClickListener(item -> {
                tv.setText("Signed: " + item.getTitle());
                return true;
            });
            pm.show();
        });
    }
}
