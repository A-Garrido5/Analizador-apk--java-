// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.net.wifi.WifiManager;
import android.view.View;
import android.view.View$OnClickListener;

class nq implements View$OnClickListener
{
    private static final String z;
    final AccountInfoActivity a;
    
    static {
        final char[] charArray = "o\u0013\u0006L".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'S';
                    break;
                }
                case 0: {
                    c2 = '\u0018';
                    break;
                }
                case 1: {
                    c2 = 'z';
                    break;
                }
                case 2: {
                    c2 = '`';
                    break;
                }
                case 3: {
                    c2 = '%';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    nq(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        if (!AccountInfoActivity.k(this.a)) {
            final WifiManager wifiManager = (WifiManager)this.a.getSystemService(nq.z);
            if (wifiManager == null || wifiManager.isWifiEnabled()) {}
            if (AccountInfoActivity.n(this.a)) {
                AccountInfoActivity.a(this.a, AccountInfoActivity.i(this.a), new zu(this));
                if (!i) {
                    return;
                }
            }
            if (AccountInfoActivity.l(this.a)) {
                AccountInfoActivity.g(this.a);
                if (!i) {
                    return;
                }
            }
            this.a.showDialog(8);
        }
    }
}
