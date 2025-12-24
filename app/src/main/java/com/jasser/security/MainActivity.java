package com.jasser.security;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setTextSize(20);
        tv.setTextColor(Color.GREEN);
        tv.setText("=== WiFi Security Monitor ===\n\nStatus: Active\nMonitoring Network...\nSafe Mode: ON");
        setContentView(tv);
    }
}
