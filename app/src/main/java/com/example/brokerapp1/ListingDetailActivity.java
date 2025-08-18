package com.example.brokerapp1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ListingDetailActivity extends DrawerMenuActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentLayout(R.layout.activity_listing_detail);

        // Keep the drawer available on this screen too
        if (navigationView != null) {
            navigationView.setCheckedItem(R.id.nav_listings);
        }
        View menu = findViewById(R.id.menu_button);
        if (menu != null) {
            menu.setOnClickListener(v -> openDrawer());
        }

        // Grab views
        ImageView img = findViewById(R.id.img_main);
        TextView badge = findViewById(R.id.badge_status);
        TextView address = findViewById(R.id.txt_address);
        TextView price = findViewById(R.id.txt_price);
        TextView beds = findViewById(R.id.txt_beds);
        TextView baths = findViewById(R.id.txt_baths);
        TextView area = findViewById(R.id.txt_area);
        TextView desc = findViewById(R.id.txt_description);

        // Read data from the Intent
        int imageResId = getIntent().getIntExtra("imageResId", 0);
        String status = getIntent().getStringExtra("status");
        String addressStr = getIntent().getStringExtra("address");
        String priceStr = getIntent().getStringExtra("price");
        int bedsVal = getIntent().getIntExtra("beds", 0);
        int bathsVal = getIntent().getIntExtra("baths", 0);
        String areaStr = getIntent().getStringExtra("area");
        String descriptionStr = getIntent().getStringExtra("description");

        // Bind
        if (imageResId != 0) img.setImageResource(imageResId);
        if (status != null) badge.setText(status);
        if (addressStr != null) address.setText(addressStr);
        if (priceStr != null) price.setText(priceStr);
        beds.setText(bedsVal > 0 ? bedsVal + " Beds" : "Beds");
        baths.setText(bathsVal > 0 ? bathsVal + " Baths" : "Baths");
        if (areaStr != null) area.setText(areaStr);
        if (descriptionStr != null) desc.setText(descriptionStr);
    }
}
