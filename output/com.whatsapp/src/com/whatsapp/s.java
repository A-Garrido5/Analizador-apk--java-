// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import com.whatsapp.util.bm;
import com.whatsapp.util.Log;
import android.location.Location;
import android.location.LocationListener;

final class s implements LocationListener
{
    private static final String z;
    final nl a;
    final ho b;
    
    static {
        final char[] charArray = "(\u0010]]q*\u000bAV-5\rMYv0\r@\u0017a1\u0003@_g=B".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0002';
                    break;
                }
                case 0: {
                    c2 = 'Y';
                    break;
                }
                case 1: {
                    c2 = 'b';
                    break;
                }
                case 2: {
                    c2 = '.';
                    break;
                }
                case 3: {
                    c2 = '8';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    s(final nl a, final ho b) {
        this.a = a;
        this.b = b;
    }
    
    public void onLocationChanged(final Location location) {
        if (location != null) {
            Log.i(s.z + location.getTime() + " " + location.getAccuracy());
            bm.a(new zx(this.a, location));
            this.b.a((LocationListener)this);
        }
    }
    
    public void onProviderDisabled(final String s) {
    }
    
    public void onProviderEnabled(final String s) {
    }
    
    public void onStatusChanged(final String s, final int n, final Bundle bundle) {
    }
}
