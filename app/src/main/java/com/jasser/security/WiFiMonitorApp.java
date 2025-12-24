package com.jasser.security;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class WiFiMonitorApp {
    private static final Map<String, String> WHITELIST = new HashMap<>();

    static {
        // قائمة الأجهزة الموثوقة (مثال)
        WHITELIST.put("00:1A:2B:3C:4D:5E", "Main Router");
        WHITELIST.put("A1:B2:C3:D4:E5:F6", "Jasser Phone");
    }

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("   WiFi Security Monitor - v1.0.0     ");
        System.out.println("   Status: ACTIVE (Cloud Protected)   ");
        System.out.println("======================================");
        
        checkNetworkHealth();
    }

    public static void checkNetworkHealth() {
        System.out.println("[*] Time: " + LocalDateTime.now());
        System.out.println("[*] Scanning for ARP anomalies...");
        
        // محاكاة كشف الأجهزة
        String detectedMac = "FF:EE:DD:CC:BB:AA"; // جهاز تخيلي مكتشف
        
        if (WHITELIST.containsKey(detectedMac)) {
            System.out.println("[OK] Trusted Device: " + WHITELIST.get(detectedMac));
        } else {
            System.out.println("[!!!] ALERT: Stranger Detected!");
            System.out.println("[!] MAC Address: " + detectedMac);
            System.out.println("[!] Action: Logging to secure_log.txt");
        }

        // كشف هجوم MITM (محاكاة)
        boolean mitmDetected = false; 
        if (mitmDetected) {
            System.out.println("[DANGER] ARP Spoofing/MITM Attempt Detected!");
        } else {
            System.out.println("[SAFE] Gateway MAC is stable.");
        }
    }
}
