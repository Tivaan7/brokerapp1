package com.example.brokerapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class DrawerMenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    // Changed to protected so child activities can access them
    protected DrawerLayout drawer;
    protected NavigationView navigationView; // renamed from navView -> navigationView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_menu);

        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(this);
        }
    }

    /** Inject child screen layout into the drawer shell */
    protected void setContentLayout(@LayoutRes int layoutResId) {
        FrameLayout contentFrame = findViewById(R.id.content_frame);
        if (contentFrame != null) {
            contentFrame.removeAllViews();
            LayoutInflater.from(this).inflate(layoutResId, contentFrame, true);
        }
    }

    /** Allow child screens to open/close the drawer */
    protected void openDrawer() { if (drawer != null) drawer.openDrawer(GravityCompat.START); }
    protected void closeDrawer() { if (drawer != null) drawer.closeDrawer(GravityCompat.START); }

    @Override

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_dashboard && !(this instanceof DashboardActivity)) {
            startActivity(new Intent(this, DashboardActivity.class));
        } else if (id == R.id.nav_enquiries && !(this instanceof EnquiriesActivity)) {
            startActivity(new Intent(this, EnquiriesActivity.class));
        } else if (id == R.id.nav_mandates && !(this instanceof MandatesActivity)) {
            startActivity(new Intent(this, MandatesActivity.class));
        } else if (id == R.id.nav_listings && !(this instanceof ListingsActivity)) {
            startActivity(new Intent(this, ListingsActivity.class));
        }
        closeDrawer();
        return true;
    }


    @Override
    public void onBackPressed() {
        if (drawer != null && drawer.isDrawerOpen(GravityCompat.START)) closeDrawer();
        else super.onBackPressed();
    }
}
