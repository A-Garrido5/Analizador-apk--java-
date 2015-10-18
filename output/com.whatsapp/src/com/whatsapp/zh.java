// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.aa;
import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;
import android.location.Location;
import android.view.View;
import android.view.View$OnClickListener;

class zh implements View$OnClickListener
{
    private static final String z;
    final LocationPicker2 a;
    
    static {
        final char[] charArray = "\bgZ\u0019,\rgW".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'X';
                    break;
                }
                case 0: {
                    c2 = 'd';
                    break;
                }
                case 1: {
                    c2 = '\b';
                    break;
                }
                case 2: {
                    c2 = '9';
                    break;
                }
                case 3: {
                    c2 = 'x';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    zh(final LocationPicker2 a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (LocationPicker2.y(this.a) != null && LocationPicker2.y(this.a).getAccuracy() > 200.0f) {
            LocationPicker2.a(this.a, (Location)null);
        }
        Label_0104: {
            if (LocationPicker2.t(this.a) != null) {
                App.a((Context)this.a, LocationPicker2.t(this.a), LocationPicker2.y(this.a));
                if (!App.I) {
                    break Label_0104;
                }
            }
            final Intent intent = new Intent();
            intent.putExtra(zh.z, (Parcelable)LocationPicker2.y(this.a));
            this.a.setResult(-1, intent);
        }
        LocationPicker2.a(this.a, aa.CURRENT_LOCATION);
        this.a.finish();
    }
}
