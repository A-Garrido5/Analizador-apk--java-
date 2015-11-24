// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.net.wifi.WifiManager;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class s_ implements DialogInterface$OnClickListener
{
    private static final String z;
    final AccountInfoActivity a;
    
    static {
        final char[] charArray = "^s,|".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0001';
                    break;
                }
                case 0: {
                    c2 = ')';
                    break;
                }
                case 1: {
                    c2 = '\u001a';
                    break;
                }
                case 2: {
                    c2 = 'J';
                    break;
                }
                case 3: {
                    c2 = '\u0015';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    s_(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(7);
        switch (n) {
            case -1: {
                final WifiManager wifiManager = (WifiManager)this.a.getSystemService(s_.z);
                if (wifiManager == null) {
                    break;
                }
                wifiManager.setWifiEnabled(false);
                if (App.I) {
                    break;
                }
                break;
            }
        }
        AccountInfoActivity.g(this.a);
    }
}
