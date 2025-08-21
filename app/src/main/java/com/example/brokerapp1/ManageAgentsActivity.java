package com.example.brokerapp1.admin;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.brokerapp1.R;

public class ManageAgentsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_agents);

        TextView txt = findViewById(R.id.txtAgents);
        txt.setText("Manage Agents\n\n- Add Agent\n- Remove Agent\n- Update Agent Profile");
    }
}
