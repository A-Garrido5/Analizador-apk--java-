// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Parcelable;
import android.content.Intent;
import android.location.Location;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;

class q0 implements View$OnClickListener
{
    private static final String z;
    final LocationPicker a;
    
    static {
        final char[] charArray = "'),\u0003\u0001\")!".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'u';
                    break;
                }
                case 0: {
                    c2 = 'K';
                    break;
                }
                case 1: {
                    c2 = 'F';
                    break;
                }
                case 2: {
                    c2 = 'O';
                    break;
                }
                case 3: {
                    c2 = 'b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    q0(final LocationPicker a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Object lastFix = LocationPicker.n(this.a).getLastFix();
        if (lastFix != null && ((Location)lastFix).getAccuracy() > 200.0f) {
            lastFix = null;
        }
        Label_0084: {
            if (LocationPicker.f(this.a) != null) {
                App.a((Context)this.a, LocationPicker.f(this.a), (Location)lastFix);
                if (!App.I) {
                    break Label_0084;
                }
            }
            final Intent intent = new Intent();
            intent.putExtra(q0.z, (Parcelable)lastFix);
            this.a.setResult(-1, intent);
        }
        this.a.finish();
    }
}
