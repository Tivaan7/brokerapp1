package com.example.brokerapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class ListingsActivity extends DrawerMenuActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentLayout(R.layout.activity_listings);

        if (navigationView != null) {
            navigationView.setCheckedItem(R.id.nav_listings);
        }

        View menu = findViewById(R.id.menu_button);
        if (menu != null) {
            menu.setOnClickListener(v -> openDrawer());
        }

        // --- Card taps open the shared detail screen with data passed via Intent ---

        View card1 = findViewById(R.id.card_listing_1);
        if (card1 != null) {
            card1.setOnClickListener(v -> {
                Intent i = new Intent(this, ListingDetailActivity.class);
                i.putExtra("imageResId", R.drawable.remax);
                i.putExtra("status", "For Sale");
                i.putExtra("address", "123 Main St, Sandton");
                i.putExtra("price", "R 2 950 000");
                i.putExtra("beds", 3);
                i.putExtra("baths", 2);
                i.putExtra("area", "180 m²");
                i.putExtra("description",
                        "A modern family home in the heart of Sandton. "
                                + "Open-plan living spaces flow onto a covered patio and private garden. "
                                + "Well-appointed kitchen with stone counters, separate scullery, and gas hob. "
                                + "Main bedroom is en-suite with walk-in closet. Double automated garage, "
                                + "24/7 access control in a sought-after estate close to top schools and shopping.");
                startActivity(i);
            });
        }

        View card2 = findViewById(R.id.card_listing_2);
        if (card2 != null) {
            card2.setOnClickListener(v -> {
                Intent i = new Intent(this, ListingDetailActivity.class);
                i.putExtra("imageResId", R.drawable.remax1);
                i.putExtra("status", "In Progress");
                i.putExtra("address", "45 Park Lane, Sandton");
                i.putExtra("price", "R 3 450 000");
                i.putExtra("beds", 4);
                i.putExtra("baths", 3);
                i.putExtra("area", "220 m²");
                i.putExtra("description",
                        "Executive double-storey with light-filled interiors and high ceilings. "
                                + "Chef’s kitchen, breakfast island, and stacking doors to a manicured yard. "
                                + "Guest suite downstairs; three bedrooms upstairs including a luxurious main suite "
                                + "with balcony views. Staff quarters, inverter-ready, and excellent security.");
                startActivity(i);
            });
        }
    }
}
